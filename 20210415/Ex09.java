
public class Ex09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [] i = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
		
		
		int sum = 0;
		for(int idx = 0; idx < i.length; idx++) {
			sum += i[idx];
		}
		System.out.println(sum);
		
		System.out.println("");
		
		// 쉬운 for문으로 합을 구하시오.
		sum = 0;
		
		for(int num : i) {
			sum += num;
		}
		System.out.println(sum);
		
		System.out.println("");
		
		int [] score = {60, 89, 56, 73, 66, 90, 95};
		sum = 0;
		// 평균을 구하시오.
		
		for(int num : score) {
			sum += num;
		}
		System.out.println(sum / score.length);
	}

}
