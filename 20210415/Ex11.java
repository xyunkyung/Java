
public class Ex11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// ������ �ڷ������� ����� �� �ִ� �޼���
		// name() : ���ڿ� ������ �޾ƿ��� �޼���
		// ordinal() : ���� ����� ���ڸ� �������� �޼���
		// compareTo() : ���ϴ� ���� �յڷ� �󸶳� �ָ� �ִ���
		// valueOf() : �ش� ���ڿ��� �������� �ִ��� Ȯ���Ͽ� ����� ������
		// values() : ���� ����� ��� ������
		
		Week today = Week.SUNDAY;
		System.out.println(today);
		String name = today.name();	// �������� ���ڿ� ������ �ٲ�
		System.out.println(name);
		
		// �������� ���� ����� ���ڷ� �ٲٱ�
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
