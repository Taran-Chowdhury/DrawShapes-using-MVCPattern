import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Shape;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.awt.geom.Point2D;
import java.awt.geom.Rectangle2D;

/**
 * A class that creates a custom shape
 * 
 * @author Taran Chowdhury
 *
 */
public class My_Shape implements CompositeShape {
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
	public My_Shape(int x, int y, int width) {
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
	 * This method creates a custom Shape
	 * 
	 * @param g2 The graphics component
	 */
	@Override
	public void draw(Graphics2D g2) {
		Rectangle2D.Double rect = new Rectangle2D.Double(x, y, width, width);
		Ellipse2D.Double circle = new Ellipse2D.Double(x, y, width, width);
		Line2D.Double line1 = new Line2D.Double(x, y, x + width, y + width);
		Line2D.Double line2 = new Line2D.Double(x + width, y, x, y + width);
		Ellipse2D.Double point = new Ellipse2D.Double((int) circle.getCenterX() - 2, (int) circle.getCenterY() - 2,
				width / 5, width / 5);

		g2.setStroke(new BasicStroke(2));
		g2.setColor(Color.red);
		g2.draw(rect);
		g2.setColor(Color.green);
		g2.draw(circle);
		g2.setColor(Color.blue);
		g2.draw(line1);
		g2.draw(line2);
		g2.setColor(Color.pink);
		g2.fill(point);
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
