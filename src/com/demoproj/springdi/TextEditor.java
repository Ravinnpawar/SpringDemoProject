package com.demoproj.springdi;

public class TextEditor {

    SpellChecker spellChecker;

    public SpellChecker getSpellChecker() {
        return spellChecker;
    }

    public void setSpellChecker(SpellChecker spellChecker) {
        System.out.println("In SetSpell Check method");
        this.spellChecker = spellChecker;
    }

    public void spellCheck(){
        spellChecker.checkSpelling();
    }
}
