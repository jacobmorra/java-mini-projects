/*
Write a short Java method that takes an integer n and returns the sum of all
positive integers less than or equal to n.
*/

public class R_15 {
	public static int getSum(int n){
		int sum=n;//initialize sum to n
		int i=n-1; //start at 1 less than n
		
		//add all positive numbers less than n to sum
		while (i>0){
			sum+=i;
			i--;
		}
		return sum;
	}
}
