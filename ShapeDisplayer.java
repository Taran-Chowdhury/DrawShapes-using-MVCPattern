import java.awt.BorderLayout;
import java.awt.Color;

import java.awt.Dimension;
import java.awt.Point;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.Icon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 * A class that displays the selected shape
 * 
 * @author Taran Chowdhury
 *
 */
public class ShapeDisplayer {
	private static JButton carButton, snowManButton, my_ShapeButton;
	private static JFrame frame;
	private static JPanel buttons;
	private static Point mousePoint;
	private static CompositeShape currShape;

	/**
	 * This is the main function.
	 * 
	 * It creates the necessary JComponents required to execute the program. It
	 * creates the JButton and their action Listeners for selecting shapes It also
	 * attaches a mouse listener to the component used to draw shapes. Every time
	 * the user clicks on the button it creates a new shape and paints it on the
	 * viewComponent using the mouseListner coordinates.
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		frame = new JFrame();
		ViewComponent component = new ViewComponent();
		buttons = new JPanel();
		component.setPreferredSize(new Dimension(600, 600));
		component.setBackground(Color.pink);

		/**
		 * This MouseListener helps identify the specific coordinates where the shape
		 * needs to be drawn Adds the shape with the coordinates to the panel
		 */
		component.addMouseListener(new MouseListener() {

			@Override
			public void mouseClicked(MouseEvent e) {
				// TODO Auto-generated method stub

			}

			@Override
			public void mousePressed(MouseEvent e) {
				mousePoint = e.getPoint();
				currShape.setX((int) mousePoint.getX());
				currShape.setY((int) mousePoint.getY());
				component.addShape(currShape);

			}

			@Override
			public void mouseReleased(MouseEvent e) {

			}

			@Override
			public void mouseEntered(MouseEvent e) {
				// TODO Auto-generated method stub

			}

			@Override
			public void mouseExited(MouseEvent e) {
				// TODO Auto-generated method stub

			}

		});

		// JButton for the Car shape
		carButton = new JButton();
		carButton.setBackground(Color.gray);
		carButton.setIcon(iconFactory(new CarShape(17, 17, 35)));
		carButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				currShape = new CarShape(0, 0, 50);
			}
		});

		// JButton for the snowman shape
		snowManButton = new JButton();
		snowManButton.setBackground(Color.gray);
		snowManButton.setIcon(iconFactory(new SnowMan(25, 5, 35)));
		snowManButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				currShape = new SnowMan(0, 0, 50);
			}
		});

		// JButton for my custom shape
		my_ShapeButton = new JButton();
		my_ShapeButton.setBackground(Color.gray);
		my_ShapeButton.setIcon(iconFactory(new My_Shape(17, 5, 35)));
		my_ShapeButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				currShape = new My_Shape(0, 0, 50);
			}
		});

		buttons.add(carButton);
		buttons.add(snowManButton);
		buttons.add(my_ShapeButton);
		frame.add(buttons, BorderLayout.NORTH);
		frame.add(component, BorderLayout.CENTER);

		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.pack();
		frame.setVisible(true);
	}

	/**
	 * This method creates a shape icon and returns it.
	 * 
	 * @param shape the shape whose icon needs to be created for its button
	 * @return ShapeIcon the icon for the button
	 */
	public static Icon iconFactory(CompositeShape shape) {
		return new ShapeIcon(shape, 35);
	}
}
