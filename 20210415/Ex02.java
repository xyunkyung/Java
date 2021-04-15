
public class Ex02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [] i = new int[3];	// index : 0, 1, 2
		System.out.println(i[0]);
		System.out.println(i[1]);
		System.out.println(i[2]);
		
		System.out.println("");
		
		System.out.println(i.length);	// 배열의 크기 	: 3
		
		System.out.println("");
		
		for(int index = 0; index < i.length; index++) {
			System.out.println(i[index]);
		}	// 초기 값 0
		
		System.out.println("");
		
		long l [] = new long[3];
		
		for(int idx = 0; idx < l.length; idx++) {
			System.out.println(l[idx]);
		}	// 초기 값 0
		
		System.out.println("");
		
		float f1[] = new float[3];
		
		for(int idx = 0; idx < f1.length; idx++) {
			System.out.println(f1[idx]);
		}	// 초기 값 0.0
		
		System.out.println("");
		
		double d [] = new double[3];
		
		for(int idx = 0; idx < d.length; idx++) {
			System.out.println(d[idx]);
		}	// 초기 값 0.0
		
		System.out.println("");
		
		boolean [] b = new boolean[3];
		
		for(int idx = 0; idx < b.length; idx++) {
			System.out.println(b[idx]);
		}	// 초기 값 false
		
	}

}
