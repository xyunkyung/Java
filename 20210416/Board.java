
public class Board {

	int num;	// 글 번호
	String writer;	// 글쓴이
	String subject;	// 제목
	String content;	// 내용
	String enterDate;	// 날짜
	
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
