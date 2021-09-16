package fr.parisnanterre.miage.tdd;

import org.junit.Test;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;


public class DictionnaryTest {

    private Dictionnary dict;

    public DictionnaryTest(){
        this.dict= new Dictionnary();
    }

    @Test public void testDictionnaryName(){
        assertThat(dict.getName(),equalTo("against"));
    }

    @Test public void testDictionnaryIsEmpty(){
        assertThat(dict.isEmpty(),equalTo(false));
    }

    @Test public void testOneTranslation(){
        dict.addTranslation("contre","against");
        assertThat(dict.getTranslation("contre"),equalTo("against"));
        assertThat(dict.getTranslation("contre"),equalTo("never"));
    }
}
