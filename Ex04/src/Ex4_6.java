
public class Ex4_6 {
	public static void main(String[] args) {
		Calc c = new Calc();
		
//		{
//			Calc local = new Calc();
//		
//		// 영역을 벗어나면 local을 사용할 수 없다.
//		}
		
		
		System.out.println("sum(1, 1) : " + c.sum(1, 1) + "\n");
		System.out.println("sum(2.0, 3.0) : " + c.sum(2.0, 3.0) + "\n");
		System.out.println("sum(1, 2.0) : " + c.sum(1, 2.0) + "\n");
		
//		c.sum(1, 2.) 으로도 가능하다.
		
	}
}
