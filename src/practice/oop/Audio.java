package practice.oop;

public class Audio extends MediaDevice {

//    String name;
//    boolean isOn;
//    int volume;
    int track;
    String album;
    String artist;

//    void turnOn() {
//        isOn = true;
//    }
//
//    void turnOff() {
//        isOn = false;
//    }

//    void volumeUp() {
//        volume += 10;
//    }
//
//    void volumeDown() {
//        volume -= 10;
//    }

    void changeTrack(int t) {
        track = t;
    }

    @Override
    void showStatus() {
        System.out.println(
                "Audio (" + (isOn ? "ON" : "OFF")
                        + ", 트랙 " + track + "번"
                        + ", 앨범 " + album
                        + ", 가수 " + artist
                        + ", Vol " + volume + ")");
    }
}