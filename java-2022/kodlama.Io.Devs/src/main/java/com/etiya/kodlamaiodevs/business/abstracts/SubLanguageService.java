package com.etiya.kodlamaiodevs.business.abstracts;

import com.etiya.kodlamaiodevs.entities.concretes.Language;
import com.etiya.kodlamaiodevs.entities.concretes.subLanguages.SubLanguage;

import java.util.List;

public interface SubLanguageService {
    public List<SubLanguage> getAll();
    public void add(SubLanguage subLanguage);
    public void delete(int id);
    public void update(SubLanguage subLanguage, int id);
    SubLanguage getById(int id);
}
