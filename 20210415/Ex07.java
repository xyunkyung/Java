
public class Ex07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [] i1 = {1, 2, 3, 4};
		for(int idx = 0; idx < i1.length; idx++) {
			System.out.println(i1[idx]);
		}
		
		System.out.println("");
		
		for(int num : i1) {
			System.out.println(num);
		}
		
		System.out.println("");
		
		int [][] i2 = {{1, 2, 3}, {1, 2, 3, 4}, {1, 2, 3, 4, 5}};
		for(int row = 0; row < i2.length; row++) {
			for(int col = 0; col < i2[row].length; col++) {
				System.out.println(i2[row][col]);
			}
		}
		System.out.println("");
		
		for(int [] row : i2) {
			for(int num : row) {
				System.out.println(num);
			}
		}
	}

}
