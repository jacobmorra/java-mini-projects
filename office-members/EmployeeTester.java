//*****************************************************
//This program was created on Friday, November 27, 2015
//by Jacob Morra
//
//The purpose of this class is to test the constructors
//and methods of the Employee, Manager, and Executive
//classes by creating corresponding objects and calling
//the methods.
//******************************************************

/** test the class constructors and methods for Employee, Manager, Executive classes*/
public class EmployeeTester {
	public static void main(String[] args){
		
		/** Create object of type Employee with arguments for name and salary*/
		Employee empl1 = new Employee("Harminder", 50000);
		/** Create object of type Manager with arguments for name, salary, department*/
		Manager mang1 = new Manager("Jacob", 100000, "Software Engineering Dept.");
		/** Create object of type Executive with arguments for name, salary, department*/
		Executive exec1 = new Executive("Rohan", 150000, "Mechatronics Engineering Dept."); 
		
		/** Call all toString() methods for Employee, Manager, and Executive classes*/
		System.out.println(empl1.toString());
		System.out.println(mang1.toString());
		System.out.println(exec1.toString());
	}
}

