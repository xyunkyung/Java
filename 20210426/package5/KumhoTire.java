package package5;

public class KumhoTire extends Tire {

	public KumhoTire(String location, int maxRotation) {
		super(location, maxRotation);
	}
	
	public boolean roll() {
		++accumulatedRotation;
		if(maxRotation > accumulatedRotation) {
			System.out.println("��ȣ Ÿ�̾ ��ü�ϼ���.");
			return false;
		} else {
			System.out.println("��ȣ Ÿ�̾��� ������ " + (maxRotation - accumulatedRotation) + "��ŭ ���� �ֽ��ϴ�.");
			return true;
		}
	}
}
