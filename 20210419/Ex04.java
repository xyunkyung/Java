
public class Ex04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 기본형
		int result = add(4, 5);
		System.out.println(result);
		String fullName = name("현경", "이");
		System.out.println(fullName);
		double circle = area(3, 3.14);
		System.out.println(circle);
		int rangle = rangleArea(4, 3);
		System.out.println(rangle);
		System.out.println();
	}
	
	// static 메서드에서 메서드를 호출하려면 메서드가 static 메서드여야 한다.
	// 메서드의 종류는 4가지 종류
	// 1. 기본 메서드 : 매개변수가 있고 반환 값이 있는 메서드
	public static int add(int num1, int num2) {
		return num1 + num2;
	}
	// return type은 return문 뒤에 있는 결과 값의 type을 적어준다.
	public static String name(String firstName, String lastName) {
		return lastName + firstName;
	}
	
	public static double area(int radius, double pi) {
		return radius * radius * pi;
	}
	
	public static int rangleArea(int num1, int num2) {
		return num1 * num2;
	}

}
