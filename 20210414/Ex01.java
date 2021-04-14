
public class Ex01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// stack, heap, method
		// stack : 변수, 값
		// heap : 값
		int i = 10;	// stack 영역	i : 10
		int j = 20;	// stack 영역 j : 20
		double d = 10.5;	// stack 영역 d : 10.5
		String str = "이현경";	// stack 영역 str : 주소 값
								// heap 영역 이현경 : 메모리 주소
		String str1 = "이현경";	// stack 영역 str1 : 주소 값
		// 주소가 저장되는 변수를 주소 변수 ( = 참조 변수 )
		// 참조 변수 : 문자열, 배열, 열거형
		int [] i1 = {1, 2, 3, 4, 5};	// stack 영역 i1 : 주소 값
										// heap 영역 1, 2, 3, 4, 5 : 주소 값
		System.out.println(i1);
		System.out.println(i1[0]);	// 주소값[0]
		System.out.println(i1[1]); 	// 주소값[1]
		System.out.println(i1[2]);	// 주소값[2]
	}

}
