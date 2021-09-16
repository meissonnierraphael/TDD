package fr.parisnanterre.miage.tdd;

import org.hamcrest.Matchers;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;


public class DictionaryTest {

    private Dictionnary dict;
    private List<String> liste;
    private List<String> liste2;

    @Before
    public void Initialize(){
        this.dict= new Dictionnary("contre");
        this.liste=new ArrayList<>();
        this.liste.add("against");
        this.liste.add("versus");
        this.liste2=new ArrayList<>();
        this.liste2.add("versus");
        this.liste2.add("against");

    }

    @Test public void testDictionnaryName(){
        assertThat(dict.getName(),equalTo("contre"));
    }

    @Test public void testDictionnaryIsEmpty(){
        assertThat(dict.isEmpty(),equalTo(true));
    }

    @Test public void testOneTranslation(){
        dict.addTranslation("contre","against");
        assertThat(dict.getTranslation("contre"),equalTo("against"));
    }

    @Test public void testAnotherTranslation(){
        dict.addTranslation("marcher","run");
        assertThat(dict.getTranslation("marcher"),equalTo("run"));
    }

    /*@Test public void testMultipleTranslation(){
        dict.addMultipleTranslation("contre",liste);
        assertThat(dict.getTranslation2("contre"),Matchers.containsInAnyOrder(liste2.toArray()));
    }*/

    @Test public void testInverseTranslation(){
        dict.addTranslation("marcher","run");
        assertThat(dict.getTranslationInverse("run"),equalTo("marcher"));
    }

    @After public void cleanUp(){
        dict=null;
    }

}
