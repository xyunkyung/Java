import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class StudentTest {

	public static void main(String[] args) {
		Map<String, Student> map = new HashMap<String, Student>();
		Student std = new Student("123456", "이현경");
		map.put("id1", std);
		
		std = new Student("234567", "이혜성");
		map.put("id2", std);
		
		std = new Student("345678", "이우주");
		map.put("id3", std);

		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.print("아이디 :");
			String userId = sc.nextLine();
			// 키와 입력 받은 id가 일치하는 것이 있는지 확인
			if(map.containsKey(userId)) {
				Student std1 = map.get(userId);
				System.out.print("비밀번호 : ");
				String pw = sc.nextLine();
				if(std1.userPw.equals(pw)) {
					System.out.println("로그인 성공"); break;
				} else {
					System.out.println("비밀번호가 틀렸습니다.");
				}
				
			} else {
				System.out.println("아이디가 존재하지 않습니다.");
			}
		}
	}

}
