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
    public void showStatus() {
        System.out.println(
                "전등(" + (isOn() ? "ON" : "OFF")
                        + ", 밝기 " + brightness + "%)");
    }
    @Override
    public void controlMenu() {
        while (true) {
            showStatus();
            System.out.println("[1] ON  [2] OFF  [3] 밝기설정  [0] Back");
            int idx = SmartHomeApp.readInt("  메뉴 선택 > ");
            if (idx == 0) return;
            else if (idx == 1) turnOn();
            else if (idx == 2) turnOff();
            else if (idx == 3) {
                int b = SmartHomeApp.readInt("  밝기 입력 (0~100) > ");
                setBrightness(b);
            }
        }
    }

}