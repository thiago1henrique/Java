package estatico.util;

public class CurrencyConverter {
    public static final double IOF = 0.06;
    public static double converter(double dolar, double value) {
        double calc = dolar * value;
        double iofCalc = calc * IOF;
        return calc + iofCalc;

    }
}
