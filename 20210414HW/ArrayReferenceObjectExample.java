
public class ArrayReferenceObjectExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] strArray = new String[3];
		strArray[0] = "Java";
		strArray[1] = "Java";
		strArray[2] = new String("Java");
		
		System.out.println(strArray[0] == strArray[1]);	// true	: ������ String ��ü�� �����ϱ� ����
		System.out.println(strArray[0] == strArray[2]);	// false	: new �����ڷ� ��ü �����ϸ� ���ο� String ��ü �����Ǳ� ����
		System.out.println(strArray[0].equals(strArray[2]));	// true	: ���ڿ��� ���ϱ� ����
	}

}
