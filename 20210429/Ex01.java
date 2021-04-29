import java.util.HashMap;
import java.util.Iterator;

public class Ex01 {

	public static void main(String[] args) {
		
		HashMap<Integer, String> map = new HashMap<Integer, String>();
		map.put(1, "이현경");
		map.put(2, "이상범");
		map.put(3, "이장범");
		map.put(4, "박준현");
		map.put(5, "이상범");
		map.put(5, "이상범");
		map.put(5, "이상범");
		map.put(5, "김찬중");
		
		
		Iterator<Integer> keys = map.keySet().iterator();
		while(keys.hasNext()) {
			Integer key = keys.next();
			System.out.println(map.get(key));
		}
	}

}
