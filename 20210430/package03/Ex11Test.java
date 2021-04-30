package package03;

public class Ex11Test {

	public static void main(String[] args) {
		String ssn = "970525-2000000";
		//			  01234567890123
		//						1
		// output index's text
		char ch = ssn.charAt(7);
		System.out.println(ch);	//7th index's text output
		
		switch(ch) {
		case '1':
		case '3':
		case '7':
		case '9':
			System.out.println("man");
		case '2':
		case '4':
		case '8':
		case '0':
			System.out.println("female");
		}
	}

}
