package package04;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Ex20Test {

	public static void main(String[] args) {
		Map<String, Student> map = new HashMap<String, Student>();
		Student std = new Student("123456", "������");
		map.put("high1", std);

		std = new Student("234567", "������");
		map.put("high2", std);

		std = new Student("121212", "���ϴ�");
		map.put("high3", std);

		while (true) {
			Scanner sc = new Scanner(System.in);
			System.out.print("id : ");
			String id = sc.nextLine();

			System.out.print("pw : ");
			String pw = sc.nextLine();

			// map�� Ű�� �����ϴ� �� Ȯ��
			if (map.containsKey(id)) {
				Student std1 = map.get(id);
				if (std1.sno.equals(pw)) {
					System.out.println("�α��� ����");
					break;
				} else {
					System.out.println("��й�ȣ�� Ʋ�Ƚ��ϴ�.");
				}
			} else {
				System.out.println("���̵� �������� �ʽ��ϴ�.");
			}

		}
	}

}
