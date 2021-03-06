package package03;

import java.util.StringTokenizer;

public class Ex19Test {

	public static void main(String[] args) {
		String text = "홍길동/이수홍/박연수";
		StringTokenizer st = new StringTokenizer(text, "/");
		
		while(st.hasMoreTokens()) {
			String token = st.nextToken();
			System.out.println(token);
		}
	}

	/*
	 * charAt() : index에 해당하는 문자 출력
	 * equals() : 문자열이 같은지 비교
	 * getBytes() : 문자열을 byte로 - 크기, 암호
	 * indexOf() : 문자나 문자열의 index 출력
	 * length() : 문자의 갯수
	 * replace() : 문자열 바꾸기
	 * substring() : 문자열 자르기
	 * toLowerCase() : 모두 소문자
	 * toUpperCase() : 모두 대문자
	 * trim() : 문자열의 앞 뒤에 있는 공백문자 제거
	 * valueOf() : 기본 자료형을 문자열로 변환
	 * split() : 문자열을 구분 문자를 기준으로 배열로 반환
	 * StringTokenizer()
	 */
}
