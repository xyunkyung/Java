import java.util.HashMap;

public class Ex02 {

	public static void main(String[] args) {
		HashMap<String, String> map = new HashMap<String, String>();
		map.put("lhk0", "이현경");
		map.put("lhk1", "이상범");
		map.put("lhk2", "이장범");
		map.put("lhk3", "김찬중");
		
		System.out.println(map.get("lhk0"));
		System.out.println(map.get("lhk1"));
		System.out.println(map.get("lhk2"));
		
		System.out.println(map.keySet());
		for(String key : map.keySet()) {
			System.out.println(map.get(key));
		}
	}

}
