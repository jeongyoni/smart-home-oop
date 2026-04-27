package practice.oop;

public class AirConditioner {

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
                "AirConditioner("+(isOn? "ON" : "OFF")
                +",Vol" +volume + ")");
    }

}
