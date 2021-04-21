package inheritance;

public class Ex23 extends Ex22 {

	String subject;
	
	public Ex23(int radius, double pi, String subject) {
		super(radius, pi);
		this.subject = subject;
	}
	
	// 부모 클래스로부터 상속 받은 메소드를 자식 클래스에서 Math.PI를 사용하도록 재정의 : 메소드 오버라이딩
	public double area() {
		return radius * radius * Math.PI;
	}
	// 메소드 오버로딩
	public double area(double p) {
		return radius * radius * p;
	}
	
}
