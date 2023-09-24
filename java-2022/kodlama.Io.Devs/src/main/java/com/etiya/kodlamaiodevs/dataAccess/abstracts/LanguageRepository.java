package com.etiya.kodlamaiodevs.dataAccess.abstracts;

import com.etiya.kodlamaiodevs.entities.concretes.Language;

import java.util.List;

public interface LanguageRepository {

    List<Language> getAll();
    void add(Language language);
    void delete(Language language);
    void update(int id, Language language);
    Language getById(int id);
}
