
public class Ex10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [] i1 = new int[3];	// 주로 많이 사용하는 방법
		i1[0] = 1; i1[1] = 2; i1[2] = 3;
		
		int [] i2 = {1, 2, 3, 4};
		System.out.println(i2[1]);	// 2
		
		System.out.println("");
		
		int [] i3 = new int[] {1, 2, 3, 4};
		
		int [] i4;
		i4 = new int[3];
		i4[0] = 1; i4[1] = 2; i4[2] = 3;
		
		int []i5;
		i5 = new int[] {1, 2, 3, 4};
		// 1차원 배열의 크기
		System.out.println(i1.length);	// 3	// 변수명.length
		
		System.out.println("");
		
		for(int j = 0; j < i1.length; j++) {
			System.out.println(i1[j]);	// 1 2 3
		}
		System.out.println("");
		
		int [][] ii1 = new int [2][];
		ii1[0] = new int[3];	// 00, 01, 02
		ii1[1] = new int[4];	// 10, 11, 12, 13
		ii1[0][1] = 1;
		ii1[1][2] = 3;
		
		int [] i = new int[5];
		System.out.println(i.length);
		
		System.out.println("");
		
		int [][] ii2 = new int[2][3];
		ii2[0][1] = 10;
		ii2[1][2] = 20;
		
		int [][] ii3 = {{1, 2, 3}, {1, 2, 3, 4}, {1, 2, 3, 4, 5}};
		
		// 2차원 배열의 크기는 1차원 배열의 개수이다. ( = 행의 크기 )
		// 2차원 배열의 크기를 구하자.
		// 2차원 배열의 열의 개수는 1차원 배열의 크기이다. ( = 열의 크기 )
		System.out.println(ii3.length);	// 3
		System.out.println(ii3[0].length);	// 3
		System.out.println(ii3[1].length);	// 4
		System.out.println(ii3[2].length); 	// 5
		
		System.out.println("");
		
		for(int row = 0; row < ii3.length; row++) {
			for(int col = 0; col < ii3[row].length; col++) {
				System.out.println(ii3[row][col]);
			}
		}
	}

}
