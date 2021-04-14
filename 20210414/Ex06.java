
public class Ex06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int i1[] = {1, 2, 3, 4, 5};
		int i2[] = {11, 22, 33, 44, 55};
		int i3[] = {12, 13, 14, 15, 16};
		
		// 엑셀처럼 표 형태로 되어 있는 것을 2차원 배열이라고 함
		// 다차원 배열이란 1차원 배열을 모으면 2차원 배열이 되는 것을 말한다.
		
		int i[][] = new int[3][];
		i[0] = i1;
		i[1] = i2;
		i[2] = i3;
		System.out.println(i1[0]);		// 1
		System.out.println(i[0][0]);	// 1
		
		System.out.println("");
		
		System.out.println(i2[0]);		// 11
		System.out.println(i[1][0]);	// 11
		
		System.out.println("");
		
		// 15 출력
		System.out.println(i[2][3]);
		
		System.out.println("");
		
		// 배열 크기 가져오기
		System.out.println(i1.length);
		System.out.println(i[0].length);
		
		System.out.println("");
		
		System.out.println(i2.length);
		System.out.println(i[1].length);
		
		System.out.println("");
		
		// 2차원 배열 크기 가져오기
		System.out.println(i.length);	// 2차원 배열의 크기는 1차원 배열의 갯수를 얘기함
	}

}
