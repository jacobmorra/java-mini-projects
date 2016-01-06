//*****************************************************
//This program was created on Friday, November 27, 2015
//by Jacob Morra
//
//The purpose of this class is to act as a subclass for
//the Employee class and a superclass for the Executive
//class. It represents a blueprint for employees who
//are managers and has a constructor as well as a toString
//method for returning manager name, salary, and department
//******************************************************

/** A class representing a manager with a name, salary, and department. */
public class Manager extends Employee{
	/**Instance variables*/
	private String department; //department manager works in, type String
	
	/**
	 * constructor which creates Manager objects with name, salary, dept.
	 * @param name name of manager
	 * @param salary salary of manager
	 * @param department manager's department
	 */
	public Manager(String name, double salary, String department){
		super(name, salary); //call parent constructor with arguments name, salary
		this.department = department; //set object department to argument
	}
	/**
	 * method calls parent toString() method and appends manager department name
	 *@return manager name, manager salary, manager department
	 */
	public String toString(){
		return super.toString() + this.department;
	}
}
