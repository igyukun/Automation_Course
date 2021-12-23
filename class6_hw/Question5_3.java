package class6_hw;

import org.junit.After;
import org.junit.Before;
import org.testng.annotations.Test;

public class Question5_3 {

    @Before
    public void initSuite(){
        System.out.println("JUnit version");
        System.out.println("Suite Question3 has started");
    }

    @Test (priority = 0)
    public void printA(){
        System.out.println("A");
    }

    @Test (priority = 1)
    public void printB(){
        System.out.println("B");
    }

    @Test (priority = 2)
    public void printC(){
        System.out.println("C");
    }

    @After
    public void finalizeSuite(){
        System.out.println("Suite Question3 has ended");
    }
}
