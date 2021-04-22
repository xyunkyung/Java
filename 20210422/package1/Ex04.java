package package1;

public class Ex04 extends Ex03 {

	public Ex04() {}
	public Ex04(int radius, double pi) {
		this.radius = radius;
		this.pi = pi;
	}
	public double areacircle() {
		return radius * radius * Math.PI;
	}
	public double area() {
		return super.areacircle();
	}
}
