
public class Ex23 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 1. while 6단 출력
		// 2. 6단 출력 (홀수만)
		// 3. 6단 출력 (짝수만)
		// 4. 6단 출력 (홀수만) continue
		// 5. 6단 출력 (짝수만) continue
		// 6. 1~100까지 출력 4배수만
		// 7. 1~100 중 4배수의 합
		// 8. 1~100까지 출력 4배수만 continue
		// 9. 1~100 중 4배수의 합 continue
		// 10. 1~100 중 4의 배수가 아닌 수의 합 continue
		
		// 1-1. 3단부터 7단 까지 중 4곱 부터 6곱 까지만 출력하시오.
		
		System.out.println("#1");
		int i = 1;
		while(i <= 9) {
			System.out.println("6 * " + i + " = " + 6 * i);
			i++;
		}
		
		System.out.println("\n#2");
		i = 1;
		while(i <= 9) {
			if(i % 2 != 0) {
				System.out.println("6 * " + i + " = " + 6 * i);
			}
			i++;
		}
		
		System.out.println("\n#3");
		i = 1;
		while(i <= 9) {
			if(i % 2 == 0) {
				System.out.println("6 * " + i + " = " + 6 * i);
			}
			i++;
		}
		
		System.out.println("\n#4");
		i = 0;
		while(i < 9) {
			i++;
			if(i % 2 == 0) continue;
			System.out.println("6 * " + i + " = " + 6 * i);
		}
		
		System.out.println("\n#5");
		i = 0;
		while(i < 9) {
			i++;
			if(i % 2 != 0) continue;
			System.out.println("6 * " + i + " = " + 6 * i);
		}
		
		System.out.println("\n#6");
		i = 1;
		while(i <= 100) {
			if(i % 4 == 0) {
				System.out.println(i);
			}
			i++;
		}
		
		System.out.println("\n#7");
		i = 1;
		int sum = 0;
		while(i <= 100) {
			if(i % 4 == 0) {
				sum += i;
			}
			i++;
		}
		System.out.println(sum);
		
		System.out.println("\n#8");
		i = 0;
		while(i < 100) {
			i++;
			if(i % 4 != 0) continue;
			System.out.println(i);
		}
		
		System.out.println("\n#9");
		i = 0;
		sum = 0;
		while(i < 100) {
			i++;
			if(i % 4 != 0) continue;
			sum += i;
		}
		System.out.println(sum);
		
		System.out.println("\n#10");
		i = 0;
		sum = 0;
		while(i < 100) {
			i++;
			if(i % 4 == 0) continue;
			sum += i;
		}
		System.out.println(sum);
		
		System.out.println("\n#1-1");
		for(int x = 3; x <= 7; x++) {
			for(int j = 4; j <= 6; j++)
				System.out.println(x + " * " + j + " = " + x * j);
		}
	}

}
