import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Ex07 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		FileWriter fw = null;
		BufferedWriter bw = null;
		FileReader fr = null;
		BufferedReader br = null;
		
		try {
			System.out.print("���� �̸� : ");
			String fileName = sc.nextLine();
			fw = new FileWriter("c:\\Java\\" + fileName);
			bw = new BufferedWriter(fw);
			System.out.println("������ �Է��ϼ���.");
			System.out.println("�Է��� ������ exit�� �����ּ���.");
			while (true) {
				String msg = sc.nextLine();
				if(msg.trim().equals("exit")) break;
				bw.write(msg);
				bw.newLine();
			}
			bw.flush();
			fr = new FileReader("c:\\Java\\" + fileName);
			br = new BufferedReader(fr);
			String msg;
			while((msg = br.readLine()) != null) {
				System.out.println(msg);
			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (fw != null) fw.close();
				if (bw != null) bw.close();
				if (fr != null) fr.close();
				if (br != null) br.close();
			} catch (Exception e) {
			}
		}
	}

}
