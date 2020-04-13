package eu.filip.java;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertTrue;

import java.beans.Transient;

import org.junit.BeforeClass;
import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    private static App app;
    private static String name;

    /**
     * Rigorous Test :-)
     */

    @BeforeClass
    public static void initiateApp(){
        name = "Filip";
        app = new App(name);

    }
    @Test
    public void appHasCorrectName(){
        assertTrue("App name is Filip", app.GetName() == name);
    }

    
    @Test
    public void shouldAnswerWithTrue()
    {
        assertTrue( true );
    }

    @Test 
    public void oneEqualsTwo(){
        assertEquals("Checking if one equals two", 1, 2);
    }

    @Test
    public void getMaxValue(){
        assertEquals("Get max value",10, app.maxValue(4, 10));
    }
    @Test
    public void pindala(){
        assertEquals("Pindala", 25, app.pindala(5, 5));
    }
    @Test
    public void appsAreEqual(){
        App app1 = new App("Filip");
        App app2 = new App("Filip");

        assertNotEquals(app1, app1);
    }
    @Test
    public void randomTest(){
        assertArrayEquals(new int[] {1,2,3}, app.returnList());
    }
}