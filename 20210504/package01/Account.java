package package01;

public class Account {

	int accNum;
	int balance;
	String accName;
	
	Account(int accNum, int balance, String accName) {
		this.accNum = accNum;
		this.balance = balance;
		this.accName = accName;
	}
	
	// ���
	public void setWithdraw(int money) {
		this.balance -= money;
	}
	
	// �Ա�
	public void setDeposit(int money) {
		this.balance += money;
	}
	
	public void print() {
		System.out.println(this.accNum + "\t" + this.accName + "\t" + this.balance);
	}
}
