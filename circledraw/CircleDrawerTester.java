//*****************************************************
//This program was created on Friday, November 27, 2015
//by Jacob Morra
//
//The purpose of this program is to test the CircleDrawerFrame
//class (and CircleDrawerComponent) by creating an instance
//of CircleDrawerFrame (which draws the circle of a user-entered
//radius)
//******************************************************

import javax.swing.JFrame;

/** draws a frame and circle of user-indicated radius in the frame*/
public class CircleDrawerTester {

	public static void main(String[] args) 
	{	
		//create new CircleDrawerFrame instance called myframe
		JFrame myframe = new CircleDrawerFrame ();
		
		//exit frame on close of window
		myframe.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
		myframe.setTitle ("Circle Drawer");//set frame title
		myframe.setVisible (true);//set frame to be visible
	}
}


