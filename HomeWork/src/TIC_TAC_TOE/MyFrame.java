package TIC_TAC_TOE;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class MyFrame extends JFrame implements ActionListener {
	private int o_count, x_count;
	private boolean full, x_win, o_win;
	private int blank;
	private int n = 20;		// ĭ ����
	private JTextField txt;
	private JPanel p;
	JButton[][] buttons = new JButton[n][n];
	private char turn = 'X';

	public MyFrame() {
		x_win = false;
		o_win = false;
		txt = new JTextField(/* ���� �־ ũ������ ���� */);
		txt.setEnabled(false);
		txt.setDisabledTextColor(Color.BLACK);
		txt.setText("������ �����մϴ�. " + turn + "��");
		p = new JPanel(/* ���� �־ ũ������ ���� */);
		p.setLayout(new GridLayout(n, n, 5, 5));
		Font f = new Font("Dialog", Font.ITALIC, 15);
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				buttons[i][j] = new JButton(" ");
				buttons[i][j].setFont(f);
				buttons[i][j].addActionListener(this);
				p.add(buttons[i][j]);
			}
		}
		add(p, BorderLayout.CENTER);
		add(txt, BorderLayout.SOUTH);
		// pack(); ũ�⸦ ���°� ��������
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(1100, 800);
		setLocation(500, 200);
		setTitle("TIC-TAC-TOE");
		setVisible(true);
	}
	
	
	// �̷��� ���ʿ䰡 ����.
	// ���� �� üũ�ϸ� �޸� ���� ���ϰ� 3x3�� Ȯ���ϱⰡ �ʹ� �����
	// ������ ���д� ���� �ֱٿ� ���� ��ư�� ���õ� �ٿ��� ���а� ������ ������
	// �ֱٿ� Ŭ���� ��ư���� ��� ������ �޾Ƴ��� �ش� ��ư ����, ����, �밢�� ��, �밢�� �Ʒ��� Ȯ���ϸ� �ȴ�.
	// �̷��� �ϸ� 3x3�� Ȯ�� �����ϰ� �ݺ��� �ξ� ���ؼ� �޸𸮵� �� �����Ѵ�
	// �����ε� ���� ���� ���α׷��� �̷��� ���� �ʾ�����???
	boolean CheckGame() {
		// ���� üũ
		// ����
		for (int i = 0; i < n; i++) {
			o_count = 0;
			x_count = 0;
			for (int j = 0; j < n; j++) {
				if (buttons[i][j].getText().equals("X") == true) {
					x_count++;
					o_count = 0;
				}
				else if (buttons[i][j].getText().equals("O") == true) {
					o_count++;
					x_count = 0;
				}
				else if(buttons[i][j].getText().equals(" ") == true) {
					o_count = 0;
					x_count = 0;
				}

				if (Check()) {
					return true;
				}
			}
		}
		// ����
		for (int i = 0; i < n; i++) {
			o_count = 0;
			x_count = 0;
			for (int j = 0; j < n; j++) {
				if (buttons[j][i].getText().equals("X") == true) {
					x_count++;
					o_count = 0;
				}
				else if (buttons[j][i].getText().equals("O") == true) {
					o_count++;
					x_count = 0;
				}
				else if(buttons[i][j].getText().equals(" ") == true) {
					o_count = 0;
					x_count = 0;
				}

				if (Check()) {
					return true;
				}
			}
		}
		///////////////////////////////// �밢��
		int x;
		/////////////////////////////////// �밢�� ��
		
//		o_count = 0;
//		x_count = 0;
//		x = 0;
//		for (int y = n - 1; y >= 0; y--) {
//			if (buttons[x][y].getText().equals("X") == true) {
//				x_count++;
//			}
//			else if (buttons[x][y].getText().equals("O") == true) {
//				o_count++;
//			}
//
//			if (Check()) {
//				return true;
//			}
//
//			if (x + 1 < n) {
//				x++;
//			}
//			else {
//				break;
//			}
//		}
		
		Loop_1: for (int i = 0; i < n; i++) {
			o_count = 0;
			x_count = 0;
			if(i == 0) {
				Loop_2:for(int j = 0; j < n; j++) {
					o_count = 0;
					x_count = 0;
					x = i;
					for(int y = n-(j+1); y >= 0; y--) {
						if (buttons[x][y].getText().equals("X") == true) {
							x_count++;
							o_count = 0;
						} 
						else if (buttons[x][y].getText().equals("O") == true) {
							o_count++;
							x_count = 0;
						}
						else if(buttons[x][y].getText().equals(" ") == true) {
							o_count = 0;
							x_count = 0;
						}


						if (Check()) {
							return true;
						}
						
						if(x + 1 < n) {
							x++;
						}
						else {
							continue Loop_2;
						}
					}
				}
				
			}
			else {
				x = i;
				for (int y = n-1; y >= 0; y--) {
					if (buttons[x][y].getText().equals("X") == true) {
						x_count++;
						o_count = 0;
					} 
					else if (buttons[x][y].getText().equals("O") == true) {
						o_count++;
						x_count = 0;
					}
					else if(buttons[x][y].getText().equals(" ") == true) {
						o_count = 0;
						x_count = 0;
					}


					if (Check()) {
						return true;
					}
					
					if (x + 1 < n) {
						x++;
					}
					else {
						continue Loop_1;
					}
				}
			}
		}
		////////////////////////////////////////////// �밢�� �Ʒ�

//			o_count = 0;
//			x_count = 0;
//			//k = i;
//			x = 0;
//			for(int j = 0; j < n; j++) {
//				if(buttons[x][j].getText().equals("X") == true) {
//					x_count++;
//				}
//				else if(buttons[x][j].getText().equals("O") == true) {
//					o_count++;
//				}
//				
//				if(Check()) {
//					return true;
//				}
//				
//				if(0 <= x + 1 && x + 1 <= n) {
//					x++;
//				}
//				else {
//					
//					break;
//				}
//			}

			
		Loop_1: for (int i = n - 1; i >= 0; i--) {
			o_count = 0;
			x_count = 0;
			if(i == 0) {
				Loop_2:for(int j = 0; j < n; j++) {
					o_count = 0;
					x_count = 0;
					x = i;
					for(int y = j; y < n; y++) {
						if (buttons[x][y].getText().equals("X") == true) {
							x_count++;
							o_count = 0;
						} 
						else if (buttons[x][y].getText().equals("O") == true) {
							o_count++;
							x_count = 0;
						}
						else if(buttons[x][y].getText().equals(" ") == true) {
							o_count = 0;
							x_count = 0;
						}

						if (Check()) {
							return true;
						}
						
						if(x + 1 < n) {
							x++;
						}
						else {
							continue Loop_2;
						}
					}
				}
				
			}
			else {
				x = i;
				for (int y = 0; y < n; y++) {
					if (buttons[x][y].getText().equals("X") == true) {
						x_count++;
						o_count = 0;
					} 
					else if (buttons[x][y].getText().equals("O") == true) {
						o_count++;
						x_count = 0;
					}
					else if(buttons[x][y].getText().equals(" ") == true) {
						o_count = 0;
						x_count = 0;
					}


					if (Check()) {
						return true;
					}
					
					if (x + 1 < n) {
						x++;
					}
					else {
						continue Loop_1;
					}
				}
			}
		}

		//////////////////////////////////////// ���� Ȯ��
		blank = 0;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (buttons[i][j].getText().equals(" ") == true) {
					blank++;
				}
			}
		}
		if (blank == 0) {
			full = true;
			return true;
		}

		return false;
	}

	boolean Check() {
		// ���� Ȯ��
		// n ��� 5�� �־ ����ó�� �����ϰ� �Ѵ�.
		
//		if (x_count == n) {
//			x_win = true;
//			return true;
//		}
//		else if(o_count == n) {
//			o_win = true;
//			return true;
//		}
		
		if (x_count == 5) {
			x_win = true;
			return true;
		}
		else if(o_count == 5) {
			o_win = true;
			return true;
		}
			
		return false;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (e.getSource() == buttons[i][j] && buttons[i][j].getText().equals(" ") == true) {
					if (turn == 'X') {
						buttons[i][j].setText("X");
						turn = 'O';
					} else {
						buttons[i][j].setText("O");
						turn = 'X';
					}
				}
			}
		}
		txt.setText("���� ��... " + turn + "��");
		if (CheckGame()) {
			if (x_win) {
				txt.setText("���� ���� X �¸�");
			} else if (o_win) {
				txt.setText("���� ���� O �¸�");
			} else if (full) {
				txt.setText("���� �� �� ���� ���� ���º�");
			}
			for (int i = 0; i < n; i++) {
				for (int j = 0; j < n; j++) {
					this.buttons[i][j].setEnabled(false);
				}
			}
			// �гθ� ��� ���� �𸣰��� ��ġ����?????
		}
	}
}