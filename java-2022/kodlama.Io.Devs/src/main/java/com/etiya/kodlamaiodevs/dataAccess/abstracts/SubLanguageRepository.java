package com.etiya.kodlamaiodevs.dataAccess.abstracts;

import com.etiya.kodlamaiodevs.entities.concretes.Language;
import com.etiya.kodlamaiodevs.entities.concretes.subLanguages.SubLanguage;

import java.util.List;

public interface SubLanguageRepository {
    List<SubLanguage> getAll();
    void add(SubLanguage subLanguage);
    void delete(SubLanguage subLanguage);
    void update(int id, SubLanguage subLanguage);
    SubLanguage getById(int id);
}
