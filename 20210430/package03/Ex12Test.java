package package03;

public class Ex12Test {

	public static void main(String[] args) {
		String name = "xyunkyung";
		String name1 = new String ("xyunkyung");
		String name2 = "xyunkyung";
		
		if(name == name2) {
			System.out.println("same address");
		} else {
			System.out.println("different address");
		}
		
		if(name == name1) {
			System.out.println("same");
		} else {
			System.out.println("different");
		}
		System.out.println(name);
		
		Ex11Test ex = new Ex11Test();
		System.out.println(ex);
		
		if(name.equals(name2)) {
			System.out.println("same value");
		} else {
			System.out.println("different value");
		}
		
		if(name.equals(name1)) {
			System.out.println("same value");
		} else {
			System.out.println("different value");
		}
	}

}
