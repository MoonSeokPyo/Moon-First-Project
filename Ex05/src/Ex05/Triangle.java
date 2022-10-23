package Ex05;

public class Triangle extends Shape {
	Triangle(int x1, int y1, int x2, int y2){
		
		super(x1, y1, x2, y2);
	}
	
	@Override
	public double getArea() {
		return (double)Math.abs((_x2-_x1)*(_y2-_y1)/2);
		
	}
}
