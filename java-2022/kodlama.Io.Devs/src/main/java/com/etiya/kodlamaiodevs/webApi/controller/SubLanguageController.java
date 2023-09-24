package com.etiya.kodlamaiodevs.webApi.controller;

import com.etiya.kodlamaiodevs.business.abstracts.SubLanguageService;
import com.etiya.kodlamaiodevs.entities.concretes.subLanguages.SubLanguage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/languages/sublanguages")
public class SubLanguageController {
    private SubLanguageService subLanguageService;

    @Autowired
    public SubLanguageController(SubLanguageService subLanguageService) {
        this.subLanguageService = subLanguageService;
    }

    @PutMapping("/sublanguages/{id}")
    void update(@RequestBody SubLanguage subLanguage, @PathVariable int id) {
        subLanguageService.update(subLanguage, id );
    }

    @PostMapping ("/sublanguages")
    void add(@RequestBody SubLanguage subLanguage) {
        subLanguageService.add(subLanguage);
    }

    @GetMapping("/sublanguages/{id}")
    SubLanguage getById(@PathVariable int id) {
        return subLanguageService.getById(id);
    }

    @DeleteMapping("/sublanguages/{id}")
    void deleteById(@PathVariable int id) {
        subLanguageService.delete(id);
    }

}
