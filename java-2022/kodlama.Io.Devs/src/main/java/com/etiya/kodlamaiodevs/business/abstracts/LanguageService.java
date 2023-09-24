package com.etiya.kodlamaiodevs.business.abstracts;

import com.etiya.kodlamaiodevs.dataAccess.abstracts.LanguageRepository;
import com.etiya.kodlamaiodevs.entities.concretes.Language;

import java.util.List;

public interface LanguageService {
    public List<Language> getAll();
    public void add(Language language);
    public void delete(int id);
    public void update(Language language, int id);
    Language getById(int id);
}
