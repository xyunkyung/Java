package package03;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Ex13Test {

	public static void main(String[] args) {
		
		List<String> list2 = new ArrayList<String>();
		list2.add("������");
		
		List<Integer> list3 = new ArrayList<Integer>();
		list3.add(1);
		
		List<String> list = Arrays.asList("ȫ�浿", "������", "������");
		for(String str : list) {
			System.out.println(str);
		}
		List<Integer> list1 = Arrays.asList(1,2,3,4,5);
		for(Integer i : list1) {
			System.out.println(i);
		}
	}

}
