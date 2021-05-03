package package03;

import java.util.ArrayList;
import java.util.List;

public class Ex12Test {

	public static void main(String[] args) {
		// �÷��� : ũ�Ⱑ �������� ���� �ڷ��� (List, Map, set ...)
		//		    ũ�⸦ ���������� ����� �� �ְ� ����� ����.
		// List�� Map�� ���̴� index�� ����ϴ��� �Ǵ� Ű�� ����ϴ���
		List<String> list = new ArrayList<String>();
		list.add("������");	// 0
		list.add("������");	// 1
		list.add("���ϴ�");	// 2
		list.add("�̿���"); 	// 3
		list.add("������");	// 4
		
		for(String s : list) {
			System.out.println(s);
		}
		System.out.println("list size : " + list.size());
		
		String str = list.get(2);
		System.out.println("index 2 : " + str);
		
		System.out.println("index 3 : " + list.get(3));
		System.out.println("list size : " + list.size());
		
		list.remove(3);	// index �̿��ؼ� ����
		System.out.println("index 3 : " + list.get(3));
		System.out.println("list size : " + list.size());
		
		list.add(2, "DataBase");
		System.out.println("index 2 : " + list.get(2));
		System.out.println("index 3 : " + list.get(3));
		
		list.remove("DataBase");	// value�� �̿��ؼ� ����
		System.out.println(list.get(2));
		
	}

}
