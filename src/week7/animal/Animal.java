package week7.animal;

public class Animal {
	private String name;

	public Animal(String name) {
		this.name = name;
	}

	// 동물의 소리를 출력하는 메서드
	public void makeSound() {
		System.out.println("동물이 소리를 냅니다.");
	}

	public void eat() {
		System.out.println(name + "가 먹이를 먹습니다.");
	}

	public String getName() {
		return name;
	}
}
