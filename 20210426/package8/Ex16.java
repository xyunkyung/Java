package package8;

public class Ex16 {

	int [] i = {1, 2, 3, 4, 5};
	int sum = 0;
	
	public void add() {
		/*for(int j = 0; j < i.length; j++) {
			sum += i[j];
		}*/
		for(int j : i) {
			sum += j;
		}
		System.out.println(sum);
	}
	public void sum(int [] z) {
		sum = 0;
		for(int j : z) {
			sum += j;
		}
		System.out.println(sum);
	}
}
