package package10;

public class CarEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int number = 5;
		Car car = new Car();
		boolean stop = false;
		
		while(!stop) {	// 무한 반복
			int num = car.run();	// 타이어의 위치
			switch(num) {
			case 1:
				System.out.println("앞 왼쪽 타이어를 교체");
				car.frontLeftTire = new KumhoTire(15, "앞왼쪽");
				// 객체 다향성
				break;
			case 2:
				System.out.println("앞 오른쪽 타이어를 교체");
				car.frontRightTire = new HankookTire(15, "앞오른쪽");
				break;
			case 3:
				System.out.println("뒤 왼쪽 타이어를 교체");
				car.backLeftTire = new HankookTire(15, "뒤왼쪽");
				break;
			case 4:
				System.out.println("뒤 오른쪽 타이어를 교체");
				car.backRightTire = new KumhoTire(15, "뒤오른쪽");
				break;
			}
			number--;
			if(number == 0) {
				stop = true;
			}
		}
	}

}
