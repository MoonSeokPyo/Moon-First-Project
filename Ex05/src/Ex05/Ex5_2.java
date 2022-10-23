package Ex05;

public class Ex5_2 {
	public static void main(String[] args) {
		Rectangle r1 = new Rectangle( 0, 0, 100, 100);
		Triangle r2 = new Triangle( 0, 0, 100, 100);
		
		System.out.println(r1._width);
		System.out.println(r1._height);
		System.out.println(r2.getArea());
		
	}
}
