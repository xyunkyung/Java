
public class Ex04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for(int j = 0; j < args.length; j++) {
			System.out.println(args[j]);
		}

		if(args[0].equals("/?")) {
			System.out.println("도움말 입니다.");
		} else if(args[0].contentEquals("+")) {
			System.out.println(Integer.parseInt(args[1]) + Integer.parseInt(args[2]));
		} else if(args[0].contentEquals("-")) {
			System.out.println(Integer.parseInt(args[1]) - Integer.parseInt(args[2]));
		}
	}

}
