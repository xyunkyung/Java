package inheritance;

// �ڽ� Ŭ����
public class Ex19 extends Ex18 {

	int studentNo;
	
	public Ex19(String name, String ssn, int studentNo) {	// �ڽ� ������
		super(name, ssn);	// �θ� ������
		this.studentNo = studentNo;
	}
	
	public void print() {
		System.out.println(name);
		System.out.println(ssn);
		System.out.println(studentNo);
	}
}
