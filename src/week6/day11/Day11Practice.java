package week6.day11;

import java.util.Scanner;

import week6.day11.user.User;

public class Day11Practice {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		User user = new User();

		// 회원가입
		System.out.print("아이디를 입력하세요: ");
		user.setId(sc.next());

		System.out.print("비밀번호를 입력하세요: ");
		user.setPassword(sc.next());

		System.out.println("당신의 아이디: " + user.getId());
		System.out.println("당신의 비밀번호: " + user.getPassword());
		System.out.println("가입이 완료되었습니다.");

		// 비밀번호 변경
		System.out.println("\n비밀번호 변경을 시작합니다.");
		System.out.println("로그인 후 진행됩니다.");
		System.out.print("아이디를 입력하세요: ");
		String id = sc.next();

		System.out.print("비밀번호를 입력하세요: ");
		String pw = sc.next();

		if (user.login(id, pw)) {
			System.out.print("새로운 비밀번호를 입력하세요: ");
			String newPw = sc.next();

			if (!newPw.equals(user.getPassword())) {
				user.setPassword(newPw);
				System.out.println("[변경 성공] 비밀번호 변경에 성공했습니다!");
			} else {
				System.out.println("[변경 실패] 기존의 비밀번호와 같습니다.");
			}
		}


	}
}
