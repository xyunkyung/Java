package package03;

public class Ex18Test {

	public static void main(String[] args) {
		String text = "���� �ڹ� ���α׷��� �� �ϵ��� ��� �մϴ�.";
		String [] res = text.split(" ");
		for(String str : res) {
			System.out.println(str);
		}
		
		text = "����`�ڹ�`���α׷���`��`�ϵ���`���`�մϴ�.";
		res = text.split("`");
		for(String str : res) {
			System.out.println(str);
		}
		
		text = "ȫ�浿&�̼�ȫ,�ڿ���,���ڹ�-�ָ�ȣ";
		res = text.split("&|,|-");
		for(String str : res) {
			System.out.println(str);
		}
	}

}
