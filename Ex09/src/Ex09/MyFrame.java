package Ex09;
import java.awt.*;
import javax.swing.*;

public class MyFrame extends JFrame {
	public MyFrame() {
		setTitle("300x300 ���� ������ �����");
		setPreferredSize(new Dimension(300,300));
		pack();						//  ����???
		setVisible(true);			// ������ ���
		// frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public static void main(String[] args) {
		MyFrame myWin = new MyFrame();
		//myWin.setVisible(true);
	}
}
