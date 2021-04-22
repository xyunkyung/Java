package package4;

public class KoreaAirplane extends Airplane {

	static final int NORMAL = 1;	// 일반 비행
	static final int SUPERSONIC = 2;	// 초음속 비행
	
	int flyMode = NORMAL;
	
	public void fly() {	// 메소드 오버라이딩
		if(flyMode == SUPERSONIC) {
			System.out.println("초음속 비행입니다.");
		}else {
			super.fly();	// 부모 클래스에 있는 메소드 실행
		}
	}
}
 