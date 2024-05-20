package edu.thiago.operadores;

import java.util.Date;

public class App {
    public static void main(String[] args) {
        //operador de atribuição =
        String name = "THIAGO";
        int age = 24;
        double weight = 65.8;
        char sex = 'M';
        boolean isOpen = true;
        Date birthday = new Date();

        //operadores aritméticos + - / *
        double sum = 10.5 + 15.5;
        int sub = 113 - 25;
        int multi = 112 + 25;
        int div = 112 + 25;
        int mol = 9 % 3;
        int result = (10 * 7) + (20 /4);

        //operadores unário
        int number = +5;
        //System.out.println(-number);
        //System.out.println(number);
        number = -number;
        //number = number * -1; //transformar valor negativo para positivo

        //incremento ou decremento ++ | --
        int number2 = 5;
        //number2 = number2 + 2;
        number2++;
        number2--;
        //System.out.println(++number2);

        //negando expressões booleanas !
        boolean var = false;
        var = !var;
        //System.out.println(var); //vira false na hora da impressão

        //operador ternario ? | :
        int a,b;
        a = 5;
        b = 6;
        String resultv2 = a==b ? "true" : "false";
        //System.out.println(resultv2);

        //operadores relacionais == > >= < <= !=

        int numberVer1 = 1;
        int numberVer2 = 2;
        boolean isEqual = numberVer1 == numberVer2;
        //System.out.println(isEqual);

        isEqual = numberVer1 != numberVer2;
        //System.out.println(isEqual);

        isEqual = numberVer2 > numberVer1;
        //System.out.println(isEqual);

        String name1 = "thiago";
        String name2 = "thiago";
        boolean resultv3 = name1 == name2 ? true : false;
        //System.out.println(resultv3);

        //operadores lógicos && ||
        boolean condition1 = true;
        boolean condition2 = false;
        if(condition1 && condition2){
            System.out.println("verdadeiras");
        } else {
            System.out.println("fim.");
        }

        if(condition1 ||  condition2){
            System.out.println("umas das condições são verdadeiras");
        } else {
            System.out.println("fim.");
        }
    }

}
