package package02;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Ex01Test {

	public static void main(String[] args) {
		// Map<key, value>
		Map<String, String> map = new HashMap<String, String>();
		map.put("1", "이현경");
		map.put("2", "이우주");
		for(String key : map.keySet()) {
			System.out.println(map.get(key));
		}
		
		// List<value>
		List<String> list = new ArrayList<String>();
		list.add("이혜성");
		list.add("이하늘");
		for(String val : list) {
			System.out.println(val);
		}
	}

}
