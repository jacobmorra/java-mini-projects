//*****************************************************
//This program was created on Friday, November 27, 2015
//by Jacob Morra
//
//The purpose of this program is to actually draw the
//random shapes created by the generator program. It
//includes a method paintComponent which creates a new
//RandomShapeGenerator object to draw 10 random shapes
//******************************************************

//import all libraries pertaining to graphical functionaliites required by program
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JComponent;

/**
 * This component draws random shapes
 */
public class RandomShapeComponent extends JComponent {
	
	public void paintComponent(Graphics g)
	{
		//Create the graphics object that will represent the shape drawn
		Graphics2D g2 = (Graphics2D) g;
		
		//Create a random shape generator object
		RandomShapeGenerator shapeGen = new RandomShapeGenerator(getWidth(), getHeight());
		
		//Draw ten random shapes
		for (int i = 0; i < 10; i++)
		{
			g2.draw(shapeGen.randomShape());
		}
	}
}
