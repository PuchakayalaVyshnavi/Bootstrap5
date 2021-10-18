package Inheritence;

public class Dog extends Animal {

	private int eyes;
	private int legs;
	private int tail;
	private String teeth;
	
	//public Dog(String name, int brain, int body, int size, int weight) {====importing the constructor from super class
		//super(name, brain, body, size, weight);== as brain and body is only 1 .
	public Dog(String name, int size, int weight,int eyes, int legs,int tail, String teeth) {
		super(name, 1, 1, size, weight);
		this.eyes = eyes;
		this.legs = legs;
		this.tail = tail;
		this.teeth = teeth;
		
	}
	public void chew() {
		System.out.println("Dog Chew()");
		
	}
	@Override
	public void eat() {
		// TODO Auto-generated method stub
		System.out.println("Dog Eat()");
		chew();
		super.eat();
	}
	
	
	public void walk() {
		System.out.println("Dog Walk()");
		super.move(5);
		// If move method doesn't exist in Dog, by default move is super.move()
	}
	public void run() {
		System.out.println("Dog Run()");
		move(10);// If we use only move()=  if it found the move method in dog class then runs, else runs move method in animal class
		//super.move(10);  to run move method in Animal class directly
		
	}
	public void moveLegs(int speed) {
		System.out.println("Dog Movelegs()");
	}
	@Override
	public void move(int speed) {
		// TODO Auto-generated method stub
		moveLegs(speed);
		super.move(speed);
	}
	
}
