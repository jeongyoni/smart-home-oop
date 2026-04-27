package practice.oop;

public class AirConditioner {

    String name;
    boolean isOn;
    int temperature;
    String mode;

    void turnOn() {
        isOn = true;
    }

    void turnOff() {
        isOn = false;
    }

    void setTemperature(int t) {
        temperature = t;
    }

    void setMode(String m) {
        mode = m;
    }

    void showStatus() {
        System.out.println(
                "에어컨(" + (isOn ? "ON" : "OFF")
                        + "," + mode
                        + "," + temperature + "도)");
    }
}