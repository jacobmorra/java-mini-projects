//*****************************************************
//This program was created on Friday, November 27, 2015
//by Jacob Morra
//
//The purpose of this class is to act as a superclass for
//the Manager and Executive classes. It features a 
//constructor and method which prints name and salary
//******************************************************

/** A class representing an employee with a name and salary. */
public class Employee {
	/**Instance variables*/
	private String name; //name of employee type String
	private double salary; //salary of employee type double

	/**
	 * Constructor for Employee objects which sets name and salary
	 * @param name name of employee
	 * @param salary salary of employee
	 */
	public Employee(String name, double salary){
		this.name=name; //set object name to argument
		this.salary=salary; //set object salary to argument
	}
	/**
	 * method which prints class name, employee name, and salary
	 * @return class name, employee name, salary
	 */
	public String toString(){
		return getClass().getName() + "[" + name + ", " + salary + "]";
	}
}
