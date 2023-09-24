package com.etiya.kodlamaiodevs.webApi.controller;

import com.etiya.kodlamaiodevs.business.abstracts.LanguageService;
import com.etiya.kodlamaiodevs.entities.concretes.Language;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/languages")
public class LanguageController {
    private LanguageService languageService;

    @Autowired
    public LanguageController(LanguageService languageService) {
        this.languageService = languageService;
    }

    @GetMapping("/getall")
    public List<Language> getAll() {
        return languageService.getAll();
    }

    @PutMapping("/languages/{id}")
    void update(@RequestBody Language language, @PathVariable int id) {
        languageService.update(language, id );
    }

    @PostMapping ("/languages")
    void add(@RequestBody Language language) {
        languageService.add(language);
    }

    @GetMapping("/languages/{id}")
    Language getById(@PathVariable int id) {
        return languageService.getById(id);
    }

    @DeleteMapping("/languages/{id}")
    void deleteById(@PathVariable int id) {
        languageService.delete(id);
    }


}
