package fr.parisnanterre.miage.tdd;

public class Dictionnary {

    private String name;

    public Dictionnary(){
        this.name="Example";
    }

    public String getName(){
        return this.name;
    }

    public void setName(String parName){
        this.name=parName;
    }

}
