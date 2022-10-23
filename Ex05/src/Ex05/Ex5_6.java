package Ex05;

public class Ex5_6 {
	public static void main(String[] args) {
		Mammal [] animals = new Mammal[3];
		animals[0] = new Cat();
		animals[1] = new Dog();
		animals[2] = new Pig();
		IJump [] aa = new IJump[2];
		aa[0] = (IJump) animals[0];
		aa[1] = (IJump) animals[1];
		for(int i=0; i < aa.length; ++i) {
			aa[i].jump();
		}
		
	}
}
