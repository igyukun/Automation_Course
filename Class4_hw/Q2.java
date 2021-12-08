package Class4_hw;

import java.util.Scanner;

public class Q2 extends SomeAbstractClass {

    @Override
    public String abstractMethod(){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter your name: ");
        return s.next();
    }

}
