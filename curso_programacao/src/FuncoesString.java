
public class FuncoesString {

	public static void main(String[] args) {
		
		String original = "abcde FGHIJ ABC abc DEFG    ";
		
		String s01 = original.toLowerCase();
		String s02 = original.toUpperCase();
		String s03 = original.substring(3);	
		String s04 = original.substring(3, 27);
		String s05 = original.trim();
		String s06 = original.replaceAll("a", "CUZAO");
		int i = original.indexOf("bc");
		int j = original.lastIndexOf("bc");
		System.out.println("Original : -" + original + "-");
		System.out.println("toLowerCase: -" + s01 + "-");
		System.out.println("toUpperCase: -" + s02 + "-");
		System.out.println("substring: -" + s03 + "-");
		System.out.println("substring: -" + s04 + "-");
		System.out.println("indexOf: -" + s05 +"-");
		System.out.println("replaceAll: -" + s06 + "-");
		System.out.println("index bc: " + i);
		System.out.println("Lastindex bc: " + j);
		
		String s = "potato lemon apple";
		String[] vect = s.split(" ");
		String word1 = vect[0];
		String word2 = vect [1];
		String word3 = vect [2];
		
		System.out.println(word1);
		System.out.println(word2);
		System.out.println(word3);
	}

}
