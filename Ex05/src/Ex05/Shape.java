package Ex05;

public abstract class Shape {
	int _x1, _y1, _x2, _y2;
	// int x1, y1, x2, y2;
	// �̷��� �����ϰ� this�� ���� ����� �ִ�.
	
	public Shape() {
		setPos(0, 0, 0, 0);
	}
	public Shape(int x1, int y1, int x2, int y2) {
		setPos(x1, y1, x2, y2);
	}
	public void setPos(int x1, int y1, int x2, int y2) {
		_x1 = x1;
		_x2 = x2;
		_y1 = y1;
		_y2 = y2;
	}
	public abstract double getArea(); 
//	{
//		return 0;	
//	}
}
