package package03;

public class Ex20Test {

	public static void main(String[] args) {
		String url = "https://news.naver.com/main/read.nhn";
		String contextPath = "/main";
		// �� �� ���ڿ��� �̿��Ͽ� "/read.nhn"�� ����Ͻÿ�.
		
		// int idx = url.indexOf(contextPath);
		// System.out.println(idx);
		String str = url.substring(url.indexOf(contextPath)+contextPath.length());
		System.out.println(str);
	}

}
