package edu.thiago.metodos;

public class SmartTv {
    boolean isOn = false;
    int chanel = 1;
    int volume = 25;

    public void turnOn() {
        isOn = true;
    }

    public void turnOff() {
        isOn = false;
    }

    public void volumeUp() {
        if (isOn) {
            volume = ++volume;
        } else {
            System.out.println("TV DESLIGADA!");
        }
    }

    public void volumeDown() {
        if (isOn) {
            volume = --volume;
        } else {
            System.out.println("TV DESLIGADA!");
        }
    }

    public void upChanel() {
        if (isOn) {
            chanel = ++chanel;
        }
    }

    public void downChanel() {
        if (isOn) {
            chanel = --chanel;
        }
    }

    public void changeChanel(int newChanel) {
        chanel = newChanel;
    }
}
