
public class BoardTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Board board = new Board();
		board.setNum(1);
		board.setWriter("������");
		board.setSubject("�ȳ�");
		board.setContent("�ȳ��ϼ��� �������Դϴ�~~");
		board.setEnterDate("2021-04-16");
		
		System.out.println("�� ��ȣ : " + board.getNum());
		System.out.println("�۾��� : " + board.getWriter());
		System.out.println("���� : " + board.getSubject());
		System.out.println("���� : " + board.getContent());
		System.out.println("��¥ : " + board.getEnterDate());
		
	}

}
