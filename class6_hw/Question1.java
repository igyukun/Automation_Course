package class6_hw;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Question1 {
    //Changing the order of annotations in the code does not change an execution order

    //Annotation is executed once at the beginning of the class
    @BeforeClass
    public void printHeader(){
        System.out.println("@BeforeClass annotation");
    }

    //Annotation is executed once at the end of the class
    @AfterClass
    public void printFooter(){
        System.out.println("@AfterClass annotation");
    }

    ////Annotation @Test executes a single test case. There can be an unlimited number of test cases
    @Test
    public void printTest(){
        System.out.println("@Test annotation");
    }
}

