package package03;

import java.util.HashMap;
import java.util.Map;

public class Ex16Test {

	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<String, Integer>();
		map.put("������", 25);
		map.put("������", 5);
		map.put("�̿���", 3);
		
		System.out.println("map size : " + map.size());
		System.out.println("data : " + map.get("�̿���"));
		
		// map ������ ����
		map.remove("�̿���");
		for(String str : map.keySet()) {
			System.out.println(map.get(str));
		}
		
		// map ������ ����
		map.put("������", 50);	// �ߺ� Ű ������� �ʱ� ������ Ű�� ���� ��� ���� ����
		for(String str : map.keySet()) {
			System.out.println("���� �� : " + map.get(str));
		}
		
		// ��ü����
		map.clear();
		System.out.println("map size : " + map.size());
	}

}
