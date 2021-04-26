package package5;

public class CarExample {

	public static void main(String[] args) {
		Car car = new Car();
		
		while(true) {
			int tireChange = car.run();	// 타이어의 위치 번호
			switch(tireChange) {
			case 1:
				System.out.println("앞 왼쪽 타이어를 교체하세요.");
				car.frontLeftTire = new HankookTire("앞왼쪽", 15);
				break;
			case 2:
				System.out.println("앞 오른쪽 타이어를 교체하세요.");
				car.frontRightTire = new KumhoTire("앞오른쪽", 13);
				break;
			case 3:
				System.out.println("뒤 왼쪽 타이어를 교체하세요.");
				car.backLeftTire = new KumhoTire("뒤왼쪽", 14);
				break;
			case 4:
				System.out.println("뒤 오른쪽 타이어를 교체하세요.");
				car.backRightTire = new HankookTire("뒤오른쪽", 12);
				break;
			}
			if(tireChange != 0) break;
		}

	}

}
