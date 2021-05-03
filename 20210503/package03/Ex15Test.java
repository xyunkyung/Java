package package03;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Vector;

public class Ex15Test {

	public static void main(String[] args) {
		List<Board> list = new ArrayList<Board>();
		Board board = new Board("����1", "����1", "�̸�1");
		list.add(board);
		list.add(new Board("����2", "����2", "�̸�2"));
		list.add(new Board("����3", "����3", "�̸�3"));
		list.add(new Board("����4", "����4", "�̸�4"));
		
		for(Board bd : list) {
			System.out.println(bd.content);
		}
		
		List<Board> list1 = Arrays.asList(
				new Board("����1", "����1", "�̸�1"),
				new Board("����2", "����2", "�̸�2"),
				new Board("����3", "����3", "�̸�3"),
				new Board("����4", "����4", "�̸�4")
				);
		for(Board bd : list1) {
			System.out.println(bd.content);
		}
		
		List<Board> list2 = new Vector<Board>();
		Board b1 = new Board("����1", "����1", "�̸�1");
		list2.add(b1);
		list2.add(new Board("����2", "����2", "�̸�2"));
		list2.add(new Board("����3", "����3", "�̸�3"));
		list2.add(new Board("����4", "����4", "�̸�4"));
		
		for(Board bd : list2) {
			System.out.println(bd.content);
		}
	}

}
