package com.etiya.kodlamaiodevs.business.concretes;

import com.etiya.kodlamaiodevs.business.abstracts.SubLanguageService;
import com.etiya.kodlamaiodevs.dataAccess.abstracts.SubLanguageRepository;
import com.etiya.kodlamaiodevs.entities.concretes.subLanguages.SubLanguage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SubLanguageManager implements SubLanguageService {

    SubLanguageRepository subLanguageRepository;

    @Autowired
    public SubLanguageManager(SubLanguageRepository subLanguageRepository) {
        this.subLanguageRepository = subLanguageRepository;
    }


    @Override
    public List<SubLanguage> getAll() {
        return subLanguageRepository.getAll();
    }

    @Override
    public void add(SubLanguage subLanguage) {
        for (SubLanguage subLanguage1: subLanguageRepository.getAll()){
            if (!subLanguage.getSubLanguageName().isEmpty()&&!(subLanguage1.getSubLanguageName()==subLanguage.getSubLanguageName()) ){
                subLanguageRepository.add(subLanguage);
                System.out.println("Alt Dil eklendi: " + subLanguage.getSubLanguageName());
                break;
            }
            else
                System.out.println("Hata: Alt Dil ismi boş veya aynı isimde kayıt var!");
        }
    }

    @Override
    public void delete(int id) {
        for (SubLanguage subLanguage:subLanguageRepository.getAll()){
            if (id==subLanguage.getSubLanguageId()){
                subLanguageRepository.delete(subLanguage);
                System.out.println("Alt Dil silindi: " + subLanguage.getSubLanguageName());
                break;
            }
            else
                System.out.println("Alt Dil bulunamadı!");
        }
    }

    @Override
    public void update(SubLanguage subLanguage, int id) {
        for (SubLanguage subLanguage1:subLanguageRepository.getAll()){
            if (id==subLanguage1.getSubLanguageId()){
                subLanguageRepository.update(id,subLanguage);
                System.out.println("Dil güncellendi: " + subLanguage.getSubLanguageName());
                break;
            }
            else
                System.out.println("Dil bulunamadı!");
        }
    }

    @Override
    public SubLanguage getById(int id) {
        for (SubLanguage subLanguage: subLanguageRepository.getAll()){
            if (subLanguage.getSubLanguageId()==id){
                return subLanguage;

            }else
                System.out.println(id + ": id'li kayıt bulunamadı.");
        }
        return null;
    }
}
