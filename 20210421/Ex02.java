
public class Ex02 {

	int age;
	String name;
	String addr;
	
	public Ex02() {}
	public Ex02(int age, String name, String addr) {
		this.age = age;
		this.name = name;
		this.addr = addr;
	}
	
	// setter : ����ʵ忡 ���� �����ϴ� �޼���
	public void setAge(int age) {
		this.age = age;
		// this�� �����ִ� ������ �ν��Ͻ� ����(����ʵ�)���� ��Ÿ���� ����
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setAddr(String addr) {
		this.addr = addr;
	}
	
	// getter
	public int getAge() {
		return this.age;
	}
	public String getName() {
		return this.name;
	}
	public String getAddr() {
		return this.addr;
	}
}
