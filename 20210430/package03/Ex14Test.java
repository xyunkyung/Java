package package03;

import java.io.UnsupportedEncodingException;

public class Ex14Test {

	public static void main(String[] args) {
		String str = "¾È³çÇÏ¼¼¿ä";

		byte[] bytes1 = str.getBytes(); // eng 1byte, kor 2byte
		System.out.println("bytes1.length : " + bytes1.length);

		str = new String(bytes1);
		System.out.println("bytes1 -> String : " + str);

		try {
			bytes1 = str.getBytes("EUC-KR");	// kor 2byte
			System.out.println("EUC-KR's size : " + bytes1.length);
			
			bytes1 = str.getBytes("UTF-8");	// kor 3byte
			System.out.println("UTF-8's size : " + bytes1.length);
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}
	}

}
