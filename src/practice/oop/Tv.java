package practice.oop;

import java.net.SocketOption;
import java.security.spec.RSAOtherPrimeInfo;

public class Tv extends MediaDevice {

    //    String name;
//    boolean isOn;
    private int channel;
//    int volume;

    /// /기능////
//    void turnOn(){
//        isOn =true;
//    }
//
//    void turnOff(){
//        isOn=false;
//    }
    public int getChannel() {
        return channel;
    }

    public void setChannel(int ch) {
        this.channel = ch;
    }

    void channelUp() {
        channel++;
    }

    void channelDown() {
        channel--;
    }

//    void volumeUp(){
//        volume += 10;
//    }
//
//    void volumeDown(){
//        volume -= 10;
//    }

    @Override
    public void showStatus() {
        System.out.println("Tv ("
                + (isOn() ? "ON" : "OFF")
                + ", Ch " + channel
                + ", Vol " + getVolume() + ")");
    }

    @Override
    public void controlMenu() {
        while (true) {

            showStatus();
            System.out.println("[1] ON  [2] OFF  [3] Channel  [4] Volume Up  [5] Volume Down  [0] Back");
            int idx = SmartHomeApp.readInt("  메뉴 선택 > ");
            if (idx == 0) return;
            else if (idx == 1) turnOn();
            else if (idx == 2) turnOff();
            else if (idx == 3) {
                int ch = SmartHomeApp.readInt("  채널 입력 > ");
                setChannel(ch);
            } else if (idx == 4) volumeUp();
            else if (idx == 5) volumeDown();
        }
    }

}

