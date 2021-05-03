package package03;

import java.util.ArrayList;
import java.util.List;

public class Ex14 {

	public static void main(String[] args) {
		List<Board> list = new ArrayList<Board>();
		Board board = new Board("����", "����", "�̸�");
		list.add(board);
		
		board = new Board("����1", "����1", "�̸�1");
		list.add(board);
		
		board = new Board("����2", "����2", "�̸�2");
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
