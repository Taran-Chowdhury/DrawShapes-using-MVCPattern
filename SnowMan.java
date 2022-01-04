import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;

/**
 * A class that draws a SnowMan Shape
 * 
 * @author Taran Chowdhury
 */
public class SnowMan implements CompositeShape {
	private int width;
	private int x;
	private int y;

	/**
	 * Constructs a car item.
	 * 
	 * @param x     the left of the bounding rectangle
	 * @param y     the top of the bounding rectangle
	 * @param width the width of the bounding rectangle
	 */
	public SnowMan(int x, int y, int width) {
		this.x = x;
		this.y = y;
		this.width = width;
	}

	/**
	 * returns the width of this shape
	 * 
	 * @returns width width of the shape
	 */
	@Override
	public int getWidth() {
		return width;
	}

	/**
	 * This method creates a SnowMan Shape
	 * 
	 * @param g2 The graphics component
	 */
	@Override
	public void draw(Graphics2D g2) {
		Ellipse2D.Double top = new Ellipse2D.Double(x, y, width / 2, width / 2);
		Ellipse2D.Double bottom = new Ellipse2D.Double(x, y + width / 2, width / 2, width / 2);

		g2.setBackground(Color.black);
		g2.setColor(Color.white);
		g2.fill(top);
		g2.fill(bottom);
	}

	/**
	 * sets the x coordinate of the shape
	 * 
	 * @param x
	 */
	@Override
	public void setX(int x) {
		this.x = x;
	}

	/**
	 * sets the y coordinate of the shape
	 * 
	 * @param y
	 */
	@Override
	public void setY(int y) {
		this.y = y;
	}
}
