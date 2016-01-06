//*****************************************************
//This program was created on Friday, November 27, 2015
//by Jacob Morra

//The purpose of this program is to actually draw the
//circle object created in CircleDrawerFrame.java.
//******************************************************

import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JComponent;
import java.awt.geom.Ellipse2D;

/** draw the circle created in CircleDrawerFrame.java*/
public class CircleDrawerComponent extends JComponent
{
	private double x; //x-coordinate of circle
	private double y; //y-coordinate of circle
	private double radius; //radius of circle
	
	public CircleDrawerComponent ()
	{
	}
	
	/**
	 * 
	 * @param x x-coordinate of circle
	 * @param y y-coordinate of circle
	 * @param r radius of the circle 
	 */
	public void setPositionAndSize (double x, double y, double r)
	{
		this.x = x; //set instance variable x to argument x
		this.y = y; //set instance variable y to argument y
		radius = r; //set instance variable radius to argument r
	}
	
	/**
	 * method draws the circle on the frame
	 */
	public void paintComponent (Graphics g)
	{
		super.paintComponent (g);//call paintComponent method from JComponent
		Graphics2D g2 = (Graphics2D) g; //apply cast to g to set g2 as instance of Graphics2D
		//create Ellipse2D object called circle with left side as center x-coordinate - radius, etc.
		Ellipse2D.Double circle = new Ellipse2D.Double(x-radius, y-radius, radius *2, radius *2);
		g2.draw(circle);//draw the circle
		repaint ();
	}
}



