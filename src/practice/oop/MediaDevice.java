package practice.oop;

public abstract class MediaDevice extends SmartDevice{
    private int volume;

    public int getVolume(){return volume;}
    public void setVolume(int volume) { this.volume = volume; }

    public void volumeUp(){volume +=10;}
    public void volumeDown(){volume -=10;}

}
