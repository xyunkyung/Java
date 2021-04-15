
public class ArrayCreateByValueListExample1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] scores = {83, 90, 87};
		
		System.out.println("score[0] : " + scores[0]);	// 83
		System.out.println("score[1] : " + scores[1]);	// 90
		System.out.println("score[2] : " + scores[2]);	// 87
		
		int sum = 0;
		for(int i = 0; i < 3; i++) {
			sum += scores[i];
		}
		System.out.println("ÃÑÇÕ : " + sum);	// ÃÑÇÕ : 260
		
		double avg = (double)sum /3;
		System.out.println("Æò±Õ : " + avg);	// Æò±Õ : 86.6666666666667
	}

}
