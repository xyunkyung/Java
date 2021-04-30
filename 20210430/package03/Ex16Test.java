package package03;

public class Ex16Test {

	public static void main(String[] args) {
		String ssn = "970525-2123456";
		//			  01234567890123
		//						1
		System.out.println(ssn.substring(0, 8) + "******");
		
		int idx = ssn.indexOf("-");
		System.out.println(ssn.substring(0, idx)); // YYMMDD
		System.out.println(ssn.substring(idx+1));	// *******
		System.out.println(ssn.substring(idx-4, idx));	// MMDD
		
		// 3 ~ 4th
		String str = "123456789";
		idx = str.indexOf('3');
		System.out.println(str.substring(idx, idx+4));
	}

}
