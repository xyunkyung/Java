package package1;

public class Ex03 {

	int radius;
	double pi;
	
	public Ex03() {}
	public Ex03(int radius) {
		this.radius = radius;
	}
	public Ex03(int radius, double pi) {
		this.radius = radius;
		this.pi = pi;
	}
	public double areacircle() {
		return radius * radius * pi;
	}
}
