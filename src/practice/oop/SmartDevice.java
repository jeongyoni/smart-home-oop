package practice.oop;

public abstract class SmartDevice {

    String name;
    boolean isOn;


    void turnOn() {
        isOn = true;
    }

    void turnOff() {
        isOn = false;
    }

    abstract void showStatus();

}
