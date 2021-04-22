package package10;

public class KumhoTire extends Tire {

	public KumhoTire(int maxRotation, String location) {
		super(maxRotation, location);
	}
	
	@Override
	public boolean roll() {
		accumulatedRotation++;
		if(accumulatedRotation < maxRotation) {
			System.out.println(location + " 금호 타이어 수명이 " + (maxRotation - accumulatedRotation) + "만큼 남았습니다.");
			return true;	// 함수를 강제 종료시킴
		} else {
			System.out.println(location + " 금호 타이어를 교체하세요.");
			return false;
		}
	}
}
