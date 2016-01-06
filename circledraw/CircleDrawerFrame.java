//*****************************************************
//This program was created on Friday, November 27, 2015
//by Jacob Morra
//
//The purpose of this program is to create the circle 
//object and ask the user for the object radius; the 
//circle of specified radius is constructed as a new
//ellipse object. Another feature of this program is 
//that it registers the location of the user click
//and assigns that to be the centre of the circle
//******************************************************

import javax.swing.JFrame;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import java.awt.Dimension;
import javax.swing.JOptionPane;

/** create frame and circle component*/
public class CircleDrawerFrame extends JFrame 
{	
	//declare instance of CircleDrawerComponent component
	private CircleDrawerComponent component; 
	private static final int frame_width = 1000; //set frame width
	private static final int frame_height = 1000;//set frame height
	public int r;//set object radius
	
	/**
	 * constructs CircleDrawerFrame 
	 */
	public CircleDrawerFrame ()
	{	
		//initialize component 
		component = new CircleDrawerComponent();
		//set size of component
		component.setPreferredSize(new Dimension (400, 350));
	
		// add mouse press listener
		class MousePressListener implements MouseListener
		{	
			//method for getting coordinates of user click
			public void mousePressed (MouseEvent event)
			{
				int x = event.getX ();//set x to x-coord of user click
				int y = event.getY ();//set y to y-coord of user click
				
				//get user-input for radius
				String userR = JOptionPane.showInputDialog ("Enter radius: ");
				r = Integer.parseInt (userR);//parse string userR as integer
				
				component.setPositionAndSize(x, y, r); //set position and size of circle
			}
			
			public void mouseReleased (MouseEvent event) {    }
			public void mouseClicked (MouseEvent event)  {    }
			public void mouseEntered (MouseEvent event)  {    }
			public void mouseExited (MouseEvent event)   {    }
		}
		//create new instance of MousePressListener called listen
		MouseListener listen = new MousePressListener();
		component.addMouseListener(listen);//call method to get center of circle and radius
		setSize (frame_width, frame_height);//set frame size 
		add(component);//add component to frame
	}
}

