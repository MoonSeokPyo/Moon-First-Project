import java.util.*;

public class Ex3_5 {
	public static void main(String[]args) {
		
//		boolean done = false;
//		while( !done ) {
//			Scanner scanner = new Scanner(System.in);
//			try {
//				System.out.print("�����: ");
//				int korean = scanner.nextInt();
//				System.out.print("�����: ");
//				int english = scanner.nextInt();
//				System.out.print("���м���: ");
//				int math = scanner.nextInt();
//				System.out.println("����� " + (korean+english+math)/3 + "�Դϴ�. ");
//				//break;
//			}
//			catch(Exception e ) {
//				System.out.println("�Ǽ����� �Է��ؼ� �����߻�!!");
//				System.out.println("�������� �Է��� �ּ���.");
//			}
//		}
		
//		int score[]=new int [3];
//		int num=0; // ��� ����
//		
//		String[] subject = {"����", "����", "����"};		
//		for(int i = 0; i < subject.length; i++) {
//			System.out.print(subject[i] + " ������ �Է��ϼ��� : ");
//			try {
//				Scanner input = new Scanner(System.in);
//				score[i]= input.nextInt();
//				num += score[i];
//				
//			}
//			catch(Exception e){
//				System.out.println("�Ǽ����� �Է��ؼ� �����߻�!!");
//				System.out.println("�������� �Է��� �ּ���.");
//				i--;
//			}
//			
//			
//		}
//		System.out.println("����� " + num/subject.length + "�Դϴ�. ");
		
		
		for(int i=0; i<3; i++) {
			System.out.println("test : ");
			Scanner input = new Scanner(System.in);
			int num= input.nextInt();
			System.out.println(num);
			input.close();
		}
	}
}