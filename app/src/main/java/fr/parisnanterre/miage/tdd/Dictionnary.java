package fr.parisnanterre.miage.tdd;

import java.util.*;

public class Dictionnary {

    private String name;
    private Map<String, String> translations;
    private Map<String, List<String>> multipleTranslations;

    public Dictionnary(String mot){
        this.name=mot;
        this.translations=new HashMap<>();
        this.multipleTranslations=new HashMap<>();
    }

    public String getName(){
        return this.name;
    }

    public void setName(String parName){
        this.name=parName;
    }

    public boolean isEmpty(){
        if(this.translations.isEmpty()){
            return true;
        }
        else{
            return false;
        }
    }

    public String getTranslation(String s1){

        return translations.get(s1);
    }

    public void addTranslation(String s1, String s2){

        translations.put(s1,s2);
    }

    public void addMultipleTranslation(String s1,List<String> s2){
        this.multipleTranslations.put(s1,s2);
    }


    public String getTranslationInverse(String s1) {
        if (this.translations.containsKey(s1)){
            return this.translations.get(s1);
        }
        else{
            if(this.translations.containsValue(s1)){
                for(Map.Entry<String,String> entree : this.translations.entrySet()){
                    if (s1.equals(entree.getValue())){
                        return entree.getKey();
                    }
                }
            }
            return null;
        }

    }
}
