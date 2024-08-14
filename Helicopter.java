package test1;

interface Flyable{
	void fly_obj();
}

class Spacecraft {
	public static void main(String[] args) {
		Flyable obj1 =()->{
			System.out.println("Spacecraft is flying");
		};
		obj2.fly_obj();
	}

}

class Airplane {
	public static void main(String[] args) {
		Flyable obj2 =()->{
			System.out.println("Airplane is flying");
		};
		obj2.fly_obj();
	}

}

public class Helicopter {
	public static void main(String[] args) {
		Flyable obj3 =()->{
			System.out.println("Helicopter is flying");
		};
		obj3.fly_obj();

	}

}
