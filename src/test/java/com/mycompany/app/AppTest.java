package com.mycompany.app;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;
import java.util.ArrayList;
import java.util.Arrays;
/**
 * Unit test for simple App.
 */
public class AppTest 
    extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public AppTest( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( AppTest.class );
    }

    /**
     * Rigourous Test :-)
     */
    public void testApp()
    {
        assertTrue( true );
    }
 public void testFound() {
     ArrayList<String> array = new ArrayList<>(Arrays.asList("Ahmet", "Mehmet", "Veli", "Cansın"));
      assertTrue(new App().search(array,"Mehmet", 1));
    }

    public void testNotFound() {
        ArrayList<String> array = new ArrayList<>(Arrays.asList("Ahmet", "Mehmet", "Veli", "Cansın"));
      assertFalse(new App().search(array, "Batuhan",1));
    }
    public void testNotEnoughWordFound() {
        ArrayList<String> array = new ArrayList<>(Arrays.asList("Ahmet", "Mehmet", "Veli", "Cansın"));
      assertFalse(new App().search(array, "Mehmet",2));
    }

    public void testEmptyArray() {
      ArrayList<String> array = new ArrayList<>();
      assertFalse(new App().search(array,"Ahmet",1));
    }

    public void testNull() {
      assertFalse(new App().search(null, "Ahmet",1));
    }

}

