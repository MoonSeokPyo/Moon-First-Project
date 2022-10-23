package Ex09;

import javax.swing.*;
import java.awt.*;

public class GridLayoutEx extends JFrame {
	public GridLayoutEx() {
		setTitle("GridLayout Sample");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		
		GridLayout grid = new GridLayout(4,2);
		grid.setVgap(5);
		
		
		c.setLayout(grid);
		c.add(new JLabel("�̸�"));
		c.add(new JTextField(""));
		c.add(new JLabel("�й�"));
		c.add(new JTextField(""));
		c.add(new JLabel("�а�"));
		c.add(new JTextField(""));
		c.add(new JLabel("����"));
		c.add(new JTextField(""));
		
		setPreferredSize(new Dimension(300, 150));
		pack();
		setVisible(true);
		
	}
}
