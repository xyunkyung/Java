import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Ex04 {

	public static void main(String[] args) {
		
		FileWriter fw = null;
		BufferedWriter bw = null;
		PrintWriter pw = null;
		try {
			fw = new FileWriter("c:\\Java\\printwriter.txt");
			bw = new BufferedWriter(fw);
			pw = new PrintWriter(bw, true);
			pw.println("æ»≥Á«œººø‰.");
			pw.println("π›∞©Ω¿¥œ¥Ÿ.");
			pw.println(100);
			pw.println(10.5);
			pw.println(new Integer(1000));
			pw.println(new Boolean(true));
			pw.println(true);
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
			if(pw != null) {
				pw.close();
			}
		}
		
	}

}
