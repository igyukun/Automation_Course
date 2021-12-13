package lesson5_hw;

public class Question8 {
    public static void main(String[] args) {

        /*
        The following code won't compile, since the "var" type can be declared only with the local
        variable, while in this code it appears as a function argument
        -----------------------------
        static void getX(var x) {
        System.out.println(x);
        }
        -----------------------------
         */
        getX();
    }

    /* The working code */
    static void getX() {
        var x = "Var-var-var";
        System.out.println(x);
    }
}
