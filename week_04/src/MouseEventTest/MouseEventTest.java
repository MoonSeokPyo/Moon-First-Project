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
			// ���콺 �巡���ϸ� ȣ��ȴ�.
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
			// ���콺 Ŭ������ �ʰ� �̵��ϴ� ��쿡 ȣ��ȴ�.
			@Override
			public void mouseMoved(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
		});
	}
	
	public void paintComponent(Graphics g) {
		// super�� �־������μ� JPanel�� �� ����� �ٽ� �׸��� ���ΰ�??
		super.paintComponent(g);
		for (Rectangle r : array) {
			if(r != null) {
				g.drawRect(r.x, r.y, r.w, r.h);
			}
		}
	}
	// ����ڰ� ������Ʈ�� Ŭ���� ��쿡 ȣ��ȴ�.
	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	
	// ���콺�� ������Ʈ������ �������� ȣ��ȴ�.
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
	
	// �������� ������Ʈ������ �������� ȣ��ȴ�.
	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		index++;
	}

	// ���콺 Ŀ���� ������Ʈ�� ���� ȣ��ȴ�.
	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	// ���콺�� ������Ʈ���� ������ ȣ��ȴ�.
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
		
		FileNameExtensionFilter filter = new FileNameExtensionFilter("������ ����(*.data)", "data");
        fc.setFileFilter(filter);
		
		bt_1 = new JButton("����");
		bt_2 = new JButton("�ҷ�����");
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
		setTitle("���콺�� �簢�� �׸���");
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