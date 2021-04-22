package package10;

public class Car {

	Tire frontLeftTire = new Tire(6, "앞왼쪽");	// 1
	Tire frontRightTire = new Tire(2, "앞오른쪽");	// 2
	Tire backLeftTire = new Tire(3, "뒤왼쪽");	// 3
	Tire backRightTire = new Tire(4, "뒤오른쪽");	// 4
	
	public int run() {
		System.out.println("차가 달립니다.");
		if(frontLeftTire.roll() == false) {
			stop();
			return 1;
		}
		if(frontRightTire.roll() == false) {
			stop();
			return 2;
		}
		if(backLeftTire.roll() == false) {
			stop();
			return 3;
		}
		if(backRightTire.roll() == false) {
			stop();
			return 4;
		}
		return 0;
	}
	
	void stop() {
		System.out.println("멈추세요.");
	}
}
