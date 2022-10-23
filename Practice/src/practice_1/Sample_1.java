package practice_1;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

class ImagePanel extends JPanel {
	Image [] _image =new Image[3];
	Image _fullimage;
	Toolkit toolkit = getToolkit();
	public int _check=0;
	public int _cells[][] = {
			{0,1,2},
			{1,2,0},
			{2,0,1}
	};
	ImagePanel(){
		_fullimage = toolkit.getImage("main.jpg");
		for(int i = 0; i < 3; i++) {
			_image[i] = toolkit.getImage("image" + (i + 1) + ".jpg");
		}
	}
	public void paint(Graphics g) {
		System.out.println("/////////////");
		g.clearRect(0, 0, getWidth(), getHeight());
		if(_check ==1) {
		for(int row = 0; row < 3; row++) {
			for(int col = 0; col < 3; col++) {
				int x = col * 200;
				int y = row * 200;
				g.drawImage(_image[_cells[row][col]], x, y, 200, 200, this);
			}
		}
		}
		else if(_check == 0) {
			g.drawImage(_fullimage, 0, 0, 500, 500, this);
		}
	}
}

class MouseHandler implements MouseListener {
	ImagePanel _imagePanel;
	public MouseHandler(ImagePanel imagePanel) {
		_imagePanel = imagePanel;
	}
	public void mouseEntered (MouseEvent e) {
		
	}
	public void mouseExited (MouseEvent e) {
		
	}
	public void mousePressed (MouseEvent e) {
		
	}
	public void mouseClicked (MouseEvent e) {
		int col = e.getX() / 200;
		int row = e.getY() / 200;
		_imagePanel._cells[row][col] = 0;
		_imagePanel._check=1;
		_imagePanel.repaint();
	}
	public void mouseReleased (MouseEvent e) {
		
	}
}

class Sample_1 {
	public static void main(String[] args) {
		
		JFrame frame = new JFrame("이미지 로딩 프로그램");
		frame.setLocation(500, 200);
		frame.setPreferredSize(new Dimension(800, 800));
		Container contentPane = frame.getContentPane();
		ImagePanel imagePanel = new ImagePanel();
		imagePanel.addMouseListener(new MouseHandler(imagePanel));
		contentPane.add(imagePanel, BorderLayout .CENTER);
		
		JPanel controlPanel = new JPanel();
		JTextField text = new JTextField(30);
		JButton button = new JButton("이미지 로드");
		controlPanel.add(text);
		controlPanel.add(button);
		contentPane.add(controlPanel, BorderLayout.SOUTH);
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.pack();
		frame.setVisible(true);
	}
}
