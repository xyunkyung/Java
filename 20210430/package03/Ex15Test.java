package package03;

public class Ex15Test {

	public static void main(String[] args) {
		String oldStr = "I love python";
		
		String newStr = oldStr.replace("python", "java");
		System.out.println(newStr);

		oldStr = oldStr.replace("python", "ÀÚ¹Ù");
		System.out.println(oldStr);
	}

}
