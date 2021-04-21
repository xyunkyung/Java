package inheritance;

public class Ex22 {

	int radius;
	double pi;
	
	public Ex22(int radius, double pi) {
		this.radius = radius;
		this.pi = pi;
	}
	public double area() {
		return radius * radius * pi;
	}
	
}
