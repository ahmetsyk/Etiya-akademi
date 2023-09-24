package com.etiya.kodlamaiodevs.dataAccess.concretes;

import com.etiya.kodlamaiodevs.dataAccess.abstracts.SubLanguageRepository;
import com.etiya.kodlamaiodevs.entities.concretes.subLanguages.SubLanguage;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class InMemorySubLanguageRepository implements SubLanguageRepository {

    List<SubLanguage> subLanguages;

    public InMemorySubLanguageRepository() {
        subLanguages = new ArrayList<>();
        subLanguages.add(new SubLanguage(1,"Spring",1));
        subLanguages.add(new SubLanguage(2,"ASP.NET",2));
        subLanguages.add(new SubLanguage(3,"React",3));
    }

    @Override
    public List<SubLanguage> getAll() {
        return subLanguages;
    }

    @Override
    public void add(SubLanguage subLanguage) {
        subLanguages.add(subLanguage);
    }

    @Override
    public void delete(SubLanguage subLanguage) {
        subLanguages.remove(subLanguage);
    }

    @Override
    public void update(int id, SubLanguage subLanguage) {
        subLanguages.set(id,subLanguage);
    }

    @Override
    public SubLanguage getById(int id) {
        for (SubLanguage subLanguage:subLanguages){
            if (id==subLanguage.getSubLanguageId()){
                return subLanguage;
            }
        }
        return null;
    }
}
