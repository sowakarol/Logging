package pl.edu.agh.kis;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by karl on 11/29/16.
 */
public class LogTest {
    @Test
    public void checkIfValuesAfterUsingConstructorAreGood(){
        Log test = new Log("INFO", new String[]{});
        assertEquals(test.getValue(),20);
    }

    @Test
    public void checkIfValuesAfterUsingDefaultConstructorAreGood(){
        Log test = new Log("", new String[]{});
        assertEquals(test.getValue(),0);
    }

}