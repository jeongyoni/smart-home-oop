package practice.oop;

public class Audio {

    String name;
    boolean isOn;
    int volume;
<<<<<<< HEAD
    int track;
    String album;
    String artist;
=======
>>>>>>> 70a1b1667effdc54d4f58026a6ae9856f86a96e2

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

<<<<<<< HEAD
    void changeTrack(int t){track =t;}

    void showStatus(){
        System.out.println(
                "Audio (" + (isOn ? "ON" : "OFF")
                        +",트랙"+track +"번"
                        +", 앨범" +album
                        +",가수"+artist
=======
    void showStatus(){
        System.out.println(
                "Audio (" + (isOn ? "ON" : "OFF")
>>>>>>> 70a1b1667effdc54d4f58026a6ae9856f86a96e2
                        +", Vol " +volume + ")");
    }
}
