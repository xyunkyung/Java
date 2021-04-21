
public class Ex13 {

	private String name;
	String addr;
	int age;
	public Ex13() {}
	public Ex13(String name) {
		this.name = name;
	}
	public Ex13(int age) {
		this.age = age;
	}
	public Ex13(int age, String name) {
		this.age = age;
		this.name = name;
	}
	public Ex13(String name, String addr, int age) {
		this.name = name;
		this.addr = addr;
		this.age = age;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setAddr(String addr) {
		this.addr = addr;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return this.name;
	}
	public String getAddr() {
		return this.addr;
	}
	public int getAge() {
		return this.age;
	}
	
}
