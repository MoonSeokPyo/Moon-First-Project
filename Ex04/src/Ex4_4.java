
public class Ex4_4 {
	public static void main(String[] args) {
		smartphone galaxy;
		galaxy=new smartphone("������ S22", "blue", 3);

		galaxy.call();
		galaxy.charge();
		galaxy.game();
		galaxy.pictur();
		
		System.out.println("�𵨸�: " + galaxy._modelName);
		System.out.println("����: " + galaxy._color);
		System.out.println("ī�޶� ����: " + galaxy._cameranumber);
	}
}