package package03;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Vector;

public class Ex15Test {

	public static void main(String[] args) {
		List<Board> list = new ArrayList<Board>();
		Board board = new Board("제목1", "내용1", "이름1");
		list.add(board);
		list.add(new Board("제목2", "내용2", "이름2"));
		list.add(new Board("제목3", "내용3", "이름3"));
		list.add(new Board("제목4", "내용4", "이름4"));
		
		for(Board bd : list) {
			System.out.println(bd.content);
		}
		
		List<Board> list1 = Arrays.asList(
				new Board("제목1", "내용1", "이름1"),
				new Board("제목2", "내용2", "이름2"),
				new Board("제목3", "내용3", "이름3"),
				new Board("제목4", "내용4", "이름4")
				);
		for(Board bd : list1) {
			System.out.println(bd.content);
		}
		
		List<Board> list2 = new Vector<Board>();
		Board b1 = new Board("제목1", "내용1", "이름1");
		list2.add(b1);
		list2.add(new Board("제목2", "내용2", "이름2"));
		list2.add(new Board("제목3", "내용3", "이름3"));
		list2.add(new Board("제목4", "내용4", "이름4"));
		
		for(Board bd : list2) {
			System.out.println(bd.content);
		}
	}

}
