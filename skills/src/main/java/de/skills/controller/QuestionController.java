package de.skills.controller;

import de.skills.service.QuestionService;
import de.skills.test.Question;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Objects;
import java.util.Optional;

@RestController
@RequestMapping("/questions")
public class QuestionController {
    private final QuestionService service;

    @Autowired
    public QuestionController(QuestionService service) {
        this.service = service;
    }

    @PostMapping
    public ResponseEntity save(@RequestBody Question question) {
        return ResponseEntity.ok(service.save(question));
    }

    @GetMapping("/{id}")
    public ResponseEntity findById(@PathVariable Long id) {
        Optional<Question> byId = service.findById(id);
        return Objects.isNull(byId)
                ? ResponseEntity.notFound().build()
                : ResponseEntity.ok(byId);
    }

    @GetMapping
    public ResponseEntity findAll() {
        return ResponseEntity.ok(service.findAll());
    }
}
