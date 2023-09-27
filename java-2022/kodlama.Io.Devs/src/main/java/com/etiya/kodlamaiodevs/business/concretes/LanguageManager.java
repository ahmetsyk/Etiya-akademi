package com.etiya.kodlamaiodevs.business.concretes;

import com.etiya.kodlamaiodevs.business.abstracts.LanguageService;
import com.etiya.kodlamaiodevs.business.requests.CreateLanguageRequest;
import com.etiya.kodlamaiodevs.dataAccess.abstracts.LanguageRepository;
import com.etiya.kodlamaiodevs.entities.concretes.Language;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LanguageManager implements LanguageService {
    LanguageRepository languageRepository;

    @Autowired
    public LanguageManager(LanguageRepository languageRepository) {
        this.languageRepository = languageRepository;
    }

    @Override
    public List<Language> getAll(){
        return languageRepository.getAll();
    }

    @Override
    public void add(Language language){
        for (Language language1: languageRepository.getAll()){
            if (!language.getLanguageName().isEmpty()&&!(language1.getLanguageName()==language.getLanguageName()) ){
                languageRepository.add(language);
                System.out.println("Dil eklendi: " + language.getLanguageName());
                break;
            }
            else
                System.out.println("Hata: Dil ismi boş veya aynı isimde kayıt var!");
        }
    }

    @Override
    public void delete(int id){
        for (Language language1:languageRepository.getAll()){
            if (id==language1.getLanguageId()){
                languageRepository.delete(language1);
                System.out.println("Dil silindi: " + language1.getLanguageName());
                break;
            }
            else
                System.out.println("Dil bulunamadı!");
        }
    }

    @Override
    public void update(Language language , int id){
        for (Language language1:languageRepository.getAll()){
            if (id==language1.getLanguageId()){
                languageRepository.update(id,language);
                System.out.println("Dil güncellendi: " + language.getLanguageName());
                break;
            }
            else
                System.out.println("Dil bulunamadı!");
        }
    }

    @Override
    public Language getById(int id){
        for (Language language: languageRepository.getAll()){
            if (language.getLanguageId()==id){
                return language;

            }else
                System.out.println(id + ": id'li kayıt bulunamadı.");
        }
        return null;
    }

}
