package abstrac;

public abstract class Bird extends Animal{

	public Bird(String name) {
		super(name);
	}

	@Override
	public void eat() {
		System.out.println(getName()+ "pecking food");
	}

	@Override
	public void breath() {
		System.out.println("Bird breathes");
	}
	public abstract void fly();

}
