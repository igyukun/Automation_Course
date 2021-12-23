package class6_hw;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class Question5_1 {
        //Changing the order of annotations in the code does not change an execution order

        //Annotation is executed once at the beginning of the class
        @Before
        public void printHeader(){
            System.out.println("JUnit implementation.\n");
            System.out.println("@Before annotation");
        }

        //Annotation is executed once at the end of the class
        @After
        public void printFooter(){
            System.out.println("@After annotation");
        }

        ////Annotation @Test executes a single test case. There can be an unlimited number of test cases
        @Test
        public void printTest(){
            System.out.println("@Test annotation");
        }
    }
