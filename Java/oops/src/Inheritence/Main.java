package Inheritence;

public class Main {
	public static void main(String[] args) {
		Animal animal = new Animal("yoike", 1, 1, 5, 4);
		//animal.eat();
		
		
		Dog dog = new Dog("Tommy", 5, 4, 2, 4, 1, "white");
		//dog.eat();
		dog.walk();
		//dog.run();
	}

}
