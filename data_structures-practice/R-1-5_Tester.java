import java.util.Scanner;


public class R_15Tester {
	public static void main(String[] args){
		
		Scanner in = new Scanner(System.in);
		
		int num;
		char ans;
		char goAgain = 'y';
		
		do{
				System.out.println("Enter a number. This "
					+ "program will take the sum of all positive "
					+ "integers less than or equal to that number: ");
			num = in.nextInt();
	
			System.out.println(R_15.getSum(num));

			System.out.println("Want to try again? (y/n)");
			
			ans = in.next().charAt(0);
						
		}
		while(ans == 'y');
	}
}
