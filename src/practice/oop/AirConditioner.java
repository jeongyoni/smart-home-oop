package practice.oop;

public class AirConditioner extends SmartDevice{

//    String name;
//    boolean isOn;
    int temperature;
    String mode;

//    void turnOn() {
//        isOn = true;
//    }
//
//    void turnOff() {
//        isOn = false;
//    }

    void setTemperature(int t) {
        temperature = t;
    }

    void setMode(String m) {
        mode = m;
    }

    @Override
    public void showStatus() {
        System.out.println(
                "에어컨(" + (isOn() ? "ON" : "OFF")
                        + "," + mode
                        + "," + temperature + "도)");
    }
    @Override
    public void controlMenu() {
        while (true) {
            showStatus();
            System.out.println("[1] ON  [2] OFF  [3] 온도설정  [4] 모드변경  [0] Back");
            int idx = SmartHomeApp.readInt("  메뉴 선택 > ");
            if (idx == 0) return;
            else if (idx == 1) turnOn();
            else if (idx == 2) turnOff();
            else if (idx == 3) {
                int t = SmartHomeApp.readInt("  온도 입력 > ");
                setTemperature(t);
            }
            else if (idx == 4) {
                System.out.print("  모드 입력 (냉방/난방/제습) > ");
                String m = SmartHomeApp.sc.next();
                setMode(m);
            }
        }
    }
}