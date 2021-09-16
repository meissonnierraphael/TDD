package fr.parisnanterre.miage.tdd;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;


public class DictionnaryTest {

    private Dictionnary dict;

    @Before
    public void Initialize(){
        this.dict= new Dictionnary("contre");
        
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

    @Test public void testMultipleTranslation(){
        dict.addMultipleTranslation("contre",");
        assertThat(dict.getTranslation("lire"),equalTo("read"));
    }

    @After public void cleanUp(){
        dict=null;
    }

}
