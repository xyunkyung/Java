
public class ArrayReferenceObjectExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] strArray = new String[3];
		strArray[0] = "Java";
		strArray[1] = "Java";
		strArray[2] = new String("Java");
		
		System.out.println(strArray[0] == strArray[1]);	// true	: 동일한 String 객체를 참조하기 때문
		System.out.println(strArray[0] == strArray[2]);	// false	: new 연산자로 객체 생성하면 새로운 String 객체 생성되기 때문
		System.out.println(strArray[0].equals(strArray[2]));	// true	: 문자열을 비교하기 때문
	}

}
