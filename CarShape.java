import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.awt.geom.Point2D;
import java.awt.geom.Rectangle2D;

/**
 * some parts of this code were borrowed from the textbook
 * 
 * @author Cay Hortsmann
 * @modifiedBy Taran Chowdhury
 */
public class CarShape implements CompositeShape {
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
	public CarShape(int x, int y, int width) {
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
	 * This method creates a Car Shape
	 * 
	 * @param g2 The graphics component
	 */
	@Override
	public void draw(Graphics2D g2) {
		Rectangle2D.Double body = new Rectangle2D.Double(x, y + width / 6, width - 1, width / 6);
		Ellipse2D.Double frontTire = new Ellipse2D.Double(x + width / 6, y + width / 3, width / 6, width / 6);
		Ellipse2D.Double rearTire = new Ellipse2D.Double(x + width * 2 / 3, y + width / 3, width / 6, width / 6);

		// the bottom of the front windshield
		Point2D.Double r1 = new Point2D.Double(x + width / 6, y + width / 6);
		// the front of the roof
		Point2D.Double r2 = new Point2D.Double(x + width / 3, y);
		// the rear of the roof
		Point2D.Double r3 = new Point2D.Double(x + width * 2 / 3, y);
		// the bottom of the rear windshield
		Point2D.Double r4 = new Point2D.Double(x + width * 5 / 6, y + width / 6);

		Line2D.Double frontWindshield = new Line2D.Double(r1, r2);
		Line2D.Double roofTop = new Line2D.Double(r2, r3);
		Line2D.Double rearWindshield = new Line2D.Double(r3, r4);

		g2.setColor(Color.black);
		g2.fill(frontTire);
		g2.fill(rearTire);
		g2.setColor(Color.red);
		g2.fill(body);
		g2.setColor(Color.blue);
		g2.draw(frontWindshield);
		g2.setColor(Color.red);
		g2.draw(roofTop);
		g2.setColor(Color.blue);
		g2.draw(rearWindshield);
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
