
public class Ex4_3 {
	public static void main(String[] args) {
		smartphone galaxy;
		galaxy=new smartphone();
		galaxy._modelName = "갤럭시 S22";
		galaxy._color= "blue";
		galaxy._cameranumber = 3;
		
		galaxy.call();
		galaxy.charge();
		galaxy.game();
		galaxy.pictur();
		
		System.out.println("모델명: " + galaxy._modelName);
		System.out.println("색상: " + galaxy._color);
		System.out.println("카메라 개수: " + galaxy._cameranumber);
	}
}
