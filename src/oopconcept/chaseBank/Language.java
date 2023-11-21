package oopconcept.chaseBank;

public class Language {

    /*
        language id => int
        language name => string
     */

    private int languageId;
    private String languageName;

    //this = english
    public void setLanguageId(int languageId){
        this.languageId = languageId;
    }


    //this = english/nepali/french
    public int getLanguageId(){
        return this.languageId;
    }

    public String getLanguageName() {
        return this.languageName;// dont really need to write this when returning
                                // just for visual preference now to understand
    }

    public void setLanguageName(String languageName) {
        this.languageName = languageName;
    }
}

    /*
        language id - 1
        language name - English
     */

    /*
        language id - 2
        language name - Nepali
     */

    /*
        language id - 3
        language name - Spanish
     */

