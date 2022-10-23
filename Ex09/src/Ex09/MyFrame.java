package Ex09;
import java.awt.*;
import javax.swing.*;

public class MyFrame extends JFrame {
	public MyFrame() {
		setTitle("300x300 스윙 프레임 만들기");
		setPreferredSize(new Dimension(300,300));
		pack();						//  생성???
		setVisible(true);			// 프레임 출력
		// frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public static void main(String[] args) {
		MyFrame myWin = new MyFrame();
		//myWin.setVisible(true);
	}
}
