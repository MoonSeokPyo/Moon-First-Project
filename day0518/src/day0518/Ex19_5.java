package day0518;

import java.awt.*; 
import javax.swing.*;

public class Ex19_5 {
	static class CarDrawingPanel extends JPanel {
		public void paint(Graphics g) {
			g.setColor(Color.YELLOW);
			g.fillOval(50, 50, 200, 200);
			
			g.setColor(Color.RED);
			g.fillOval(140, 200, 25, 10);
			
			g.setColor(Color.BLACK);
			g.fillOval(50, 50, 200, 70);
			g.drawLine(90, 130, 130, 130);
			g.drawLine(170, 130, 210, 130);
			g.drawLine(150, 140, 140, 180);
			g.drawLine(140, 180, 160, 180);
			
			g.setColor(Color.WHITE);
			g.fillOval(95, 130, 30, 40);
			g.fillOval(175, 130, 30, 40);
			
			g.setColor(Color.BLACK);
			g.fillOval(105, 140, 15, 15);
			g.fillOval(180, 140, 15, 15);
//			g.drawRect(100, 110, 200, 40);
//			g.drawRect(150, 70, 100, 40);
//			g.drawOval(125, 150, 30, 30);
//			g.drawOval(245, 150, 30, 30);
			
		}
	}
	
	public static void main(String[] args) {
		JFrame frame = new JFrame("자상화 프로그램");
		frame.setLocation(500, 200);
		frame.setPreferredSize(new Dimension(400, 300));
		Container contentPane = frame.getContentPane();
		CarDrawingPanel drawingPanel = new Ex19_5.CarDrawingPanel();
		contentPane.add(drawingPanel);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.pack();
		frame.setVisible(true);
	}
}
