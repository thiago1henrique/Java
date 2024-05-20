package edu.thiago.tiposvariaveis;

public class App {
    public static void main(String[] args) {
        int age;
        age = 24;

        short shortNumber = 1;
        int regularNumber = shortNumber;
        //short shortNumber2 = regularNumber; erro
        short shortNumber3 = (short) regularNumber; //casting

        final String FULL_NAME = "Thiago Henrique";
        final double VALOR_PI = 3.14;
        System.out.println(age);
        System.out.println(VALOR_PI);
    }
}
