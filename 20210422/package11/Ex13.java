package package11;

public class Ex13 extends Ex11 {

	public Ex13(int year) {
		super(year);
	}
	
	public boolean roll() {
		minus++;
		if(minus < period) {
			System.out.println("스타벅스와 계약 기간 중 입니다.");
			return true;
		}
		else {
			System.out.println("스타벅스와 계약 기간이 만료되었습니다.");
			return false;
		}
	}
}
