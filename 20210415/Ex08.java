
public class Ex08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [] i = {95, 71, 84, 93, 87};
		
		int sum = 0;
		
		for(int num : i) {
			sum += num;
		}
		System.out.println(sum);
		
		System.out.println("");
		
		// ���� for���� �̿��ؼ� ���� ���Ͻÿ�.
		
		sum = 0;
		
		for(int n = 0; n < i.length; n++) {
			sum += i[n];
		}
		System.out.println(sum);
	}

}
