package oopconcept.chaseBank;

public class ChaseBankApplication {
    public static void main(String[] args) {
        new Menu(); // THis is object of menu

        // data_type name = value

        Language english = new Language();
        english.languageId = 1;
        english.languageName = "English";

        Language nepali = new Language();
        nepali.languageId = 2;
        nepali.languageName = "Nepali";

        Language spanish = new Language();
        spanish.languageId = 3;
        spanish.languageName = "Spanish";

        Menu personalMenu = new Menu(); //This is how you make object of menu
        personalMenu.menuID = 1; //without creating object you cant access the State
        personalMenu.name = "Personal";
        personalMenu.slug = "";
        personalMenu.isExternal = false;
        personalMenu.externalUrl = null;
        personalMenu.isActive = true;
        personalMenu.languageId = english.languageId;

        Menu personalNepali = new Menu();
        personalNepali.menuID = 2;
        personalNepali.name = "Personal NP";
        personalNepali.slug = "";
        personalNepali.isExternal = false;
        personalNepali.externalUrl = null;
        personalNepali.isActive = true;
        personalNepali.languageId = nepali.languageId;


        Menu businessMenu = new Menu();
        Menu commercialMenu = new Menu();
    }
}
