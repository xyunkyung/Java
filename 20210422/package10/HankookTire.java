package package10;

public class HankookTire extends Tire {

	public HankookTire(int maxRotation, String location) {
		super(maxRotation, location);
	}
	
	@Override
	public boolean roll() {
		accumulatedRotation++;
		if(accumulatedRotation < maxRotation) {
			System.out.println(location + " �ѱ� Ÿ�̾� ������ " + (maxRotation - accumulatedRotation) + "��ŭ ���ҽ��ϴ�.");
			return true;	// �Լ��� ���� �����Ŵ
		} else {
			System.out.println(location + " �ѱ� Ÿ�̾ ��ü�ϼ���.");
			return false;
		}
	}
}
