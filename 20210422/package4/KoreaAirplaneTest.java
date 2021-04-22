package package4;

public class KoreaAirplaneTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		KoreaAirplane ka = new KoreaAirplane();
		ka.fly();
		
		ka.flyMode = KoreaAirplane.SUPERSONIC;
		ka.fly();
		
		ka.flyMode = KoreaAirplane.NORMAL;
		ka.fly();
	}

}
