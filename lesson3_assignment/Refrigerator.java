package lesson3_assignment;

public interface Refrigerator {

    final int SWITCHED_ON = 0;
    final int SWITCHED_OFF = 1;
    final int SWITCHING_OFF = 2;

    void switchOn();
    void switchOff();
    void switchOff(int timeout);
    void setTemperature(int temperature);
    int getTemperature();
    void getState();
}
