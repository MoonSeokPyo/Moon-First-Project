package MouseEventTest;

import java.awt.*;
import java.awt.event.*;
import java.awt.image.*;
import java.io.*;
import javax.swing.*;
import javax.swing.filechooser.FileNameExtensionFilter;

class Rectangle{
	int x, y, w, h;
}
class MyPanel extends JPanel implements MouseListener{
//	BufferedImage img = null;
//	int img_x = 0, img_y = 0;
	Rectangle[] array = new Rectangle[100];
	int index = 0;
	int st_x, st_y;
	
	public MyPanel() {
		//setSize(300, 300);
		setPreferredSize(new Dimension(600, 500));
		this.addMouseListener(this);
		this.addMouseMotionListener(new MouseMotionListener() {
			// 마우스 드래그하면 호출된다.
			@Override
			public void mouseDragged(MouseEvent e) {
				// TODO Auto-generated method stub
				if (index > 100) {
					return;
				}
				
				if (e.getX() - st_x == 0 || e.getY() - st_y == 0) {
					array[index].x = st_x;
					array[index].y = st_y;
					repaint();
					return;
				}
				
				int weight;
				int height;
				
				if(e.getX() - st_x > 0)	weight = e.getX()-array[index].x;
				else {
					weight = st_x - e.getX();
					array[index].x = e.getX();
				}
				
				if( e.getY() - st_y > 0) height = e.getY()-array[index].y;
				else {
					height = st_y - e.getY();
					array[index].y = e.getY();
				}
				

				
				array[index].w = weight;
				array[index].h = height;
				repaint();
				
			}
			// 마우스 클릭되지 않고 이동하는 경우에 호출된다.
			@Override
			public void mouseMoved(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
		});
	}
	
	public void paintComponent(Graphics g) {
		// super를 넣어줌으로서 JPanel을 다 지우고 다시 그리는 것인가??
		super.paintComponent(g);
		for (Rectangle r : array) {
			if(r != null) {
				g.drawRect(r.x, r.y, r.w, r.h);
			}
		}
	}
	// 사용자가 컴포넌트를 클릭한 경우에 호출된다.
	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	
	// 마우스가 컴포넌트위에서 눌려지면 호출된다.
	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		if (index > 100) {
			return;
		}
		array[index] = new Rectangle();
		st_x = e.getX();
		st_y = e.getY();
		array[index].x = st_x;
		array[index].y = st_y;
		//index++;
	}
	
	// 마수스가 컴포넌트위에서 떼어지면 호출된다.
	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		index++;
	}

	// 마우스 커서가 컴포넌트로 들어가면 호출된다.
	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	// 마우스가 컴포넌트에서 나가면 호출된다.
	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	
}
class ButtonPanel extends JPanel implements ActionListener{
	JButton bt_1, bt_2;
	JFileChooser fc;
	public ButtonPanel(){
		//setSize(300, 300);
		//setPreferredSize(new Dimension(600, 500));
		setBackground(Color.gray);
		fc = new JFileChooser("C:\\\\Java Works\\\\week_04");
		//fc.setCurrentDirectory(new File(""));
		//fc.setDialogTitle("");
		
		FileNameExtensionFilter filter = new FileNameExtensionFilter("데이터 파일(*.data)", "data");
        fc.setFileFilter(filter);
		
		bt_1 = new JButton("저장");
		bt_2 = new JButton("불러오기");
		bt_1.addActionListener(this);
		bt_2.addActionListener(this);
		add(bt_1);
		add(bt_2);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource() == bt_1) {
			int returnVal = fc.showSaveDialog(this);
			if(returnVal == JFileChooser.APPROVE_OPTION) {
				File file = fc.getSelectedFile();
				
			}
			else {
				
			}
		}
		else if(e.getSource() == bt_2) {
			int returnVal = fc.showOpenDialog(this);
			if(returnVal == JFileChooser.APPROVE_OPTION) {
				File file = fc.getSelectedFile();
			}
			else {
				
			}
		}
	}
	
}
public class MouseEventTest extends JFrame{
	public MouseEventTest() {
		//setSize(600, 500);
		setLayout(new BorderLayout());
		setTitle("마우스로 사각형 그리기");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		add(new MyPanel(), BorderLayout.CENTER);
		//this.setPreferredSize(new ); 
		add(new ButtonPanel(), BorderLayout.SOUTH);
		//setPreferredSize(new java.awt.Dimension(300, 150));
		setLocation(500, 200);
		pack();
		setVisible(true);
	}
	public static void main(String[] args) {
		MouseEventTest s = new MouseEventTest();
	}
}
