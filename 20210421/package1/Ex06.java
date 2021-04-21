package package1;

public class Ex06 {

	private String name;
	private int age;
	protected String addr;
	double height;	// 접근 지정자를 명시하지 않음	// protected
	public String phone;
	
	public void setName(String name) {
		this.name = name;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public void setAddr(String addr) {
		this.addr = addr;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	public String getName() {
		return this.name;
	}
	
	public int getAge() {
		return this.age;
	}
	public String getAddr() {
		return this.addr;
	}
	public double getHeight() {
		return this.height;
	}
	protected void print() {
		System.out.println(name);
		System.out.println(age);
		System.out.println(addr);
	}

}
