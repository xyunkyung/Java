package package03;

public class Ex17Test {

	public static void main(String[] args) {
		String str = "abcdefghijklmnopqrstuvwxyz";
		//			  0123456
		int idx = str.indexOf('l');
		System.out.println(str.substring(idx, idx+4));
		
		// distinction upper lower
		String str1 = "Java Programming";
		String str2 = "JAVA Programming";
		System.out.println(str1.equals(str2));
		
		String lowerStr1 = str1.toLowerCase();
		String lowerStr2 = str2.toLowerCase();
		System.out.println(lowerStr1);
		System.out.println(lowerStr2);
		System.out.println(lowerStr1.equals(lowerStr2));
		
		String upperStr1 = str1.toUpperCase();
		String upperStr2 = str2.toUpperCase();
		System.out.println(upperStr1);
		System.out.println(upperStr2);
		
		String str3 = " hyunkyung";
		if(str3.trim().equals("hyunkyung")) {
			System.out.println("same");
		} else {
			System.out.println("different");
		}
		
		str3 = " hyunkyung ";
		if(str3.trim().equals("hyunkyung")) {
			System.out.println("same");
		} else {
			System.out.println("different");
		}
		
		str3 = "lee hyunkyung";
		if(str3.trim().equals("leehyunkyung")) {
			System.out.println("same");
		} else {
			System.out.println("different");
		}
		
		int i = 10;
		double d = 10.5;
		boolean b = true;
		String i1 = "10";
		int res = Integer.parseInt(i1);
		
		String result = String.valueOf(i);
		System.out.println(result);
		
		result = String.valueOf(d);
		System.out.println(result);
		
		result = String.valueOf(b);
		System.out.println(result);
	}
}
