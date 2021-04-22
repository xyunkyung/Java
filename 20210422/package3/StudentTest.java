package package3;

public class StudentTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 자식 생성자에서 부모 생성자를 실행 시키고 자식 생성자가 받아온 값을 부모 생성자에 전달 super()
		Student st = new Student("이현경", "970525-0000000", 1);
		System.out.println(st.name);
		System.out.println(st.ssn);
		System.out.println(st.studentNo);
	}

}
