package de.skills.service;

import de.skills.repository.QuestionRepository;
import de.skills.test.Question;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class QuestionService {
    private final QuestionRepository repository;

    @Autowired
    public QuestionService(QuestionRepository repository) {
        this.repository = repository;
    }

    public Question save(Question question) {
        return repository.save(question);
    }

    public Optional<Question> findById(Long id) {
        return repository.findById(id);
    }

    public List<Question> findAll() {
        return repository.findAll();
    }
}
