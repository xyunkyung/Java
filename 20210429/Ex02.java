import java.util.HashMap;

public class Ex02 {

	public static void main(String[] args) {
		HashMap<String, String> map = new HashMap<String, String>();
		map.put("lhk0", "������");
		map.put("lhk1", "�̻��");
		map.put("lhk2", "�����");
		map.put("lhk3", "������");
		
		System.out.println(map.get("lhk0"));
		System.out.println(map.get("lhk1"));
		System.out.println(map.get("lhk2"));
		
		System.out.println(map.keySet());
		for(String key : map.keySet()) {
			System.out.println(map.get(key));
		}
	}

}
