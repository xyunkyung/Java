package package5;

public class CarExample {

	public static void main(String[] args) {
		Car car = new Car();
		
		while(true) {
			int tireChange = car.run();	// Ÿ�̾��� ��ġ ��ȣ
			switch(tireChange) {
			case 1:
				System.out.println("�� ���� Ÿ�̾ ��ü�ϼ���.");
				car.frontLeftTire = new HankookTire("�տ���", 15);
				break;
			case 2:
				System.out.println("�� ������ Ÿ�̾ ��ü�ϼ���.");
				car.frontRightTire = new KumhoTire("�տ�����", 13);
				break;
			case 3:
				System.out.println("�� ���� Ÿ�̾ ��ü�ϼ���.");
				car.backLeftTire = new KumhoTire("�ڿ���", 14);
				break;
			case 4:
				System.out.println("�� ������ Ÿ�̾ ��ü�ϼ���.");
				car.backRightTire = new HankookTire("�ڿ�����", 12);
				break;
			}
			if(tireChange != 0) break;
		}

	}

}
