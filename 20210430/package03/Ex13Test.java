package package03;

public class Ex13Test {

	public static void main(String [] args) {
		String subject = "java programming";
		//				  0123456789012345
		//							1
		char ch = subject.charAt(5);
		System.out.println(ch);
		
		int idx = subject.indexOf('p');
		System.out.println(idx);
		
		idx = subject.indexOf("gramming");	// if sentence, output first text's index
		System.out.println(idx);
		
		idx = subject.indexOf("hyunkyung");	// not exist
		System.out.println(idx);	// -1 because index start number = 0
		
		if(subject.indexOf("hyesung") != -1) {
			System.out.println("hyesung exist");
		} else {
			System.out.println("hyesung not exist");
		}
		
		int count = subject.length();
		System.out.println(count);
		
		int [] i = new int[3];
		count = i.length;
		System.out.println(count);
		
		System.out.println("leeouju".length());
	}
}
