
public class Ex09Test {

	public static void main(String [] args) {
		Ex09 ex = new Ex09("����", "�ҳ�Ÿ", 300);
		System.out.println(ex.getCompany());
		System.out.println(ex.getModel());
		System.out.println(ex.getMaxSpeed());
		System.out.println();
		
		Ex09 ex1 = new Ex09("���", "k9", "����");
		System.out.println(ex1.getCompany());
		System.out.println(ex1.getModel());
		System.out.println(ex1.getColor());
		System.out.println();
	}
}
