package week8.day15.teacher;

public class MathTeacher extends Teacher{

	public MathTeacher(String name) {
		super(name);
	}

	@Override
	public void teachSubject() {
		System.out.println(name + " 선생님이 수학을 가르칩니다.");
	}
}
