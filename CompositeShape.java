import java.awt.Graphics2D;

public interface CompositeShape {
	/**
	 * Draws the shape.
	 * 
	 * @param g2 the graphics context
	 */
	public void draw(Graphics2D g2);

	/**
	 * returns the width of the shape
	 * 
	 * @returns width width of the shape
	 */
	public int getWidth();

	/**
	 * sets the x coordinate of the shape
	 * 
	 * @param x
	 */
	public void setX(int x);

	/**
	 * sets the y coordinate of the shape
	 * 
	 * @param y
	 */
	public void setY(int y);
}
