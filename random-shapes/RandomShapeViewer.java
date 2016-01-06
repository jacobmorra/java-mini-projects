//*****************************************************
//This program was created on Friday, November 27, 2015
//by Jacob Morra
//
//The purpose of this program is to create a viewing window
//from JFrame and draw 10 random objects in the window
//(using the RandomShapeComponent class) -- a RandomShapeComponent
//object is created and added to the JFrame (i.e. 10 random shapes)
//******************************************************

//Import library that enables window drawing functionalities
import javax.swing.JFrame;


public class RandomShapeViewer
{ 
	public static void main(String[] args)
	{
		//Draw the window that will project the randomly generated shapes 
		JFrame frame = new JFrame();//create new JFrame instance called frame
		frame.setSize(300, 400); //set frame size
		frame.setTitle("Random shapes");//set frame title
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //exit frame on close
		
		//Draws in the shapes -- create new RandomShapeComponent (which draws shapes)  
		RandomShapeComponent component = new RandomShapeComponent(); 
		frame.add(component);//add shapes to JFrame
      
		//Ensures that the shapes are displayed  
		frame.setVisible(true);//set frame to visible
		}
}


