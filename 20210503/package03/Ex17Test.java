package package03;

import java.util.HashMap;
import java.util.Map;

public class Ex17Test {

	public static void main(String[] args) {
		Map<Integer, Board> map = new HashMap<Integer, Board>();
		Board b = new Board("����", "����", "�۾���");
		map.put(1, b);
		map.put(2, new Board("����1", "����1", "�۾���1"));
		map.put(2, new Board("����2", "����2", "�۾���2"));
		System.out.println(map.size());
		map.put(3, new Board("����2", "����2", "�۾���2"));
		
		for(Integer i : map.keySet()) {
			Board bd = map.get(i);
			System.out.println(bd.content);
		}
		
		Map<Integer, String> map1 = new HashMap<Integer, String>();
		map1.put(1, "������");
		map1.put(2, "���ϴ�");
		map1.put(3, "������");
		for(Integer i : map1.keySet()) {
			String str1 = map1.get(i);
			System.out.println(str1);
		}
	}

}
