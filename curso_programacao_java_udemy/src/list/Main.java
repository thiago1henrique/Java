package list;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		
		list.add("Thiago");
		list.add("Henrique");
		list.add("Lucas");
		list.add("Mario");
		list.add(2, "Marco");
		
		System.out.println(list.size());

		
		for(String pessoa: list) {
			System.out.println(pessoa);
		}
		
		System.out.println("----------");
		list.remove(1);
		list.removeIf(x -> x.charAt(0) == 'T');
		
		for(String pessoa: list) {
			System.out.println(pessoa);
		}
		System.out.println("----------");
		System.out.println("INDEX OF LUCAS: " + list.indexOf("Lucas"));
	}

}
