package composition;

public class Main {
public static void main(String[] args) {
	Dimensions dimensions=new Dimensions(20,20,5);
	Case theCase= new Case("220B","Dell","240",dimensions);
	
	Monitor theMonitor = new Monitor("27Inch","Acer",27, new Resoultion(234,879));
	
	Motherboard motherBoard=new Motherboard("asdc","Asus",4,6,"v2.44");
	
	PC thePC = new PC(theCase, theMonitor,motherBoard );
//	thePC.getMotherboard().loadprogram("Windows");
//	thePC.getMonitor().drawPixelAt(678, 890, "red");
//	thePC.getThecase().pressPowerButton();
	thePC.powerUp();
	
}
}
//	Using inheritence we can take from only one class using extend
// using composition , a class with one or more objects of other classes in instance variable
// PC contains monitor , case,motherboard but monitor is not PC