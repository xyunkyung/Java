
public class Ex11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 열거형 자료형에서 사용할 수 있는 메서드
		// name() : 문자열 값으로 받아오는 메서드
		// ordinal() : 열거 상수의 숫자를 가져오는 메서드
		// compareTo() : 비교하는 값이 앞뒤로 얼마나 멀리 있는지
		// valueOf() : 해당 문자열이 열거형에 있는지 확인하여 상수를 가져옴
		// values() : 열거 상수를 모두 가져옴
		
		Week today = Week.SUNDAY;
		System.out.println(today);
		String name = today.name();	// 열거형이 문자열 값으로 바뀜
		System.out.println(name);
		
		// 열거형을 열거 상수의 숫자로 바꾸기
		int ordinal = today.ordinal();
		System.out.println(ordinal);	// 6
		
		// compareTo
		Week day1 = Week.MONDAY;
		Week day2 = Week.WEDNESDAY;
		//            0               2
		int result = day1.compareTo(day2);
		System.out.println(result);	// -2
		//        2              0
		result = day2.compareTo(day1);
		System.out.println(result);	// 2
		
		String day = "THURSDAY";
		Week weekDay = Week.valueOf(day);
		System.out.println(weekDay);
		
		/*day = "THURS";
		weekDay = Week.valueOf(day);
		System.out.println(weekDay);*/	// error
		
		// values
		Week day3 = Week.FRIDAY;
		Week [] days = Week.values();
		for(Week wk : days) {
			System.out.println(wk);
		}
	}

}
