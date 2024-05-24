package estatico.util;

public class Calculator {
    public static final double PI = 3.14159;

    public static double circuferencia(double radius) {
        return 2 * PI * radius;
    }

    public static double volume(double radius) {
        return 4.0 * PI * radius * radius * radius / 3.0;
    }
}

//lembre de tirar static se for estanciar um objeto
