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
			System.out.println(location + " 타이어 수명이 " + (maxRotation - accumulatedRotation) + "만큼 남았습니다.");
			return true;	// 함수를 강제 종료시킴
		} else {
			System.out.println(location + " 타이어를 교체하세요.");
			return false;
		}
	}
	
}
