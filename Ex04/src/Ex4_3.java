
public class Ex4_3 {
	public static void main(String[] args) {
		smartphone galaxy;
		galaxy=new smartphone();
		galaxy._modelName = "������ S22";
		galaxy._color= "blue";
		galaxy._cameranumber = 3;
		
		galaxy.call();
		galaxy.charge();
		galaxy.game();
		galaxy.pictur();
		
		System.out.println("�𵨸�: " + galaxy._modelName);
		System.out.println("����: " + galaxy._color);
		System.out.println("ī�޶� ����: " + galaxy._cameranumber);
	}
}
