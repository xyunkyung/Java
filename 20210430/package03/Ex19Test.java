package package03;

import java.util.StringTokenizer;

public class Ex19Test {

	public static void main(String[] args) {
		String text = "ȫ�浿/�̼�ȫ/�ڿ���";
		StringTokenizer st = new StringTokenizer(text, "/");
		
		while(st.hasMoreTokens()) {
			String token = st.nextToken();
			System.out.println(token);
		}
	}

	/*
	 * charAt() : index�� �ش��ϴ� ���� ���
	 * equals() : ���ڿ��� ������ ��
	 * getBytes() : ���ڿ��� byte�� - ũ��, ��ȣ
	 * indexOf() : ���ڳ� ���ڿ��� index ���
	 * length() : ������ ����
	 * replace() : ���ڿ� �ٲٱ�
	 * substring() : ���ڿ� �ڸ���
	 * toLowerCase() : ��� �ҹ���
	 * toUpperCase() : ��� �빮��
	 * trim() : ���ڿ��� �� �ڿ� �ִ� ���鹮�� ����
	 * valueOf() : �⺻ �ڷ����� ���ڿ��� ��ȯ
	 * split() : ���ڿ��� ���� ���ڸ� �������� �迭�� ��ȯ
	 * StringTokenizer()
	 */
}
