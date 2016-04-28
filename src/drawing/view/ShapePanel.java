package drawing.view;

import javax.swing.JPanel;
import java.awt.*;
import java.awt.geom.*;
import java.util.ArrayList;


public class ShapePanel extends JPanel
{
	private ArrayList<Rectangle> rectangleList;
	private ArrayList<Ellipse2D> ellipseList;
	private ArrayList<Ellipse2D> circleList;
	private ArrayList<Polygon> triangleList;
	private ArrayList<Polygon> polygonList;
	
	public void addRectangle()
	{
		
	}
	
	public void addSquare()
	{
		
	}
	public void addEllipse()
	{
		
	}
	
	public void addCircle()
	{
		
	}
	public void addTriangle()
	{
		int [] xPoints = new int[3];
		xPoints[0] = (int)(Math.random() * 150);
		xPoints[1] = (int)(Math.random() * 150);
		xPoints[2] = (int)(Math.random() * 150);
		
		int [] yPoints = {(int)(Math.random() * 250), (int)(Math.random() * 450), (int)(Math.random() * 250)};
		
		Polygon triangle = new Polygon(xPoints, yPoints, 3);
		triangleList.add(triangle);
	}
	public void addPolygon()
	{
		
	}
	@Override
	protected void paintComponent(Graphics currentGraphics)
	{
		super.paintComponent(currentGraphics);
		Graphics2D mainGraphics = (Graphics2D) currentGraphics;
	}
}
