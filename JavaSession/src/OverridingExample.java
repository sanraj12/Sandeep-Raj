class Animal {
	public void eat() {

		System.out.println("Inside Animal  eating");

	};

}

class Horse extends Animal {
	public void eat() {

		System.out.println("Inside Hoese  eating");

	};
}

class Lion extends Animal {

	public void eat() {

		System.out.println("Inside Lion  eating");
	};

}

public class OverridingExample {

	public static void main(String[] args) {

		Animal animal = new Animal();
		Animal animalHorse = new Horse();
		Animal animalLion = new Lion();
		System.out.println("Animal eat method excuting");
		animal.eat();
		System.out.println("Horse method excuting");
		animalHorse.eat();
		System.out.println("Lion eat method executiong");
		animalLion.eat();

	}

}
