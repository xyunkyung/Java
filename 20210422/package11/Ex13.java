package package11;

public class Ex13 extends Ex11 {

	public Ex13(int year) {
		super(year);
	}
	
	public boolean roll() {
		minus++;
		if(minus < period) {
			System.out.println("��Ÿ������ ��� �Ⱓ �� �Դϴ�.");
			return true;
		}
		else {
			System.out.println("��Ÿ������ ��� �Ⱓ�� ����Ǿ����ϴ�.");
			return false;
		}
	}
}
