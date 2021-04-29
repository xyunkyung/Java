package package02;

import java.util.HashMap;
import java.util.Iterator;

public class Ex08Test {

	public static void main(String[] args) {
		HashMap<Integer, Ex06> map = new HashMap<Integer, Ex06>();
		Ex06 ex = new Ex06("³ÃÀå°í", 1000);
		map.put(Ex06.idx, ex);
		
		ex = new Ex06("¿¡¾îÄÁ", 500);
		map.put(Ex06.idx, ex);
		
		ex = new Ex06("¼¼Å¹±â", 700);
		map.put(Ex06.idx, ex);
		
		ex = new Ex06("±èÄ¡ ³ÃÀå°í", 1500);
		map.put(Ex06.idx, ex);
		
		ex = new Ex06("Æ¼ºñ", 2000);
		map.put(Ex06.idx, ex);
		
		Iterator<Integer> keys = map.keySet().iterator();
		while(keys.hasNext()) {
			Integer key = keys.next();
			System.out.println(map.get(key).getGoodsName() + " " + map.get(key).getGoodsPrice() + "¿ø");
		}
	
	}

}
