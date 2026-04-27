package practice.oop;

public class Light {
    String name;
    boolean isOn;

    void turnOn(){
        isOn =true;
    }

    void turnOff(){
        isOn=false;
    }

    void showStatus(){
        System.out.print(
                "Light(" +(isOn? "ON" : "OFF")
        );
    }
}
