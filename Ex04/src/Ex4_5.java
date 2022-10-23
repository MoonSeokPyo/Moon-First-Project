import java.util.*;

public class Ex4_5 {
	public static void main(String[] args) {
		int num;
		
		
		System.out.println("Input N? : ");
		Scanner scanner=new Scanner(System.in);
		num=scanner.nextInt();
		
		smartphone[] s = new smartphone[num];
		
		for(int i=0; i<s.length; i++) {
			s[i] = new smartphone();
		}
		
//		for(int i=0; i<s.length; i++) {
//			s[i] = new smartphone(i);
//		}
//		
//		for(int i=0; i<s.length; i++) {
//			System.out.println("추가한 값은 : "+ s[i]._num);
//		}
		
		scanner.close();
		
	}
}
