package abstrac;

public class Dog extends Animal{

	public Dog(String name) {
		super(name);
	}

	@Override
	public void eat() { 
		System.out.println(getName()+ "Dog eats biscuits");
	}

	@Override
	public void breath() {
		System.out.println("Dog breathes");
		
	}

}
