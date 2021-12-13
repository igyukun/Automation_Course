package lesson5_hw;

public class Dog {
    private String name;
    private int age;
    private DogColor color;
    private boolean hasLongTail;

    public Dog (){
        name = "Wolfy";
        age = 4;
        color = DogColor.BLACK;
        hasLongTail = true;
    }

    public Dog(String name, int age, DogColor color, boolean hasLongTail){
        this.name = name;
        this.age = age;
        this.color = color;
        this.hasLongTail = hasLongTail;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public DogColor getColor() {
        return color;
    }

    public void setColor(DogColor color) {
        this.color = color;
    }

    public boolean isHasLongTail() {
        return hasLongTail;
    }

    public void setHasLongTail(boolean hasLongTail) {
        this.hasLongTail = hasLongTail;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void displayDog(){
        System.out.println("Dog's name: " + name);
        System.out.println("Dog's age: " + age);
        System.out.println("Dog's color: " + color);
        System.out.println(hasLongTail?"Dog has a long tail":"Dog has a short tail");
    }
}
