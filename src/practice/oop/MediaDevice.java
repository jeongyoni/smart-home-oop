package practice.oop;

public abstract class MediaDevice extends SmartDevice{
    int volume;

    void volumUp(){volume +=10;}
    void volumDown(){volume -=10;}

}
