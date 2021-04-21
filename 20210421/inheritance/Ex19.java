package inheritance;

// 자식 클래스
public class Ex19 extends Ex18 {

	int studentNo;
	
	public Ex19(String name, String ssn, int studentNo) {	// 자식 생성자
		super(name, ssn);	// 부모 생성자
		this.studentNo = studentNo;
	}
	
	public void print() {
		System.out.println(name);
		System.out.println(ssn);
		System.out.println(studentNo);
	}
}
