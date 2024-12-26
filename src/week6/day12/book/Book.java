package week6.day12.book;

public class Book {
	private String title;      // 책 제목
	private String author;     // 저자
	private boolean isRented;  // 대여 상태

	// 생성자: 제목, 저자, 대여 상태 초기화
	public Book(String title, String author) {
		this.title = title;
		this.author = author;
		this.isRented = false; // 초기 상태는 대여 가능
	}

	// 책을 대여하는 메서드
	public void rentBook() {
		if (!isRented) {
			isRented = true;
			System.out.println(title + "이(가) 대여되었습니다.");
		} else {
			System.out.println(title + "은(는) 이미 대여 중입니다.");
		}
	}

	// 대여 상태 출력
	public void printStatus() {
		System.out.println("제목: " + title + ", 대여 상태: " + (isRented ? "대여 중" : "대여 가능"));
	}
}

