package Ex05;

public class Ex5_5 {
	public static void main(String[] args) {
		Mammal[] animals = new Mammal[3];
		animals[0] = new Cat();
		animals[1] = new Dog();
		animals[2] = new Pig();
		for (int i=0; i < animals.length; ++i) {
			animals[i].speak();
		}
	}
}
