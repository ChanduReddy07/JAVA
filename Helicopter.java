package test1;

interface Flyable{
	void fly_obj();
}

class Spacecraft {
	public static void main(String[] args) {
		Flyable obj1 =()->{
			System.out.println("Spacecraft is flying");
		};

	}

}

class Airplane {
	public static void main(String[] args) {
		Flyable obj2 =()->{
			System.out.println("Airplane is flying");
		};

	}

}

public class Helicopter {
	public static void main(String[] args) {
		Flyable obj3 =()->{
			System.out.println("Helicopter s flying");
		};
		obj3.fly_obj();

	}

}
