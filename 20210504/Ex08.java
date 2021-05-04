import java.io.File;
import java.util.Scanner;

public class Ex08 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 파일 삭제
		System.out.print("삭제할 파일 이름 : ");
		String fileName = sc.nextLine();
		File file = new File("c:\\Java\\" + fileName);
		if(file.exists()) {
			file.delete();
			System.out.println(fileName + "(이)가 삭제되었습니다.");
		} else
			System.out.println("파일이 존재하지 않습니다.");
	}

}
