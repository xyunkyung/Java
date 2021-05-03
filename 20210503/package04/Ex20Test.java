package package04;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Ex20Test {

	public static void main(String[] args) {
		Map<String, Student> map = new HashMap<String, Student>();
		Student std = new Student("123456", "이현경");
		map.put("high1", std);

		std = new Student("234567", "이혜성");
		map.put("high2", std);

		std = new Student("121212", "이하늘");
		map.put("high3", std);

		while (true) {
			Scanner sc = new Scanner(System.in);
			System.out.print("id : ");
			String id = sc.nextLine();

			System.out.print("pw : ");
			String pw = sc.nextLine();

			// map에 키가 존재하는 지 확인
			if (map.containsKey(id)) {
				Student std1 = map.get(id);
				if (std1.sno.equals(pw)) {
					System.out.println("로그인 성공");
					break;
				} else {
					System.out.println("비밀번호가 틀렸습니다.");
				}
			} else {
				System.out.println("아이디 존재하지 않습니다.");
			}

		}
	}

}
