package lesson5_hw;

public class Question11 {
    public static void main(String[] args) {
        System.out.println("Just throwing a custom exception and handling it.");
        try {
            throw new MyException();
        }
        catch (MyException e) {
            e.printStackTrace();
        }
    }
}
