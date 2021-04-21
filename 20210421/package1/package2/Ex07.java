package package1.package2;

public class Ex07 {

	private String company;
	protected String model = "k5";
	
	public void setCompany(String company) {
		this.company = company;
	}
	protected void setModel(String model) {
		this.model = model;
	}
	protected String getCompany() {
		return this.company;
	}
	public String getModel() {
		return this.model;
	}
}
