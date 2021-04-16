
public class Ex08Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Ex08 ex = new Ex08("이현경", 25, 156.5);
		System.out.println(ex.getName());
		System.out.println(ex.getAge());
		System.out.println(ex.getHeight());
		System.out.println();
		
		// 생성자를 통해서 일부 멤버 필드 값만 초기화 시키고 나중에 나머지에 값을 저장
		Ex08 ex1 = new Ex08("이지현", 19);
		ex1.setHeight(154.0);
		System.out.println(ex1.getName());
		System.out.println(ex1.getAge());
		System.out.println(ex1.getHeight());
	}

}
