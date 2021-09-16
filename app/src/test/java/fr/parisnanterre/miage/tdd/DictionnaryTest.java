package fr.parisnanterre.miage.tdd;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;


public class DictionnaryTest {

    private Dictionnary dict;

    @Before
    public void Initilize(){
        this.dict= new Dictionnary("Example");
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
    }

    @Test public void testAnotherTranslation(){
        dict.addTranslation("marcher","run");
        assertThat(dict.getTranslation("marcher"),equalTo("run"));
    }

}
