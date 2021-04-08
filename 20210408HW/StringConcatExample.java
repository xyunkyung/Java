
public class StringConcatExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str1 = "JDK" + 6.0;	// JDK6.0
		String str2 = str1 + " Æ¯Â¡";	// JDK6.0 Æ¯Â¡
		System.out.println(str2);	// JDK6.0 Æ¯Â¡
		
		String str3 = "JDK" + 3 + 3.0;	// JDK33.0
		String str4 = 3 + 3.0 + "JDK";	// 6.0JDK >> 3 + 3.0 ¿¬»ê ¸ÕÀú ½ÇÇà
		System.out.println(str3);	// JDK33.0
		System.out.println(str4);	// 6.0JDK
		
	}

}
