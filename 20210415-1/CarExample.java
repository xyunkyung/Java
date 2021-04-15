
public class CarExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Car car = new Car();
		car.setCompany("현대차");
		car.setModel("소나타");
		car.setColor("검정색");
		car.setMaxSpeed(100);
		
		System.out.println(car.company);
		System.out.println(car.model);
		System.out.println(car.color);
		System.out.println(car.maxSpeed);
		
		System.out.println("");
		
		Car car1 = new Car();
		car1.setCompany("기아차");
		car1.setModel("k9");
		car1.setColor("흰색");
		
		System.out.println(car1.company);
		System.out.println(car1.model);
		System.out.println(car1.color);
	}

}
