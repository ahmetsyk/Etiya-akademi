package com.etiya.kodlamaiodevs.dataAccess.concretes;

import com.etiya.kodlamaiodevs.dataAccess.abstracts.LanguageRepository;
import com.etiya.kodlamaiodevs.entities.concretes.Language;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class InMemoryLanguageRepository implements LanguageRepository {
    List<Language> languages;
    public InMemoryLanguageRepository() {
        languages = new ArrayList<Language>();
        languages.add(new Language(1,"Java"));
        languages.add(new Language(2,"C#"));
        languages.add(new Language(3,"JavaScript"));

    }
    @Override
    public List<Language> getAll() {

        return languages;
    }

    @Override
    public void add(Language language) {
        languages.add(language);
    }

    @Override
    public void delete(Language language) {
        languages.remove(language);
    }

    @Override
    public void update(int id, Language language) {
        languages.set(id, language);
    }

    @Override
    public Language getById(int id) {
        for (Language language:languages){
            if (id==language.getLanguageId()){
                return language;
            }
        }
        return null;
    }
}
