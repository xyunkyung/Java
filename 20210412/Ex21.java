
public class Ex21 {

	public static void main(String [] args) {
		// 1���� 100���� ����Ͻÿ� while
		int i = 0;
		while (i < 100) {
			i++;
			System.out.println(i);
		}
		
		System.out.println("");
		
		// 3���� 95���� ����Ͻÿ�. 
		i = 2;
		while (i < 95) {
			i++;
			System.out.println(i);
		}
		
		System.out.println("");
		
		// 1���� 100�� 3�� ����� ����Ͻÿ�.
		i = 0;
		while(i < 100) {
			i++;
			if (i % 3 == 0) {
				System.out.println(i);
			}
		}
		
		System.out.println("");
		
		// 4����� ����Ͻÿ�.
		i = 0;
		while(i < 100) {
			i++;
			if (i % 4 == 0) {
				System.out.println(i);
			}
		}
	}
}
