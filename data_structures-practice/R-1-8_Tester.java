import java.util.Scanner;

public class R_18Tester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner in = new Scanner(System.in);
		
		String word;
		int vct; //vowel count
		
		System.out.println("Enter a word. This program counts"
				+ "the number of vowels in that word: ");
		
		word = in.next();

		vct = R_18.ctV(word);
		
		System.out.println("There are "+vct+" vowels in that word");
	}

}
