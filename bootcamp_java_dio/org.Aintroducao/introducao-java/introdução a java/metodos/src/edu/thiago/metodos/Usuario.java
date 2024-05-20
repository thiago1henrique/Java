package edu.thiago.metodos;

public class Usuario {
    public static void main(String[] args) {
        SmartTv smartTv = new SmartTv();
        smartTv.turnOn();
        smartTv.volumeUp();
        smartTv.volumeUp();
        smartTv.volumeUp();
        smartTv.upChanel();
        smartTv.changeChanel(13);
        smartTv.volumeDown();
        System.out.println("A TV está ligada? " + smartTv.isOn);
        System.out.println("Canal atual: " + smartTv.chanel);
        System.out.println("Volume atual: " + smartTv.volume);
    }

}
