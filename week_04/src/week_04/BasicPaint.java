package week_04;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class BasicPaint {
	public static void main(String[] args) {
		JFrame f = new JFrame("그래픽 기초 프로그램");
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.add(new MyPanel());
		
		f.setSize(300, 200);
		f.setVisible(true);
	}
}
class MyPanel extends JPanel{
	private int squareX = 50;
	private int squareY = 50;
	private int squareW = 20;
	private int squareH = 20;
	public MyPanel() {
		setBorder(BorderFactory.createLineBorder(Color.black));
		addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e) {
				moveSquare(e.getX(), e.getY());
			}
		});
		
		addMouseMotionListener(new MouseAdapter() {
			public void mouseDragged(MouseEvent e) {
				moveSquare(e.getX(), e.getY());
			}
		});
		
	}
	public void moveSquare(int x, int y) {
		// OFFSET은 1픽셀을 더 줘야해서 인가?
		// drawRect로 그린 사각형 테두리 때문인듯
		int OFFSET = 1;
		if((squareX != x) || (squareY != y)) {
			//repaint(squareX, squareY, squareW + OFFSET, squareH + OFFSET);
			
			//repaint(squareX, squareY, squareW + OFFSET, squareH + OFFSET);
			squareX = x;
			squareY = y;
			//repaint(squareX, squareY, squareW + OFFSET, squareH + OFFSET);
			
			repaint();
			
//			repaint(squareX, squareY, squareW, squareH);
//			squareX = x;
//			squareY = y;
//			//repaint(squareX, squareY, squareW, squareH);
//			repaint();
		}
	}
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.drawString("마우스를 클릭하면 사각형이 그려집니다.!", 10, 20);
		g.setColor(Color.RED);
		g.fillRect(squareX, squareY, squareW, squareH);
		g.setColor(Color.BLACK);
		g.drawRect(squareX, squareY, squareW, squareH);
	}
	
}
// p.518
// 책의 43번행 주석처리 해봐라