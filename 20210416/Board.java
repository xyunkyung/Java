
public class Board {

	int num;	// �� ��ȣ
	String writer;	// �۾���
	String subject;	// ����
	String content;	// ����
	String enterDate;	// ��¥
	
	public Board() {}
	
	public void setNum(int num) {
		this.num = num;
	}
	public int getNum() {
		return this.num;
	}
	
	public void setWriter(String writer) {
		this.writer = writer;
	}
	public String getWriter() {
		return this.writer;
	}
	
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public String getSubject() {
		return this.subject;
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
