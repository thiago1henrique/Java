package curso_programacao.exercico01;

import java.util.Locale;

public class Exercicio {

	public static void main(String[] args) {
		String product1 = "Computer";
		String product2 = "Office desk";
		
		int age = 24;
		int code = 3002;
		char gender = 'M';
		
		double price1 = 2100.0;
		double price2 = 650.50;
		double mesure = 53.234567;
		
		System.out.println("Products:");
		System.out.printf("Computer, which price is $ %.2f%n", price1);
		System.out.printf("Office desk, wich price is $ %.2f%n%n", price2);
		
		System.out.println("Record: " + age + " years old, code " + code + " and gender: " + gender);
		System.out.printf("Mesue with eight decimal places: %f%n", mesure);
		System.out.printf("Rounded (three decimal places): %.3f%n", mesure);
		Locale.setDefault(Locale.US);
		System.out.printf("US decimal point: %.3f", mesure);
		

	}

}
