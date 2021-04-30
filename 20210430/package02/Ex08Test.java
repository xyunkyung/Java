package package02;

public class Ex08Test {

	public static void main(String[] args) {
		Ex06 ex1 = new Ex06("이현경", "Mac");
		Ex06 ex2 = new Ex06("이혜성", "Windows");
		Ex07 ex3 = new Ex07();
		
		if(ex1.equals(ex2)) {
			System.out.println("same class");
		} else {
			System.out.println("dissimilar class");
		}
		
		if(ex1.equals(ex3)) {
			System.out.println("same class");
		} else {
			System.out.println("dissimilar class");
		}
		
		String str = ex1.toString();
		System.out.println(str);
		
		str = ex2.toString();
		System.out.println(str);
	}

}
