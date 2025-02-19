package week8.day15.teacher;

public class ScienceTeacher extends Teacher{

	public ScienceTeacher(String name) {
		super(name);
	}

	@Override
	public void teachSubject() {
		System.out.println(name + " 선생님이 과학을 가르칩니다.");
	}
}
