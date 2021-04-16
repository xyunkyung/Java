
public class Ex08 {

	String name;
	int age;
	double height;

	public Ex08() {}
	public Ex08(String name, int age, double height) {
		this.name = name;
		this.age = age;
		this.height = height;
	}
	
	public Ex08(String name, double height, int age) {
		this.name = name;
		this.age = age;
		this.height = height;
	}
	
	// 생성자의 이름은 같고, 매개 변수의 개수나 타입이나 순서가 다른 것을 오버로딩 이라 한다. 
	public Ex08(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public Ex08(int age, double height) {
		this.age = age;
		this.height = height;
	}
	
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
	
	public void setHeight(double height) {
		this.height = height;
	}
	
	public double getHeight() {
		return this.height;
	}
}
