package package01;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class AccountTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Map<Integer, Account> map = new HashMap<Integer, Account>();

		while (true) {
			System.out.println("계좌 등록 : 1 | 입금 : 2 | 출금 : 3 | 계좌 조회 : 4 | 종료 : 5");
			System.out.print("해당 번호 선택 > ");
			
			int num;
			try {
				num = sc.nextInt();
			} catch(Exception e) {
				sc.nextLine();
				System.out.println("숫자만 입력 !!");
				continue;
			}

			switch (num) {
			case 1:
				System.out.println("계좌 등록 화면입니다.");
				System.out.print("계좌 번호 > ");

				int accNum, money;
				String accName;

				try {
					accNum = sc.nextInt();
					System.out.print("입금 액 > ");
					money = sc.nextInt();
					sc.nextLine();

				} catch (Exception e) {
					sc.nextLine();
					System.out.println("숫자만 입력 !!");
					break;
				}
				
				System.out.print("계좌 주 > ");
				accName = sc.nextLine();

				Account acc = new Account(accNum, money, accName);
				map.put(accNum, acc);

				break;
			case 2:
				System.out.println("입금 화면입니다.");
				System.out.print("입금 계좌 > ");
				int accNum1 = sc.nextInt();
				sc.nextLine();

				if(map.containsKey(accNum1)) {
					System.out.print("입금 액 > ");
					money = sc.nextInt();
					sc.nextLine();
					Account acc1 = map.get(accNum1);
					acc1.setDeposit(money);
				} else {
					System.out.println("계좌가 존재하지 않습니다.");
				}

				break;
			case 3:
				System.out.println("출금 화면입니다.");
				System.out.print("출금 계좌 > ");
				int accNum2 = sc.nextInt();
				sc.nextLine();
				
				if(map.containsKey(accNum2)) {
					System.out.print("출금 액 > ");
					money = sc.nextInt();
					sc.nextLine();
					Account acc2 = map.get(accNum2);
					acc2.setWithdraw(money);
				} else {
					System.out.println("계좌가 존재하지 않습니다.");
				}
				
				break;
			case 4:
				System.out.println("계좌 조회 화면입니다.");
				System.out.println("계좌번호 \t 계좌 주 \t 총액");
				for (Integer key : map.keySet()) {
					Account acc1 = map.get(key);
					acc1.print();
				}
				
				break;
			case 5:
				System.out.println("프로그램이 종료되었습니다.");
				System.exit(0);
			}
			System.out.println();
		}
	}

}
