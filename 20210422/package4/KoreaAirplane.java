package package4;

public class KoreaAirplane extends Airplane {

	static final int NORMAL = 1;	// �Ϲ� ����
	static final int SUPERSONIC = 2;	// ������ ����
	
	int flyMode = NORMAL;
	
	public void fly() {	// �޼ҵ� �������̵�
		if(flyMode == SUPERSONIC) {
			System.out.println("������ �����Դϴ�.");
		}else {
			super.fly();	// �θ� Ŭ������ �ִ� �޼ҵ� ����
		}
	}
}
 