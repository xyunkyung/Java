package package5;

public class KumhoTire extends Tire {

	public KumhoTire(String location, int maxRotation) {
		super(location, maxRotation);
	}
	
	public boolean roll() {
		++accumulatedRotation;
		if(maxRotation > accumulatedRotation) {
			System.out.println("금호 타이어를 교체하세요.");
			return false;
		} else {
			System.out.println("금호 타이어의 수명은 " + (maxRotation - accumulatedRotation) + "만큼 남아 있습니다.");
			return true;
		}
	}
}
