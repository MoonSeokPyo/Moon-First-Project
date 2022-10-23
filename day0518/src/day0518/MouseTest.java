package day0518;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class MouseTest {
	private JFrame f;
	private TextField tf;
	public static void main(String args[]) {
		MouseTest two = new MouseTest();
		two.go();
	}
	public void go() {
		f = new JFrame("Two listeners example");
		f.add (new Label ("Click and drag the mouse"),
				BorderLayout.NORTH);
		tf = new TextField (30);
		f.add (tf, BorderLayout.SOUTH);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		MouseHandler mouse = new MouseHandler();
		MouseMotionHandler mouseMotion
		= new MouseMotionHandler();
		f.addMouseListener (mouse);
		f.addMouseMotionListener(mouseMotion);
		f.setSize(300, 200);
		f.setVisible(true);
	}
	class MouseHandler implements MouseListener {
		public void mouseEntered (MouseEvent e) {
			String s = "The mouse entered";
			tf.setText (s);
		}
		public void mouseExited (MouseEvent e) {
			String s = "The mouse has left the building";
			tf.setText (s);
		}
		public void mousePressed (MouseEvent e) {
			String s = "The mouse has been pressed";
			tf.setText (s);
		}
		public void mouseClicked (MouseEvent e) {
			String s = "The mouse has been clicked";
			tf.setText (s);
		}
		public void mouseReleased (MouseEvent e) {
			String s = "The mouse has been released";
			tf.setText (s);
		}
	}
	class MouseMotionHandler implements MouseMotionListener
	{
		public void mouseDragged (MouseEvent e) {
			String s = "Mouse dragging: X = " + e.getX() +
					" Y = " + e.getY();
			tf.setText (s);
		}
		public void mouseMoved (MouseEvent e) { }
	}
}