package package03;

import java.util.HashMap;
import java.util.Map;

public class Ex16Test {

	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<String, Integer>();
		map.put("이현경", 25);
		map.put("이혜성", 5);
		map.put("이우주", 3);
		
		System.out.println("map size : " + map.size());
		System.out.println("data : " + map.get("이우주"));
		
		// map 데이터 삭제
		map.remove("이우주");
		for(String str : map.keySet()) {
			System.out.println(map.get(str));
		}
		
		// map 데이터 수정
		map.put("이현경", 50);	// 중복 키 허용하지 않기 때문에 키가 같은 경우 값을 변경
		for(String str : map.keySet()) {
			System.out.println("변경 후 : " + map.get(str));
		}
		
		// 전체삭제
		map.clear();
		System.out.println("map size : " + map.size());
	}

}
