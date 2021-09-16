package fr.parisnanterre.miage.tdd;

public class Dictionnary {

    private String name;

    public Dictionnary(String mot){
        this.name=mot;
    }

    public String getName(){
        return this.name;
    }

    public void setName(String parName){
        this.name=parName;
    }

    public boolean isEmpty(){
        return true;
    }

    public String getTranslation(String s1){
        return "against";
    }

    public void addTranslation(String s1, String s2){}


}
