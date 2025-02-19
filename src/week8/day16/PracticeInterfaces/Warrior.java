package week8.day16.PracticeInterfaces;

public class Warrior implements AttackAble{
	@Override
	public void attack() {
		System.out.println("Warrior가 칼로 적을 공격합니다!");
	}
}
