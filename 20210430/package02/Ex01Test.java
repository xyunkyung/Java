package package02;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Ex01Test {

	public static void main(String[] args) {
		// Map<key, value>
		Map<String, String> map = new HashMap<String, String>();
		map.put("1", "������");
		map.put("2", "�̿���");
		for(String key : map.keySet()) {
			System.out.println(map.get(key));
		}
		
		// List<value>
		List<String> list = new ArrayList<String>();
		list.add("������");
		list.add("���ϴ�");
		for(String val : list) {
			System.out.println(val);
		}
	}

}
