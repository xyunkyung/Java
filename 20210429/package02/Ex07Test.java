package package02;

import java.util.HashMap;

public class Ex07Test {

	public static void main(String[] args) {
		HashMap<Integer, String> map = new HashMap<Integer, String>();
		map.put(1, "이현경");
		System.out.println(map.get(1));
		
		HashMap<String, Integer> map1 = new HashMap<String, Integer>();
		map1.put("1", 10);
		System.out.println(map1.get("1"));
		
		HashMap<String, Ex06> map2 = new HashMap<String, Ex06>();
		Ex06 ex = new Ex06("냉장고", 100);
		map2.put(Integer.toString(Ex06.idx), ex);
		
		ex = new Ex06("에어컨", 200);
		map2.put(Integer.toString(Ex06.idx), ex);
		
		map2.get("1");
		System.out.println(map2.get("1").getGoodsName());
		
		map2.get("2");
		System.out.println(map2.get("2").getGoodsName());
		
	}

}
