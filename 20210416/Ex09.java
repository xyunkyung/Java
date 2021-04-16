
public class Ex09 {

	String company;
	String model;
	String color;
	int maxSpeed;
	
	public Ex09() {}
	
	public Ex09(String company, String model, int maxSpeed) {
		this(company, model);	// ������ �Ӽ��� �����ִ� ������ ȣ��
		this.maxSpeed = maxSpeed;
	}
	
	public Ex09(String company, String model, String color) {
		this(company, model);
		this.color = color;
	}
	
	public Ex09(String company, String model) {
		this.company = company;
		this.model = model;
	}
	
	public void setCompany(String company) {
		this.company = company;
	}
	
	public String getCompany() {
		return this.company;
	}
	
	public void setModel(String model) {
		this.model = model;
	}
	
	public String getModel() {
		return this.model;
	}
	
	public void setColor(String color) {
		this.color = color;
	}
	
	public String getColor() {
		return this.color;
	}
	
	public void setMaxSpeed(int maxSpeed) {
		this.maxSpeed = maxSpeed;
	}
	
	public int getMaxSpeed() {
		return this.maxSpeed;
	}
}
