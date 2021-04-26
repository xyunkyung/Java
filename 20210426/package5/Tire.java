package package5;

public class Tire {

	public int maxRotation;	// �ִ� ȸ�� ��(�ִ� ����)
	public int accumulatedRotation;	// ���� ȸ�� ��
	public String location;	// Ÿ�̾��� ��ġ
	
	public Tire(String location, int maxRotation) {
		this.location = location;
		this.maxRotation = maxRotation;
	}
	public boolean roll() {
		++accumulatedRotation;
		if(maxRotation < accumulatedRotation) {
			System.out.println("Ÿ�̾ ��ü�ϼ���.");
			return false;
		} else {
			System.out.println("Ÿ�̾��� ������ " + (maxRotation - accumulatedRotation) + "��ŭ �����ֽ��ϴ�.");
			return true;
		}
	}
}
