
public class BoardTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Board board = new Board();
		board.setNum(1);
		board.setWriter("이현경");
		board.setSubject("안녕");
		board.setContent("안녕하세요 이현경입니다~~");
		board.setEnterDate("2021-04-16");
		
		System.out.println("글 번호 : " + board.getNum());
		System.out.println("글쓴이 : " + board.getWriter());
		System.out.println("제목 : " + board.getSubject());
		System.out.println("내용 : " + board.getContent());
		System.out.println("날짜 : " + board.getEnterDate());
		
	}

}
