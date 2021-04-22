package package10;

public class Tire {

	public int maxRotation;
	public int accumulatedRotation;
	public String location;
	
	public Tire(int maxRotation, String location) {
		this.maxRotation = maxRotation;
		this.location = location;
	}
	public boolean roll() {
		accumulatedRotation++;
		if(accumulatedRotation < maxRotation) {
			System.out.println(location + " Ÿ�̾� ������ " + (maxRotation - accumulatedRotation) + "��ŭ ���ҽ��ϴ�.");
			return true;	// �Լ��� ���� �����Ŵ
		} else {
			System.out.println(location + " Ÿ�̾ ��ü�ϼ���.");
			return false;
		}
	}
	
}
