package practice.oop;

public class Light {
    String name;
    boolean isOn;
<<<<<<< HEAD
    int brightness;
=======
>>>>>>> 70a1b1667effdc54d4f58026a6ae9856f86a96e2

    void turnOn(){
        isOn =true;
    }

    void turnOff(){
        isOn=false;
    }

<<<<<<< HEAD
    void setBrightness(int b){brightness =b;}

    void showStatus(){
        System.out.println(
                "전등(" +(isOn? "ON" : "OFF")
                +",밝기" +brightness + "%)");
=======
    void showStatus(){
        System.out.print(
                "Light(" +(isOn? "ON" : "OFF")
        );
>>>>>>> 70a1b1667effdc54d4f58026a6ae9856f86a96e2
    }
}
