package package01;

import java.util.HashMap;

public class Ex04Test {

	public static void main(String[] args) {
		HashMap<Integer, Ex03> map = new HashMap<Integer, Ex03>();
		
		Ex03 ex = new Ex03("lhk0", "이현경");
		map.put(ex.idx, ex);
		
		ex = new Ex03("lhk1", "이상범");
		map.put(ex.idx, ex);
		
		ex = new Ex03("lhk2", "이장범");
		map.put(ex.idx, ex);
		
		ex = new Ex03("lhk3", "김찬중");
		map.put(ex.idx, ex);
		
		System.out.println(map.get(1).getName());
		System.out.println(map.get(2).getName());
	}

}
