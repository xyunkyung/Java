
public class Ex01 {

	int num;
	String writer;
	String subject;
	String content;
	String enterDate;
	public Ex01() {}
	// �����ڴ� class ���� ������ �� �� �̻� �����ؾ� ��
	
	public Ex01(int num, String writer) {
		this.num = num;
		this.writer = writer;
	}
	
	// ����ʵ忡 ���� �����ϱ� ���� ���
	public void setNum(int num) {
		this.num = num;
	}
	// ����ʵ� ���� �ܺη� ��������
	public int getNum() {
		return this.num;
	}
	// ���ο��� �ڵ尡 ���ǵǾ� �ִ� �޼��带 ��ȣ�� �޼���� �Ѵ�.
	public void setWriter(String writer) {
		this.writer = writer;
	}
	public String getWriter() {
		return this.writer;
	}
	
	public void setContent(String content) {
		this.content = content;
	}
	public String getContent() {
		return this.content;
	}
	
	public void setEnterDate(String enterDate) {
		this.enterDate = enterDate;
	}
	public String getEnterDate() {
		return this.enterDate;
	}
}
