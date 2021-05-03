package package03;

import java.util.ArrayList;
import java.util.List;

public class Ex12Test {

	public static void main(String[] args) {
		// 컬렉션 : 크기가 지정되지 않은 자료형 (List, Map, set ...)
		//		    크기를 유동적으로 사용할 수 있게 만들어 놓음.
		// List와 Map의 차이는 index를 사용하는지 또는 키를 사용하는지
		List<String> list = new ArrayList<String>();
		list.add("이혜성");	// 0
		list.add("이혜성");	// 1
		list.add("이하늘");	// 2
		list.add("이우주"); 	// 3
		list.add("이혜성");	// 4
		
		for(String s : list) {
			System.out.println(s);
		}
		System.out.println("list size : " + list.size());
		
		String str = list.get(2);
		System.out.println("index 2 : " + str);
		
		System.out.println("index 3 : " + list.get(3));
		System.out.println("list size : " + list.size());
		
		list.remove(3);	// index 이용해서 삭제
		System.out.println("index 3 : " + list.get(3));
		System.out.println("list size : " + list.size());
		
		list.add(2, "DataBase");
		System.out.println("index 2 : " + list.get(2));
		System.out.println("index 3 : " + list.get(3));
		
		list.remove("DataBase");	// value를 이용해서 삭제
		System.out.println(list.get(2));
		
	}

}
