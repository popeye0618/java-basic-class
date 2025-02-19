package week8.day15.teacher;

public abstract class Teacher {
	protected String name;

	// 생성자
	public Teacher(String name) {
		this.name = name;
	}

	// 일반 메서드
	public void introduce() {
		System.out.println("안녕하세요, 저는 " + name + " 선생님입니다.");
	}

	// 추상 메서드
	public abstract void teachSubject();
}
