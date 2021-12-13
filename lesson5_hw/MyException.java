package lesson5_hw;

public class MyException extends Exception{

    private String message = "My personal own beautiful exception has occurred. Handle it properly!";

    public MyException() {
        super(" ");
    }

    @Override
    public String getMessage() {
        return message;
    }

    @Override
    public void printStackTrace() {
        super.printStackTrace();
    }
}
