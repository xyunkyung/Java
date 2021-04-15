
public class Ex05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [][] i1 = new int[3][];
		i1[0] = new int[3];
		i1[1] = new int[3];
		i1[2] = new int[3];
		
		i1[1][2] = 10;
		i1[2][1] = 20;
		System.out.println(i1[1][2]);	// 10
		System.out.println(i1[2][1]);	// 20
		
		System.out.println("");
		
		int [][] i2 = new int[3][];
		i2[0] = new int[3];
		i2[1] = new int[4];
		i2[2] = new int[2];
		// index : 00, 01, 02, 10, 11, 12, 13, 20, 21
		
		int [][] i3 = new int[3][4];
		// index : 00, 01, 02, 03, 10, 11 ,12 ,13, 20, 21, 22, 23
		
		int [] ii = {1, 2, 3, 4};
		int [][] i4 = {{1, 2, 3}, {11, 22, 33}, {12, 13, 14}};
		
	}

}
