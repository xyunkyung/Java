package package03;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Ex13Test {

	public static void main(String[] args) {
		
		List<String> list2 = new ArrayList<String>();
		list2.add("이현경");
		
		List<Integer> list3 = new ArrayList<Integer>();
		list3.add(1);
		
		List<String> list = Arrays.asList("홍길동", "이혜성", "강감찬");
		for(String str : list) {
			System.out.println(str);
		}
		List<Integer> list1 = Arrays.asList(1,2,3,4,5);
		for(Integer i : list1) {
			System.out.println(i);
		}
	}

}
