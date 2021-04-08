
public class Ex11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int i = 10;
		System.out.println(i);
		
		i = 20;
		System.out.println(i);
		
		int j, k, l;
		j = k = l = 20;
		System.out.println(j);
		System.out.println(k);
		System.out.println(l);
		
		i = i + 1;
		System.out.println(i);
		
		i++;
		System.out.println(i);
		
		i += 1;
		System.out.println(i);
		
		i += 2;
		System.out.println(i);
		
		i -= 2;
		System.out.println(i);
		
		i *= 2;
		System.out.println(i);
		
		i %= 2;
		System.out.println(i);
		
		int score = 85;
		String grade = score >= 60 ? "합격" : "불합격";
		System.out.println(grade);
		
		grade = score >= 90 ? "A" : (score >= 70 ? "B" : "C");
		System.out.println(grade);
		
	}

}
