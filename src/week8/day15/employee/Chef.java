package week8.day15.employee;

public class Chef extends Employee{

	public Chef(String name) {
		super(name, "요리사");
	}

	@Override
	public void performDuties() {
		System.out.println(getName() + "이(가) 음식을 준비합니다.");
	}
}
