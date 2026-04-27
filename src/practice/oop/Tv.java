package practice.oop;

public class Tv {

    String name;
    boolean isOn;
    int channel;
    int volume;

    ////기능////
    void turnOn(){
        isOn =true;
    }

    void turnOff(){
        isOn=false;
    }

    void channelUp(){channel ++;}

    void channelDown(){
        channel --;
    }

    void volumeUp(){
        volume += 10;
    }

    void volumeDown(){
        volume -= 10;
    }

    void showStatus(){
        System.out.println(
                "Tv (" + (isOn ? "ON" : "OFF")
                +", Ch " +channel
                +", Vol " +volume + ")");
    }

}
