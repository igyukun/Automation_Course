package class6_hw;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.testng.Assert;


public class Question5_2 {
    private int x;
    private int y;

    @Before
    public void initVars(){
        //Initialize the variables
        x = 1;
        y = 2;
        System.out.println("JUnit version:\n");
    }

    @Test
    public void testCase1(){
        //Inequality assertion with a customized message
        Assert.assertNotEquals(x, y, "Assertion screwed up. ");
    }

    @After
    public void finalizeClass(){
        //Print out the current variables' values at the end of the class
        System.out.println(String.format("x = %d, y = %d", x,y));
    }
}
