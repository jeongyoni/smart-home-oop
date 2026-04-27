package practice.oop;

public class Audio {

    String name;
    boolean isOn;
    int volume;

    void turnOn(){
        isOn =true;
    }

    void turnOff(){
        isOn=false;
    }

    void volumeUp(){
        volume += 10;
    }

    void volumeDown(){
        volume -= 10;
    }

    void showStatus(){
        System.out.println(
                "Audio (" + (isOn ? "ON" : "OFF")
                        +", Vol " +volume + ")");
    }
}
