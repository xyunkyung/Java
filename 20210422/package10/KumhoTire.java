package package10;

public class KumhoTire extends Tire {

	public KumhoTire(int maxRotation, String location) {
		super(maxRotation, location);
	}
	
	@Override
	public boolean roll() {
		accumulatedRotation++;
		if(accumulatedRotation < maxRotation) {
			System.out.println(location + " ��ȣ Ÿ�̾� ������ " + (maxRotation - accumulatedRotation) + "��ŭ ���ҽ��ϴ�.");
			return true;	// �Լ��� ���� �����Ŵ
		} else {
			System.out.println(location + " ��ȣ Ÿ�̾ ��ü�ϼ���.");
			return false;
		}
	}
}
