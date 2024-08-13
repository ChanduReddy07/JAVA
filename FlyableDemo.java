package test1;

interface Flyable{
	void fly_obj();
}

class Spacecraft {
	public static void main(String[] args) {
		Flyable obj1 =()->{
			System.out.println("Apacecraft");
		};

	}

}

class Airplane {
	public static void main(String[] args) {
		Flyable obj2 =()->{
			System.out.println("Airplane");
		};

	}

}

public class Helicopter {
	public static void main(String[] args) {
		Flyable obj3 =()->{
			System.out.println("Helicopter");
		};
		obj3.fly_obj();

	}

}
