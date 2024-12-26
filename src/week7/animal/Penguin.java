package week7.animal;

// 자식 클래스: Penguin
public class Penguin extends Animal {

	public Penguin(String name) {
		super(name);
	}

	public void swim() {
		System.out.println(getName() + "가 물속을 헤엄칩니다!");
	}

	@Override
	public void makeSound() {
		System.out.println("꽥꽥?");
	}
}