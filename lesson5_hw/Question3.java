package lesson5_hw;

import java.util.ArrayList;

public class Question3 {
    public static void main(String[] args) {
        //Create Dog instance with default properties
        Dog dog1 = new Dog();
        //Create Dog instance with custom properties
        Dog dog2 = new Dog("Rexy",6,DogColor.BROWN,false);

        //Create Dog ArrayList object and add both dogs
        ArrayList <Dog> arrList = new ArrayList<Dog>();
        arrList.add(dog1);
        arrList.add(dog2);

        //Display dog2 properties
        arrList.get(1).displayDog();

        //Remove both dogs from ArrayList
        System.out.println("ArrayList size before the clearing is: " + arrList.size());
        arrList.clear();
        System.out.println("ArrayList size after the clearing is: " + arrList.size());
    }
}
