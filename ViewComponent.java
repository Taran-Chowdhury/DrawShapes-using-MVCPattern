import java.awt.Color;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Point;

import java.util.ArrayList;

import javax.swing.JComponent;

/**
 * The component in which the shapes are drawn
 * 
 * @author Taran Chowdhury
 *
 */
public class ViewComponent extends JComponent {
	private ArrayList<CompositeShape> shapes;

	/**
	 * Constructor- initializing the array
	 */
	public ViewComponent() {
		shapes = new ArrayList<CompositeShape>();

	}

	/**
	 * adding a shape to the ArrayList
	 * 
	 * @param shape the shape to be added to the ArrayList
	 */
	public void addShape(CompositeShape shape) {
		shapes.add(shape);
		this.repaint();
	}

	/**
	 * Paints the shape onto the JComponent
	 * 
	 * @param g The graphics component
	 */
	public void paintComponent(Graphics g) {
		Graphics2D g2 = (Graphics2D) g;
		for (CompositeShape s : shapes) {
			s.draw(g2);
		}
	}
}
