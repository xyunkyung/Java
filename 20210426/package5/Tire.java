package package5;

public class Tire {

	public int maxRotation;	// 최대 회전 수(최대 수명)
	public int accumulatedRotation;	// 누적 회전 수
	public String location;	// 타이어의 위치
	
	public Tire(String location, int maxRotation) {
		this.location = location;
		this.maxRotation = maxRotation;
	}
	public boolean roll() {
		++accumulatedRotation;
		if(maxRotation < accumulatedRotation) {
			System.out.println("타이어를 교체하세요.");
			return false;
		} else {
			System.out.println("타이어의 수명은 " + (maxRotation - accumulatedRotation) + "만큼 남아있습니다.");
			return true;
		}
	}
}
