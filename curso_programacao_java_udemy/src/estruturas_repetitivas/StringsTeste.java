package estruturas_repetitivas;

public class StringsTeste {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		String original = "abcde FGHI ABC abc DEFG        ";
		String s1 = original.toLowerCase();
		String s2 = original.toUpperCase();
		String s3 = original.trim();
		String s04 = original.substring(2);
		String s05 = original.substring(4, 9);
		String s06 = original.replace('a', 'x');
		String s07 = original.replace("abc", "xy");
		System.out.println(original + " Original.");
		System.out.println(s1 + " s1");
		System.out.println(s2 + " s2");
		System.out.println(s3 + " s3");
		System.out.println(s04 + " substring(2)");
		System.out.println(s06 + " replace");
		System.out.println(s07 + " replace()v2");
		System.out.println("-------------------------------");
		
		String s = "dark_souls hollow_knight fortnite";

		String[] vect = s.split(" "); 
		//cada espaço em branco será armazenado 
		//em um array agora.
		String jogo1 = vect[0]; //dark_souls
		String jogo2 = vect[1]; //hollow_knight
		String jogo3 = vect[2]; //fortnite
		for(String jogo : vect) {
			System.out.println(jogo);
		}

	}

}
