package package02;

import java.util.ArrayList;
import java.util.List;

public class Ex09Test {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
		
		for(int i = 1; i <= 45; i++) {
			list.add(i);
		}
		int [] lotto = new int[6];
		
		for(int i = 0; i < lotto.length; i++) {
			// list의 index를 랜덤 값으로 가져옴		// 45
			int num = (int)(Math.random() * list.size());	// 0 ~ 44
			lotto[i] = list.get(num);	// 리스트에 있는 값 배열에 저장
			list.remove(num);	// 배열에 저장된 리스트의 값을 삭제
		}
		
		for(int i = 0; i < lotto.length; i++) {
			System.out.print(lotto[i] + " ");
		}
	}

}
