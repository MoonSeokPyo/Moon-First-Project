import java.util.*;

public class Ex3_5 {
	public static void main(String[]args) {
		
//		boolean done = false;
//		while( !done ) {
//			Scanner scanner = new Scanner(System.in);
//			try {
//				System.out.print("국어성적: ");
//				int korean = scanner.nextInt();
//				System.out.print("영어성적: ");
//				int english = scanner.nextInt();
//				System.out.print("수학성적: ");
//				int math = scanner.nextInt();
//				System.out.println("평균은 " + (korean+english+math)/3 + "입니다. ");
//				//break;
//			}
//			catch(Exception e ) {
//				System.out.println("실수형을 입력해서 오류발생!!");
//				System.out.println("정수형을 입력해 주세요.");
//			}
//		}
		
//		int score[]=new int [3];
//		int num=0; // 평균 점수
//		
//		String[] subject = {"국어", "영어", "수학"};		
//		for(int i = 0; i < subject.length; i++) {
//			System.out.print(subject[i] + " 점수를 입력하세요 : ");
//			try {
//				Scanner input = new Scanner(System.in);
//				score[i]= input.nextInt();
//				num += score[i];
//				
//			}
//			catch(Exception e){
//				System.out.println("실수형을 입력해서 오류발생!!");
//				System.out.println("정수형을 입력해 주세요.");
//				i--;
//			}
//			
//			
//		}
//		System.out.println("평균은 " + num/subject.length + "입니다. ");
		
		
		for(int i=0; i<3; i++) {
			System.out.println("test : ");
			Scanner input = new Scanner(System.in);
			int num= input.nextInt();
			System.out.println(num);
			input.close();
		}
	}
}