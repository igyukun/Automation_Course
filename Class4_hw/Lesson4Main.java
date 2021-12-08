package Class4_hw;
import Class4_classwork.*;

public class Lesson4Main {

    public static void main(String[] args) {

        //---Q1------------
        System.out.println("*************");
        System.out.println("Question 1");
        SomeInterface q1 = new Q1();
        q1.someMethod();
        //-----------------

        //---Q2------------
        System.out.println("/n*************");
        System.out.println("Question 2");
        SomeAbstractClass q2 = new Q2();
        System.out.println("Returned input is: " + q2.abstractMethod());
        //-----------------

        //---Q3------------
        //An abstract class cannot be instantiated, thus this code will generate a compilation error.
        //-----------------

        //---Q4------------
        //An abstract class cannot be final. These two modifiers contradict each other, since the abstract class
        // have to be extended while the final modifier means the class cannot be inherited. The result
        // will be a compilation error
        //-----------------

        //---Q5------------
        System.out.println("/n*************");
        System.out.println("Question 5");
        Ball b = new Ball();
        System.out.println("Is the ball round? " + b.isRound);
        //b.isRound = false; - cannot assign a value to a variable defined as final
        //-----------------

        //---Q6------------
        //static variables cannot be declared inside the function, and can be used only in a class scope, i.e.
        //as a class property.
        //-----------------

        //---Q7 - Q8------------
        System.out.println("/n*************");
        System.out.println("Question 7-8");
        WhitePony p = new WhitePony();
        p.bite();
        System.out.println("The pony's color is " + p.getPonyColor());
        //-----------------

        //---Q9------------
        //Class cannot inherit more than one class
        //-----------------

        //---Q10-----------
        // Class Dog is a part of a different package (animals)
        //We should add "import animal.*" or "import animal.Dog"
        //-----------------

        //---Q11-----------
        //The code won't compile since the methods or variables declared as "protected"
        //can be accessible from other package only through the inheritance.
        //This can be fixed by declaring the method "bark()" as public or by inheriting the class Dog
        //by the class Apple (which is pretty weird idea)
        //-----------------

        //---Q12-----------
        //Teh program will print "Whaf - Puppy"

        //-----------------

        //---Q13-----------
        //The Garbage Collection can not be forced explicitly. Even when called explicitly through System.gc()
        //there is no guarantee that it will be executed.
        //-----------------

        //---Q14-----------
        //creating object cow will instantiate the class Cow, which includes the accessible elements of
        //the inherited classes.
        //-----------------

        //---Q15-----------
        //It makes sense to use try-finally block without catch in the case when we want the program to
        // get into the "finally" block nevertheless what exception has been thrown inside the try block.
        //-----------------

        //---Q16-----------
        //The program will throw RuntimeException and terminate.
        //-----------------

        //---Q17-----------
        //"const" is a reserved word but it does not have an implementation in Java
        //-----------------

        //---Q18-----------
        //"Cyclic inheritance" is when the class inherits itself
        //It is not ALLOWED IN Java and returns compilation error, when used
        //For example:
        //        class Bird extends Bird{
        //            public void migrate(String country){
        //                System.out.println("The bird migrates to " + country);
        //            }
        //        }


    }
}
