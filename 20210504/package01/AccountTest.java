package package01;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class AccountTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Map<Integer, Account> map = new HashMap<Integer, Account>();

		while (true) {
			System.out.println("���� ��� : 1 | �Ա� : 2 | ��� : 3 | ���� ��ȸ : 4 | ���� : 5");
			System.out.print("�ش� ��ȣ ���� > ");
			
			int num;
			try {
				num = sc.nextInt();
			} catch(Exception e) {
				sc.nextLine();
				System.out.println("���ڸ� �Է� !!");
				continue;
			}

			switch (num) {
			case 1:
				System.out.println("���� ��� ȭ���Դϴ�.");
				System.out.print("���� ��ȣ > ");

				int accNum, money;
				String accName;

				try {
					accNum = sc.nextInt();
					System.out.print("�Ա� �� > ");
					money = sc.nextInt();
					sc.nextLine();

				} catch (Exception e) {
					sc.nextLine();
					System.out.println("���ڸ� �Է� !!");
					break;
				}
				
				System.out.print("���� �� > ");
				accName = sc.nextLine();

				Account acc = new Account(accNum, money, accName);
				map.put(accNum, acc);

				break;
			case 2:
				System.out.println("�Ա� ȭ���Դϴ�.");
				System.out.print("�Ա� ���� > ");
				int accNum1 = sc.nextInt();
				sc.nextLine();

				if(map.containsKey(accNum1)) {
					System.out.print("�Ա� �� > ");
					money = sc.nextInt();
					sc.nextLine();
					Account acc1 = map.get(accNum1);
					acc1.setDeposit(money);
				} else {
					System.out.println("���°� �������� �ʽ��ϴ�.");
				}

				break;
			case 3:
				System.out.println("��� ȭ���Դϴ�.");
				System.out.print("��� ���� > ");
				int accNum2 = sc.nextInt();
				sc.nextLine();
				
				if(map.containsKey(accNum2)) {
					System.out.print("��� �� > ");
					money = sc.nextInt();
					sc.nextLine();
					Account acc2 = map.get(accNum2);
					acc2.setWithdraw(money);
				} else {
					System.out.println("���°� �������� �ʽ��ϴ�.");
				}
				
				break;
			case 4:
				System.out.println("���� ��ȸ ȭ���Դϴ�.");
				System.out.println("���¹�ȣ \t ���� �� \t �Ѿ�");
				for (Integer key : map.keySet()) {
					Account acc1 = map.get(key);
					acc1.print();
				}
				
				break;
			case 5:
				System.out.println("���α׷��� ����Ǿ����ϴ�.");
				System.exit(0);
			}
			System.out.println();
		}
	}

}
