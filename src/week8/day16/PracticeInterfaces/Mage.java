package week8.day16.PracticeInterfaces;

public class Mage implements AttackAble, Healable{
	@Override
	public void attack() {
		System.out.println("Mage가 마법으로 적을 공격합니다!");
	}

	@Override
	public void heal() {
		System.out.println("Mage가 자신을 회복합니다!");
	}
}
