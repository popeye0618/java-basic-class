package week8.day16;

import week8.day16.PracticeInterfaces.AttackAble;
import week8.day16.PracticeInterfaces.Healable;
import week8.day16.PracticeInterfaces.Mage;
import week8.day16.PracticeInterfaces.Priest;
import week8.day16.PracticeInterfaces.Warrior;

public class Day16Practice {
	public static void main(String[] args) {
		// 각 캐릭터 생성
		AttackAble warrior = new Warrior();
		Mage mage = new Mage();
		Healable priest = new Priest();

		// 동작 확인
		warrior.attack();
		mage.attack();
		mage.heal();
		priest.heal();
	}
}
