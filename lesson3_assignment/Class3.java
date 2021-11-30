package lesson3_assignment;

import static java.lang.System.exit;

public class Class3 {

    public static void main(String[] args) {

        //Questions 1 and 2
        Horse horse1 = new Horse();
        System.out.println("Horse name is " + horse1.getName());
        System.out.println("Horse is " + horse1.getAge() + " years old");
        System.out.println();

        Horse horse2 = new Horse("Hengeron", 7);
        System.out.println("Horse name is " + horse2.getName());
        System.out.println("Horse is " + horse2.getAge() + " years old");

        //Question 3
        //The printed output will be "Name is: sam"

        //Question 4
        //The printed output will be different: "Name is: joah"

        //Question 5
        //String 's' is not instantiated. Trying to access it will throuw the NullPointerException.

        //Question 6
        //Restricting the direct access to the class properties and hiding the class' inner implementation details.
        // The access to the class properties (if required) is possible by bounding the setter and
        // the getter functions.

        //Question 7
        System.out.println("============================================================");
        TadiranRefrigerator fridge = new TadiranRefrigerator("Abc Tadiran");
        fridge.switchOn();
        System.out.print("The current state is ");
        fridge.getState();
        System.out.println();
        fridge.setTemperature(4);
        System.out.println("The current temperature is " + fridge.getTemperature());
        fridge.switchOff(5);
        System.out.print("The current state is ");
        fridge.getState();
        System.out.println();
        exit(0);
    }




}
