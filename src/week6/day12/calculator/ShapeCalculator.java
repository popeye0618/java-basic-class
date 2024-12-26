package week6.day12.calculator;

public class ShapeCalculator {
	// 정사각형의 면적 계산
	public int calculateArea(int side) {
		return side * side;
	}

	// 직사각형의 면적 계산
	public int calculateArea(int width, int height) {
		return width * height;
	}

	// 원의 면적 계산
	public double calculateArea(double radius) {
		return 3.14 * radius * radius;
	}
}
