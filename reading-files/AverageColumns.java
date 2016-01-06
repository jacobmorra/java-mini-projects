//*****************************************************
//This program was created on Friday, November 27, 2015
//by Jacob Morra
//
//The purpose of this program is to read from a user-specified
//input file (input.txt in my case) with 2 columns of numbers
//and average the columns 
//******************************************************

//Import libraries that enable program will file reading functionalities
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/** Reads a file of floating-point number
 *  columns and prints average of columns. */
public class AverageColumns {

	public static void main(String[] args)
	{
		//Create instance of Scanner class to allow for user input of file name
		Scanner in = new Scanner(System.in);
		System.out.print("Please enter the file name: ");
		String filename = in.next();//store user input as String filename 
		
		//Should the file directory be successfully loaded into the program, 
		//carry on with calculations
		try
		{
			//Load in the data embedded in the file
			Scanner inFile = new Scanner (new File(filename));
			
			//Declare and initialize variables necessary to calculate the average
			double ColumnOneSum = 0.0;//initialize column sum to 0.0
			double ColumnTwoSum = 0.0;//initialize column sum to 0.0
			int columnNumber = 0;////initialize column number to 0
			
			//Read in all the data line by line
			while (inFile.hasNextDouble () )
			{
				//Sum the corresponding column values, store in corresponding vars 
				ColumnOneSum= ColumnOneSum+ inFile.nextDouble();
				ColumnTwoSum = ColumnTwoSum+ inFile.nextDouble();
			
				//Count the column number to be used to calculate the average
				columnNumber= columnNumber+1;//increase column number
			}
		//Output the averages of each column respectively
		System.out.println("Average of column 1:" + ColumnOneSum / columnNumber);
		System.out.println("average of column 2:" + ColumnTwoSum / columnNumber);
		
		}		
		//Should the file directory fail to be inputted by the user, program will 
		//then output with a statement saying so
		catch (FileNotFoundException e)
		{   
		System.out.println("Invalid File Directory! Failed to read data!");
		}
	}
}
