package lesson3_assignment;

import java.util.Timer;

public class TadiranRefrigerator implements Refrigerator{

    String model = "Tadiran ABC";
    int state = SWITCHED_OFF;
    int temperature = 0;
    int timeout = 0; //switch off timeout in seconds

    public TadiranRefrigerator(){
        System.out.println("Object " + model + "refrigerator has been initialized.");
    }
    public TadiranRefrigerator(String model){
        this.model = model;
        System.out.println("Object " + model + "refrigerator has been initialized.");
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    //setting the switch-off timeout
    public void setTimeout(int timeout) {
        this.timeout = timeout;
    }

    //getting the current temperature
    public int getTemperature() {
        return temperature;
    }

    //setting the temperature
    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }

    //switching on
    public void switchOn(){
        state = SWITCHED_ON;
        System.out.println("The refrigerator has been switched on");
    }

    //switching off immediately
    public void switchOff(){
        state = SWITCHED_OFF;
        System.out.println("The refrigerator has been switched off immediately." );
    }

    //switching off with a timeout
    public void switchOff(int timeout) {
        Timer t = new Timer();
        int counter = 0;

        while (counter < timeout * 1000) {
            try {
                Thread.sleep(100);
            } catch(InterruptedException e) {
                e.printStackTrace();
            }
            state = SWITCHING_OFF;
            System.out.print("-");
            counter += 100;
        }
        System.out.println();
        state = SWITCHED_OFF;
        System.out.println("The refrigerator has been switched off after " + timeout + " seconds." );
    }

    public void getState(){
        switch (state){
            case SWITCHED_ON:
                System.out.print("Switched on");
                break;
            case SWITCHED_OFF:
                System.out.print("Switched off");
                break;
            case SWITCHING_OFF:
                System.out.print("Switching off");
                break;
            default:

        }
    }

}
