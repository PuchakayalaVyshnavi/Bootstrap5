package abstrac;

public class Parrot extends Bird {

	public Parrot(String name) {
		super(name);
	}

	@Override
	public void eat() {
		super.eat();
	}

	@Override
	public void breath() {
		super.breath();
	}

	@Override
	public void fly() {
		System.out.println(getName()+ "flying");

		
	}

}
