package package03;

public class Ex12 {

	String id;

	public Ex12(String id) {
		this.id = id;
	}

	public void Checked(Object obj) {
		if(obj instanceof Ex12) {	// Ex12¿Í ºñ±³
			Ex12 ex = (Ex12)obj;
			System.out.println(this.id);
		} else {
			System.out.println(obj);
		}
	}
}
