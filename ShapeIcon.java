import java.awt.Component;
import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.Icon;

/**
 * A class that helps to make a shape into an Icon.
 * 
 * @author Taran Chowdhury
 */
public class ShapeIcon implements Icon {
	private CompositeShape shape;
	private int width;

	/**
	 * constructor that initializes the variables.
	 * 
	 * @param shape shape that is being turned to an icon
	 * @param width width of the shape
	 */
	public ShapeIcon(CompositeShape shape, int width) {
		this.shape = shape;
		this.width = width;
	}

	/**
	 * draws the shape as an Icon
	 * 
	 * @param c The component
	 * @param g the graphics component
	 * @param x x coordinate of the icon
	 * @param y y coordinate of the icon
	 */
	@Override
	public void paintIcon(Component c, Graphics g, int x, int y) {
		Graphics2D g2 = (Graphics2D) g;
		shape.draw(g2);
	}

	/**
	 * returns the width of this shape
	 * 
	 * @returns width width of the shape
	 */
	@Override
	public int getIconWidth() {
		return width;
	}

	/**
	 * returns the height of this shape
	 * 
	 * @returns width width of the shape because width = height
	 */
	@Override
	public int getIconHeight() {
		return width;
	}

}
