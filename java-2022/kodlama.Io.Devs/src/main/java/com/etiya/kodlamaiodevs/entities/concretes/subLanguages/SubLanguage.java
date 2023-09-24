package com.etiya.kodlamaiodevs.entities.concretes.subLanguages;

public class SubLanguage {
    private int subLanguageId;
    private String subLanguageName;
    private int languageId;

    public SubLanguage() {
    }

    public SubLanguage(int subLanguageId, String subLanguageName, int languageId) {
        this.subLanguageId = subLanguageId;
        this.subLanguageName = subLanguageName;
        this.languageId = languageId;
    }

    public int getSubLanguageId() {
        return subLanguageId;
    }

    public void setSubLanguageId(int subLanguageId) {
        this.subLanguageId = subLanguageId;
    }

    public String getSubLanguageName() {
        return subLanguageName;
    }

    public void setSubLanguageName(String subLanguageName) {
        this.subLanguageName = subLanguageName;
    }

    public int getLanguageId() {
        return languageId;
    }

    public void setLanguageId(int languageId) {
        this.languageId = languageId;
    }
}
