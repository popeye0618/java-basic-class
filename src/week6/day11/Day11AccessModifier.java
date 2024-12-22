package week6.day11;

public class Day11AccessModifier {
	public String publicField = "누구나 접근 가능";
	private String privateField = "클래스 내부에서만 접근 가능";

	public String getPrivateField() {
		return privateField; // private 변수에 접근하는 public 메서드
	}

	public void setPrivateField(String value) {
		privateField = value; // private 변수 값을 수정하는 public 메서드
	}

	public static void main(String[] args) {
		Day11AccessModifier example = new Day11AccessModifier();

		// public 접근
		System.out.println(example.publicField);

		// private 접근 (직접 접근 불가)
		// System.out.println(example.privateField); // 오류 발생

		// private 접근 (getter 사용)
		System.out.println(example.getPrivateField());

		// private 값 수정 (setter 사용)
		example.setPrivateField("새로운 값");
		System.out.println(example.getPrivateField());
	}
}
