
public class ArrayInArrayExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[][] mathScores = new int[2][3];
		for(int i = 0; i < mathScores.length; i++) {
			for(int k = 0; k < mathScores.length; k++) {
				System.out.println("mathScores[" + i + "][" + k + "] = " + mathScores[i][k]);
			}
		}
		System.out.println();
		
		int[][] englishScores = new int[2][];
		
	}

}
