package package05;

public interface Ex25 {

	void method1(int dan);
	
	default void method2() {
		System.out.println("MyInterface-method2 ½ÇÇà");
	}
}
