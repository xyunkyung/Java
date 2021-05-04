
import java.io.FileReader;
import java.io.IOException;

public class Ex05 {

	public static void main(String [] args) {
		// ���� ������ �о��
		FileReader fr = null;
		try {
			fr = new FileReader("c:\\Java\\fileWriter.txt");
			int readChar;
			while((readChar = fr.read()) != -1) {
				System.out.print((char)readChar);
			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
				try {
					if(fr != null) fr.close();
				} catch (IOException e) {}
		}
	}
}
