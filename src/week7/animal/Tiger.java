package week7.animal;

public class Tiger extends Animal{

	public Tiger(String name) {
		super(name);
	}

	// 추가로 호랑이만의 기능
	public void hunt() {
		System.out.println("호랑이가 동물을 사냥합니다!!");
	}
}
