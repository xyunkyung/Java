// 클래스의 구성 멤버
public class Ex10 {

	// 멤버 필드
	String name;
	int age;
	
	// 생성자
	public Ex10() {}	// default 생성자
	public Ex10(String name) {
		this.name = name;
	}
	public Ex10(String name, int age) {
		this(name);
		this.age = age;
	}
	
	// 메서드
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return this.name;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getAge() {
		return this.age;
	}
}
