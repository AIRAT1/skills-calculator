package de.skills.domain;

import lombok.Data;

import java.util.List;

@Data
public class Programmer {
    private String name;
    private List<Language> languageList;
    private List<Skill> skillList;
}
