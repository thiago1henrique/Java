package orientacaoObjetos.exercicio01;

public class Rectangle {
    double width;
    double height;

    public double area() {
        return width * height;
    }

    public double perimetro() {
        return 2 * (width + height);
    }

    public double diagonal() {
        return Math.sqrt(Math.pow(width, 2) + Math.pow(height, 2));
    }

    public String toString() {
        return "Largura " + width + "x" + " altura " + height + " = " + "área total:" + area();
    }
}
