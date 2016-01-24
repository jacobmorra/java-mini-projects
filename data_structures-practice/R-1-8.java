/*
Write a short Java method that counts the number of vowels in a given character
string.
*/

public class R_18 {
	/**
	 * counts number of vowels in given string
	 * @return number of vowels
	 */
	public static int ctV(String word){
		int ct=0; //initialize vowel count to 0
		int pos=0; //stores current string location
		while (pos<word.length()){
			if (word.charAt(pos)=='a' || word.charAt(pos)=='e'
			|| word.charAt(pos)=='i' || word.charAt(pos)=='o'
			|| word.charAt(pos)=='u'){
				ct+=1;
			}
			pos++;
		}
		return ct;
	}
}
