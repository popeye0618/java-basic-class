package week8.day15.employee;

public abstract class Employee {
	private String name;
	private String role;

	public Employee(String name, String role) {
		this.name = name;
		this.role = role;
	}

	// 일반 메서드
	public void startWork() {
		System.out.println(name + " (" + role + ")이(가) 일을 시작합니다.");
	}

	// 추상 메서드
	public abstract void performDuties();

	public String getName() {
		return name;
	}

	public String getRole() {
		return role;
	}
}
