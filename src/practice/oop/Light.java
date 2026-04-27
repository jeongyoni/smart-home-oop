package practice.oop;

public class Light {
    String name;
    boolean isOn;
    int brightness;

    void turnOn() {
        isOn = true;
    }

    void turnOff() {
        isOn = false;
    }

    void setBrightness(int b) {
        brightness = b;
    }

    void showStatus() {
        System.out.println(
                "전등(" + (isOn ? "ON" : "OFF")
                        + ", 밝기 " + brightness + "%)");
    }
}