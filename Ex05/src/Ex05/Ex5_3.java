package Ex05;

public class Ex5_3 {
	public static void main(String[] args) {
		Shape r1 = new Rectangle( 0, 0, 100, 100);
		Shape r2 = new Triangle( 0, 0, 100, 100);
		
		System.out.println(r1.getArea());
		System.out.println(r2.getArea());
		
	}
}
