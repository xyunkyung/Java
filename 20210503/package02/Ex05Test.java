package package02;

public class Ex05Test {

	public static void main(String[] args) {
		String f = "12.4";
		Float f1 = Float.parseFloat(f);
		System.out.println(f1 + 20.5);
		
		Float f2 = new Float(f);
		System.out.println(f2 + 20.5);
		
		System.out.println("byte : " + f1.byteValue());
		System.out.println("long : " + f1.longValue());
		System.out.println("short : " + f1.shortValue());
		System.out.println("long : " + f1.longValue());
		
		System.out.println("max : " + Float.MAX_VALUE);
		System.out.println("min : " + Float.MIN_VALUE);
		
		Float f3 = 20.5f / 0;
		System.out.println(f3.isNaN());
		
	}

}
