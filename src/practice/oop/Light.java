package practice.oop;

public class Light extends SmartDevice{
//    String name;
//    boolean isOn;
    int brightness;

//    void turnOn() {
//        isOn = true;
//    }
//
//    void turnOff() {
//        isOn = false;
//    }

    void setBrightness(int b) {
        brightness = b;
    }

    @Override
    void showStatus() {
        System.out.println(
                "전등(" + (isOn ? "ON" : "OFF")
                        + ", 밝기 " + brightness + "%)");
    }
}