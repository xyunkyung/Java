
public class CarExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Car car = new Car();
		car.setCompany("������");
		car.setModel("�ҳ�Ÿ");
		car.setColor("������");
		car.setMaxSpeed(100);
		
		System.out.println(car.company);
		System.out.println(car.model);
		System.out.println(car.color);
		System.out.println(car.maxSpeed);
		
		System.out.println("");
		
		Car car1 = new Car();
		car1.setCompany("�����");
		car1.setModel("k9");
		car1.setColor("���");
		
		System.out.println(car1.company);
		System.out.println(car1.model);
		System.out.println(car1.color);
	}

}
