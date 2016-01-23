import java.util.Scanner;
public class R_13Tester {
	public static void main(String[] args){
	
	Scanner in = new Scanner(System.in);
	
	long num1;
	long num2;
	
	System.out.println("Enter a number: ");
	num1 = in.nextLong();
	
	System.out.println("Enter a number: ");
	num2 = in.nextLong();
	
	  
	R_13 mycheck = new R_13(num1,num2);
	  
	
	if (mycheck.isMultiple()){
		System.out.println(num1 + " is a multiple of " + num2);
	}
	else{
		System.out.println(num1 + " is not a multiple of " + num2);
	}
	
	}
}
