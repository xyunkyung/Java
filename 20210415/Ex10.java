import java.util.Calendar;

public class Ex10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int i = 10;
		double d = 10.5;
		Week today;
		today = Week.FRIDAY;
		System.out.println(today);
		
		System.out.println("");
		
		// ���� ��¥ ����
		Calendar cal = Calendar.getInstance();
		
		// ������ �޾ƿ�
		int week = cal.get(Calendar.DAY_OF_WEEK);
		System.out.println("���� ��� : " + week);
		
		switch(week) {
		case 1: today = Week.SUNDAY; break;
		case 2: today = Week.MONDAY; break;
		case 3: today = Week.TUESDAY; break;
		case 4: today = Week.WEDNESDAY; break;
		case 5: today = Week.THURSDAY; break;
		case 6: today = Week.FRIDAY; break;
		case 7: today = Week.SATURDAY; break;
		}
		System.out.println(today);
		
		System.out.println("");
		
		if(today == Week.SUNDAY) {
			System.out.println("� ����");
		} else {
			System.out.println("�����սô�.");
		}
	}

}
