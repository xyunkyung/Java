
public class Promotion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		byte b = 10;	// 00001010
		short s = b;	// 00000000 00001010
		int i = s;		// 00000000 00000000 00000000 00001010
		long l = i;		// 00000000 00000000 00000000 00000000 00000000 00000000 00000000 00001010
		
		float f = 0.5f;
		double d = f;	// �ڵ� �� ��ȯ
		System.out.println(d);
		
		f = i;
		System.out.println(f); // ��� �� : 10.0
		
		f = l;
		System.out.println(l); // ��� �� : 10
		
	}

}
