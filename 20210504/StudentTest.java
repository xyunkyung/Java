import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class StudentTest {

	public static void main(String[] args) {
		Map<String, Student> map = new HashMap<String, Student>();
		Student std = new Student("123456", "������");
		map.put("id1", std);
		
		std = new Student("234567", "������");
		map.put("id2", std);
		
		std = new Student("345678", "�̿���");
		map.put("id3", std);

		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.print("���̵� :");
			String userId = sc.nextLine();
			// Ű�� �Է� ���� id�� ��ġ�ϴ� ���� �ִ��� Ȯ��
			if(map.containsKey(userId)) {
				Student std1 = map.get(userId);
				System.out.print("��й�ȣ : ");
				String pw = sc.nextLine();
				if(std1.userPw.equals(pw)) {
					System.out.println("�α��� ����"); break;
				} else {
					System.out.println("��й�ȣ�� Ʋ�Ƚ��ϴ�.");
				}
				
			} else {
				System.out.println("���̵� �������� �ʽ��ϴ�.");
			}
		}
	}

}
