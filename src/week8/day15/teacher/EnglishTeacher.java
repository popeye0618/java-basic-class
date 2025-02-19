package week8.day15.teacher;

public class EnglishTeacher extends Teacher{

	public EnglishTeacher(String name) {
		super(name);
	}

	@Override
	public void teachSubject() {
		System.out.println(name + " 선생님이 영어를 가르칩니다.");
	}
}
