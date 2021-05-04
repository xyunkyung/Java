import java.io.FileWriter;
import java.io.IOException;

public class Ex01 {

	public static void main(String [] args) {
		FileWriter fw = null;
		try {
			fw = new FileWriter("c:\\Java\\fileWriter.txt");
			String msg = "�ȳ��ϼ��� FileWriter �׽�Ʈ";
			fw.write(msg);
		} catch (IOException e) {
			e.printStackTrace();
			System.out.println("������ �������� �ʽ��ϴ�.");
		} finally {
			if(fw != null)
				try {
					fw.close();
				} catch (IOException e) {}
		}
	}
}
