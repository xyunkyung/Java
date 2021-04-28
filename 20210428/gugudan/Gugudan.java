package gugudan;

public class Gugudan {

	public void gugu(int startDan, int endDan, int startGop, int endGop) {
		for(int i = startDan; i <= endDan; i++) {
			for(int j = startGop; j <= endGop; j++) {
				System.out.println(i + " x " + j + " = " + i * j);
			}
			System.out.println();
		}
	}
}
