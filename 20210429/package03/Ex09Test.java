package package03;

import java.util.HashMap;
import java.util.Iterator;

public class Ex09Test {

	public static void main(String[] args) {
		HashMap<String, Ex09> map = new HashMap<String, Ex09>();
		Ex09 ex = new Ex09("1", "lhk1", "이현경");
		map.put(ex.userId, ex);
		
		ex = new Ex09("2", "lhk2", "이우주");
		map.put(ex.userId, ex);
		
		ex = new Ex09("3", "lhk3", "이혜성");
		map.put(ex.userId, ex);
		
		ex = new Ex09("4", "lhk4", "이하늘");
		map.put(ex.userId, ex);
		
		Iterator<String> keys = map.keySet().iterator();
		while(keys.hasNext()) {
			String key = keys.next();
			System.out.println(map.get(key).getUserName());
		}
	}

}
