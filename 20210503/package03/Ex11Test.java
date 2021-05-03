package package03;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Ex11Test {

	public static void main(String[] args) {
		Date now = new Date();
		System.out.println(now);
		String strNow = now.toString();
		System.out.println(strNow);
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		String strNow2 = sdf.format(now);
		System.out.println(strNow2);
		
		sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss am");
		String strNow3 = sdf.format(now);
		System.out.println(strNow3);
		
		sdf = new SimpleDateFormat("yyyy년 MM월 DD일 hh시 mm분 ss초");
		strNow3 = sdf.format(now);
		System.out.println(strNow3);
		
		sdf = new SimpleDateFormat("yyyy년 MM월 DD일 HH시 mm분 ss초 S");
		strNow3 = sdf.format(now);
		System.out.println(strNow3);
		
		sdf = new SimpleDateFormat("yyyy년 MM월 dd일 w주 HH시 mm분 ss초 S");
		strNow3 = sdf.format(now);
		System.out.println(strNow3);
		
		sdf = new SimpleDateFormat("yyyy년 MM월 dd일 W주 HH시 mm분 ss초 S");
		strNow3 = sdf.format(now);
		System.out.println(strNow3);
	}

}
