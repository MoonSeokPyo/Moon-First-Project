package Ex05;

public final class Rectangle extends Shape {
	int _width, _height;
	Rectangle(int x1, int y1, int x2, int y2) {
		super(x1, y1, x2, y2);
		// super�� ���� �տ� �;� �Ѵٰ� �ϼ̴�.
		
		_width=x2-x1;
		_height=y2-y1;
		//setPos(x1,y1,x2,y2);
		
		//super(x1, y1, x2, y2);
		// ������ ���.
	}
	
	@Override
	public double getArea() {
		return _width*_height;
		//(double)Math.abs(this.width*this.height);
		
	}
}
