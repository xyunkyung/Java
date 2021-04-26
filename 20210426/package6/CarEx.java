package package6;

public class CarEx {

	public static void main(String[] args) {
		Car myCar = new Car();
		myCar.run();
		myCar.i = 10;
		System.out.println(myCar.i);
		
		myCar.frontLeftTire = new KumhoTire();
		myCar.backRightTire = new HankookTire();
		
		myCar.run();

	}

}
