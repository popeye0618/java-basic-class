package week6.day12.payment;

public class Payment {
	// 두 상품 가격(정수)의 합을 계산하는 메서드
	public int calculate(int price1, int price2) {
		return price1 + price2;
	}

	// 세 상품 가격(정수)의 합을 계산하는 메서드
	public int calculate(int price1, int price2, int price3) {
		return price1 + price2 + price3;
	}

	// 두 상품 가격(실수)의 합을 계산하는 메서드
	public double calculate(double price1, double price2) {
		return price1 + price2;
	}
}

