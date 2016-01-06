//*****************************************************
//This program was created on Friday, November 27, 2015
//by Jacob Morra
//
//The purpose of this class is to act as a subclass for
//the Employee class and Manager class; it serves as 
//a blueprint for Executive objects (Executes are Managers
//and Managers are Employees). In its constructor it calls
//the Manager superclass constructor
//******************************************************

/** A class representing an executive with a name, salary, and department. */
public class Executive extends Manager{
	
	/**
	 * constructor which creates Executive objects with name, salary, department
	 * @param name name of Executive
	 * @param salary salary of Executive
	 * @param department department where Executive is
	 */
	public Executive(String name, double salary, String department){
		/** call superclass constructor with parameters from argument
		 * of Executive constructor */
		super(name, salary, department);
	}
}
