package practice.oop;

public class Audio extends MediaDevice {


    //    String name;
//    boolean isOn;
//    int volume;
    private int track;
    private String album;
    private String artist;

    public void setTrack(int track) {
        this.track = track;
    }  // 그 다음 setter!

    public void setAlbum(String album) {
        this.album = album;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }


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
    public void showStatus() {
        System.out.println(
                "Audio (" + (isOn() ? "ON" : "OFF")
                        + ", 트랙 " + track + "번"
                        + ", 앨범 " + album
                        + ", 가수 " + artist
                        + ", Vol " + getVolume() + ")");
    }
    @Override
    public void controlMenu() {
        while (true) {
            showStatus();
            System.out.println("[1] ON  [2] OFF  [3] Track  [4] Volume Up  [5] Volume Down  [0] Back");
            int idx = SmartHomeApp.readInt("  메뉴 선택 > ");
            if (idx == 0) return;
            else if (idx == 1) turnOn();
            else if (idx == 2) turnOff();
            else if (idx == 3) {
                int t = SmartHomeApp.readInt("  트랙 입력 > ");
                changeTrack(t);
            } else if (idx == 4) volumeUp();
            else if (idx == 5) volumeDown();
            else System.out.println("잘못된 번호 입니다.");
        }
    }
}