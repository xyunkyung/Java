
public class Ex03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int i1[];	// i1 : null
		// System.out.println(i1);	// nullpoint
		
		int i2[];
		i2 = new int[5];	// 0, 0, 0, 0, 0
		
		for(int j = 0; j < i2.length; j++) {
			System.out.println(i2[j]);
		}
		
		System.out.println("");
		
		long l1[];	// 0, 0, 0, 0, 0
		l1 = new long[5];
		
		for(int j = 0; j < l1.length; j++) {
			System.out.println(l1[j]);
		}
		
		System.out.println("");
		
		float f1[];
		f1 = new float[5];	// 0.0, 0.0, 0.0, 0.0, 0.0
		
		for(int j = 0; j < f1.length; j++) {
			System.out.println(f1[j]);
		}
		
		System.out.println("");
		
		double d1[];
		d1 = new double[5];	// 0.0, 0.0, 0.0, 0.0, 0.0
		
		for(int j = 0; j < d1.length; j++) {
			System.out.println(d1[j]);
		}
		
		System.out.println("");
		
		boolean b1[];
		b1 = new boolean[5];	// false, false, false, false, false
		
		for(int j = 0; j < b1.length; j++) {
			System.out.println(b1[j]);
		}
		
		System.out.println("");
	}

}
