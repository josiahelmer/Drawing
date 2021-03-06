package drawing.view;

import javax.swing.*;
import drawing.controller.*;
import java.awt.event.*;
import java.awt.*;
import java.util.ArrayList;

public class DrawingPanel extends JPanel
{
	private DrawingController baseController;
	private ShapePanel shapePanel;
	private JButton addRectangleButton;
	private SpringLayout baseLayout;
	private ArrayList rectangleList;
	public JButton clearButton;
	
	public DrawingPanel(DrawingController baseController)
	{
		this.baseController = baseController;
		baseLayout = new SpringLayout();
		addRectangleButton = new JButton("Add a Rectangle");
		rectangleList = new ArrayList<Rectangle>();
		shapePanel = new ShapePanel();
		
		setupPanel();
		setupLayout();
		setupListeners();
	}
	
	private void setupPanel()
	{
		this.setLayout(baseLayout);
		this.setBackground(Color.DARK_GRAY);
		this.add(addRectangleButton); //add all the buttons
		this.add(shapePanel);
		this.add(clearButton);
	}
	
	private void setupLayout()
	{
		
	}
	private void setupListeners()
	{
		addRectangleButton.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent click)
			{
				int xPosition = (int) (Math.random() * getWidth());
				int yPosition = (int) (Math.random() * getHeight());
				int width = (int) (Math.random() * 200);
				int height = (int) (Math.random() * 150);
				
				rectangleList.add(new Rectangle(xPosition, yPosition, width, height));
				
				repaint();
			}
		});
		
		addPolygonButton.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent click)
			{
				shapePanel.addPolygon();
				repaint();
			}
		}
		
		clearButton.addActionListener(new ActionListener()
		{
			
		}
			
		
	}
	
	@Override
	protected void paintComponent(Graphics currentGraphics)
	{
		super.paintComponent(currentGraphics);
		
		Graphics2D mainGraphics = (Graphics2D) currentGraphics;
		mainGraphics.setStroke(new BasicStroke(20));
		mainGraphics.setColor(Color.ORANGE);
		mainGraphics.drawRect(50, 70, 200, 400);
		
		for (Rectangle current ; rectangleList)
		{
			int red = (int) (Math.random() * 256);
			int green = (int) (Math.random() * 256);
			int blue = (int) (Math.random() * 256);
			
			mainGraphics.setColor(new Color(red, green, blue));
			mainGraphics.fill(current);
		}
	}
}
