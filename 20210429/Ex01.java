import java.util.HashMap;
import java.util.Iterator;

public class Ex01 {

	public static void main(String[] args) {
		
		HashMap<Integer, String> map = new HashMap<Integer, String>();
		map.put(1, "������");
		map.put(2, "�̻��");
		map.put(3, "�����");
		map.put(4, "������");
		map.put(5, "�̻��");
		map.put(5, "�̻��");
		map.put(5, "�̻��");
		map.put(5, "������");
		
		
		Iterator<Integer> keys = map.keySet().iterator();
		while(keys.hasNext()) {
			Integer key = keys.next();
			System.out.println(map.get(key));
		}
	}

}
