package TIC_TAC_TOE;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class MyFrame extends JFrame implements ActionListener {
	private int o_count, x_count;
	private boolean full, x_win, o_win;
	private int blank;
	private int n = 20;		// 칸 설정
	private JTextField txt;
	private JPanel p;
	JButton[][] buttons = new JButton[n][n];
	private char turn = 'X';

	public MyFrame() {
		x_win = false;
		o_win = false;
		txt = new JTextField(/* 값을 넣어서 크기지정 가능 */);
		txt.setEnabled(false);
		txt.setDisabledTextColor(Color.BLACK);
		txt.setText("게임을 시작합니다. " + turn + "턴");
		p = new JPanel(/* 값을 넣어서 크기지정 가능 */);
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
		// pack(); 크기를 딱맞게 조절해줌
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(1100, 800);
		setLocation(500, 200);
		setTitle("TIC-TAC-TOE");
		setVisible(true);
	}
	
	
	// 이렇게 할필요가 없다.
	// 줄을 다 체크하면 메모리 낭비가 심하고 3x3을 확인하기가 너무 힘들다
	// 어차피 승패는 가장 최근에 누른 버튼과 관련된 줄에서 승패가 나오기 때문에
	// 최근에 클릭한 버튼에서 행과 열값을 받아내서 해당 버튼 가로, 세로, 대각선 위, 대각선 아래만 확인하면 된다.
	// 이렇게 하면 3x3도 확인 가능하고 반복도 훨씬 덜해서 메모리도 덜 차지한다
	// 추측인데 많은 오목 프로그램이 이렇게 하지 않았을까???
	boolean CheckGame() {
		// 승자 체크
		// 가로
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
		// 세로
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
		///////////////////////////////// 대각선
		int x;
		/////////////////////////////////// 대각선 위
		
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
		////////////////////////////////////////////// 대각선 아래

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

		//////////////////////////////////////// 공간 확인
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
		// 승자 확인
		// n 대신 5를 넣어서 오목처럼 가능하게 한다.
		
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
		txt.setText("게임 중... " + turn + "턴");
		if (CheckGame()) {
			if (x_win) {
				txt.setText("게임 종료 X 승리");
			} else if (o_win) {
				txt.setText("게임 종료 O 승리");
			} else if (full) {
				txt.setText("공간 꽉 참 게임 종료 무승부");
			}
			for (int i = 0; i < n; i++) {
				for (int j = 0; j < n; j++) {
					this.buttons[i][j].setEnabled(false);
				}
			}
			// 패널만 사용 금지 모르겠음 해치웠나?????
		}
	}
}