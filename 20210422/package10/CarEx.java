package package10;

public class CarEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int number = 5;
		Car car = new Car();
		boolean stop = false;
		
		while(!stop) {	// ���� �ݺ�
			int num = car.run();	// Ÿ�̾��� ��ġ
			switch(num) {
			case 1:
				System.out.println("�� ���� Ÿ�̾ ��ü");
				car.frontLeftTire = new KumhoTire(15, "�տ���");
				// ��ü ���⼺
				break;
			case 2:
				System.out.println("�� ������ Ÿ�̾ ��ü");
				car.frontRightTire = new HankookTire(15, "�տ�����");
				break;
			case 3:
				System.out.println("�� ���� Ÿ�̾ ��ü");
				car.backLeftTire = new HankookTire(15, "�ڿ���");
				break;
			case 4:
				System.out.println("�� ������ Ÿ�̾ ��ü");
				car.backRightTire = new KumhoTire(15, "�ڿ�����");
				break;
			}
			number--;
			if(number == 0) {
				stop = true;
			}
		}
	}

}
