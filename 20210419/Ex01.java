
public class Ex01 {

	int num;
	String writer;
	String subject;
	String content;
	String enterDate;
	public Ex01() {}
	// 생성자는 class 내에 무조건 한 개 이상 존재해야 함
	
	public Ex01(int num, String writer) {
		this.num = num;
		this.writer = writer;
	}
	
	// 멤버필드에 값을 전달하기 위해 사용
	public void setNum(int num) {
		this.num = num;
	}
	// 멤버필드 값을 외부로 전달해줌
	public int getNum() {
		return this.num;
	}
	// 내부에서 코드가 정의되어 있는 메서드를 피호출 메서드라 한다.
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
