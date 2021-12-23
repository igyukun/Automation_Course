package class6_hw;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;


public class Question2 {

    private int x;
    private int y;

    @BeforeClass
    public void initVars(){
        //Initialize the variables
        x = 1;
        y = 1;
    }

    @Test
    public void testCase1(){
       //Inequality assertion with a customized message
       Assert.assertNotEquals(x, y, "Assertion screwed up. ");
    }

    @AfterClass
    public void finalizeClass(){
        //Print out the current variables' values at the end of the class
        System.out.println(String.format("x = %d, y = %d", x,y));
    }


}
