import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("���� �̸� : ");
		String fileName = sc.nextLine();
		FileWriter fw = null;
		try {
			fw = new FileWriter("c:\\Java\\" + fileName);
			System.out.print("���� �Է� : ");
			String msg = sc.nextLine();
			fw.write(msg);
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if(fw != null) {
				try {
					fw.close();
				} catch (IOException e) {}
			}
		}
	}

}
