package package03;

import java.util.ArrayList;
import java.util.List;

public class Ex14 {

	public static void main(String[] args) {
		List<Board> list = new ArrayList<Board>();
		Board board = new Board("제목", "내용", "이름");
		list.add(board);
		
		board = new Board("제목1", "내용1", "이름1");
		list.add(board);
		
		board = new Board("제목2", "내용2", "이름2");
		list.add(board);
		
		for(Board bd : list) {
			System.out.println(bd.subject + ", " + bd.content + ", " + bd.writer);
		}
		
		for(int idx = 0; idx < list.size(); idx++) {
			Board bd = list.get(idx);
			System.out.println(bd.subject + ", " + bd.content + ", " + bd.writer);
		}
	}

}
