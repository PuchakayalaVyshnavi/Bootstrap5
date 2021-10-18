package interfac;

public class Main {
public  static void main(String[] args) {
	//ITelephone tims =new DeskPhone(12345); 
	ITelephone tims ;
	tims =new DeskPhone(12345); 
	//we have defined an interface but the actual class implementation in this case desk.
	//interface is at abstract level ,what methods are valid and have to be actually overridden in an actual class
	//so u cannot use IItelephone to instantiate it
//you have to use actual class to override that functionality
// we can use DeskPhone tims =new DeskPhone(12345); == if we use this then we cannot pass tims=new MobilePhone(123)
	tims.PowerOn();
	tims.answer();
	tims.callPhone(123456);
	tims.dial(123456);
	

    tims = new MobilePhone(24565);
    tims.PowerOn();
    tims.callPhone(24565);
    tims.answer();
}

}
