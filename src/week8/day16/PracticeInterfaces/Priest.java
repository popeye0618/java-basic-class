package week8.day16.PracticeInterfaces;

public class Priest implements Healable{
	@Override
	public void heal() {
		System.out.println("Priest가 아군을 치유합니다!");
	}
}
