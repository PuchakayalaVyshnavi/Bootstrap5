package abstrac;

public class Penguin extends Animal implements CanFly{ 
//instead extending bird , extended the animal and implemented the CanFly interface
	public Penguin(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void breath() {
		// TODO Auto-generated method stub
		
	}	

	@Override
	public void fly() {
		System.out.println("cannot fly just flap");
		
	}


}
