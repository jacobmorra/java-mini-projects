/*
Write a short Java program that takes two arrays a and b of length n storing int
values, and returns the dot product of a and b. 
 */

public class C_123 {
	public static int dot(int[] a, int[] b){
		int result=0;
		
		if (a.length != b.length){
			System.out.println ("Arrays must be same size");
		}
		else{
			for(int i=0; i<a.length;i++){
				result+= a[i]*b[i]; //multiply corresponding array entries
			}
		}
		
		return result;
	}
}
