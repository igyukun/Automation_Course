package lesson3_assignment;

public class Horse {

    private String name;
    private int age;

    public Horse (String name, int age){
        this.name = name;
        this.age = age;
    }

    public Horse(){
        this.name = "Bucephalus";
        this.age = 2300;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
