package lesson5_hw;
import java.lang.Math;

public class Question1 {
    public static void main(String[] args) {

        //Question 1
        System.out.println("===Question 1======");
        try {
            int a = 1 / 0;
        } catch (ArithmeticException e) {
            System.out.println("General Exception is caught");
            System.out.println(e.getMessage());
            e.printStackTrace();
        } finally {
            System.out.println("Question 1 is answered in the comments below");
        }
        // -- try{...} finally {...} is legal since the "finally" block will be executed disregarding of a result
        //    in the "try" block
        //
        // -- catch (Exception e) {...} catches any exception as a parent class for all checked and
        //    Runtime exceptions
        //
        // -- catch (Exception e) {...} is not specific and might not allow effective exception handling
        //
        // -- catch (Exception e) {...}
        //    catch (ArithmeticException e {...}
        //    This example will fail the compilation, since ArithmeticException has been already caught
        //    by "catch (Exception e) {...}" handler
        //=================
    }
}
