package package03;

import java.util.HashMap;
import java.util.Map;

public class Ex18Test {

	public static void main(String[] args) {
		Map<Integer, String> map = new HashMap<Integer, String>();
		map.put(1, "������");
		map.put(2, "������");
		map.put(3, "���ϴ�");
		map.put(4, "�̿���");
		System.out.println(map.keySet());
		
		map.remove(3);
		System.out.println(map.keySet());
	}

}
