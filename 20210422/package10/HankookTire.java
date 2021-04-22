package package10;

public class HankookTire extends Tire {

	public HankookTire(int maxRotation, String location) {
		super(maxRotation, location);
	}
	
	@Override
	public boolean roll() {
		accumulatedRotation++;
		if(accumulatedRotation < maxRotation) {
			System.out.println(location + " 한국 타이어 수명이 " + (maxRotation - accumulatedRotation) + "만큼 남았습니다.");
			return true;	// 함수를 강제 종료시킴
		} else {
			System.out.println(location + " 한국 타이어를 교체하세요.");
			return false;
		}
	}
}
