package interfac;

public class DeskPhone implements ITelephone {
 private int myNumber;
 private boolean isRinging;
 //need to implement all the methods in interface
 public DeskPhone(int myNumber) {
		super();
		this.myNumber = myNumber;
	}
@Override
public void PowerOn() {
	System.out.println("No action as no power button");
	
}
@Override
public void dial(int phoneNumber) {
	System.out.println("Now rininging"+phoneNumber);
}
@Override
public void answer() {
 if(isRinging) {
	 System.out.println("Answer the phone");
	 isRinging=false;
 }
	
}
@Override
public boolean callPhone(int phoneNumber) {
	if(phoneNumber== myNumber) {
		isRinging=true;
		System.out.println("Ring Ring");
	}
	else {
		isRinging=false;
	}
	return isRinging;
}
@Override
public boolean isRinging() {
	
	return isRinging;
}	
 
}
