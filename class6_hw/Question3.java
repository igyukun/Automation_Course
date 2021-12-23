package class6_hw;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Question3 {
    @BeforeClass
    public void initSuite(){
        System.out.println("Suite Question3 has started");
    }

    @Test
    public void printA(){
        System.out.println("A");
    }

    @Test
    public void printB(){
        System.out.println("B");
    }

    @Test
    public void printC(){
        System.out.println("C");
    }

    @AfterClass
    public void finalizeSuite(){
        System.out.println("Suite Question3 has ended");
    }
}
