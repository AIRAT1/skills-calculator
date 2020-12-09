package de.skills.test;

import lombok.Data;

import java.util.List;

@Data
public class Test {
    private List<Question> questions;
    private Integer percent;
}
