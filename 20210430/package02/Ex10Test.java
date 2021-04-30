package package02;

public class Ex10Test {

	public static void main(String[] args) {
		long startTime = System.currentTimeMillis();	// start time
		
		int sum = 0;
		for(int i = 1; i <= 1000000; i++) {
			sum += i;
		}
		System.out.println("1 ~ 1000000 sum result : " + sum);
		
		long endTime = System.currentTimeMillis();	// end time
		System.out.println("execute time : " + (endTime - startTime) + "/1000 sec");
	}
}
