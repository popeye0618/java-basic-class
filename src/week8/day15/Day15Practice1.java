package week8.day15;

import week8.day15.employee.Artist;
import week8.day15.employee.Chef;

public class Day15Practice1 {
	public static void main(String[] args) {

		// 실습 문제 1
		Artist artist = new Artist("최예술가");
		Chef chef = new Chef("오셰프");

		artist.startWork();
		chef.startWork();

		artist.performDuties();
		chef.performDuties();
	}
}
