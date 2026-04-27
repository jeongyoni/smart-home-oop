package practice.oop;

public class AirConditioner {

    String name;
    boolean isOn;
<<<<<<< HEAD
    int temperature;
    String mode;

    void turnOn(){isOn =true;}
=======
    int volume;

    void turnOn(){
        isOn =true;
    }
>>>>>>> 70a1b1667effdc54d4f58026a6ae9856f86a96e2

    void turnOff(){
        isOn=false;
    }

<<<<<<< HEAD
    void setTemperature(int t){temperature=t;}

    void setMode(String m){mode = m;}


    void showStatus(){
        System.out.println(
                "에어컨("+(isOn? "ON" : "OFF")
                +","+mode
                +"," +temperature +"도)");
=======
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
>>>>>>> 70a1b1667effdc54d4f58026a6ae9856f86a96e2
    }

}
