package abstrac;

public class Main {
public static void  main (String[] args) {
	Dog dog = new Dog("lucky");
	dog.breath();
	dog.eat();
	Parrot parrot = new Parrot("Green parrot");
	parrot.eat();
	parrot.breath();
	parrot.fly();
	
	Penguin penguin = new Penguin("penguin");
	penguin.fly();
	
	
}
}
