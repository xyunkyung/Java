import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Ex03 {

	public static void main(String[] args) {
		FileWriter fw = null;
		BufferedWriter bw = null;
		try {
			fw = new FileWriter("c:\\Java\\bufferwriter1.txt");
			bw = new BufferedWriter(fw);
			bw.write("BufferWriter �׽�Ʈ�Դϴ�.");
			bw.newLine();
			bw.write("�ȳ��ϼ���." + System.getProperty("line.separator"));
			bw.write("������ ���Դϴ�.");
			bw.flush();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if(fw != null) {
				try {
					fw.close();
				} catch (IOException e) {}
			}
			if(bw != null) {
				try {
					bw.close();
				} catch (IOException e) {}
			}
		}

	}

}
