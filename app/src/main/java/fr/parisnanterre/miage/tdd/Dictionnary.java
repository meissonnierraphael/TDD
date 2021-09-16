package fr.parisnanterre.miage.tdd;

import java.util.HashMap;
import java.util.Map;

public class Dictionnary {

    private String name;
    private Map<String,String> translations;

    public Dictionnary(String mot){
        this.name=mot;
        this.translations=new HashMap<>();
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
        translations.put(s1, s2);
    }


}
