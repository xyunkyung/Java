package package02;

import java.util.HashMap;
import java.util.Iterator;

public class Ex08Test {

	public static void main(String[] args) {
		HashMap<Integer, Ex06> map = new HashMap<Integer, Ex06>();
		Ex06 ex = new Ex06("�����", 1000);
		map.put(Ex06.idx, ex);
		
		ex = new Ex06("������", 500);
		map.put(Ex06.idx, ex);
		
		ex = new Ex06("��Ź��", 700);
		map.put(Ex06.idx, ex);
		
		ex = new Ex06("��ġ �����", 1500);
		map.put(Ex06.idx, ex);
		
		ex = new Ex06("Ƽ��", 2000);
		map.put(Ex06.idx, ex);
		
		Iterator<Integer> keys = map.keySet().iterator();
		while(keys.hasNext()) {
			Integer key = keys.next();
			System.out.println(map.get(key).getGoodsName() + " " + map.get(key).getGoodsPrice() + "��");
		}
	
	}

}
