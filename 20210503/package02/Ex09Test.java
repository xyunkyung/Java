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
			// list�� index�� ���� ������ ������		// 45
			int num = (int)(Math.random() * list.size());	// 0 ~ 44
			lotto[i] = list.get(num);	// ����Ʈ�� �ִ� �� �迭�� ����
			list.remove(num);	// �迭�� ����� ����Ʈ�� ���� ����
		}
		
		for(int i = 0; i < lotto.length; i++) {
			System.out.print(lotto[i] + " ");
		}
	}

}
