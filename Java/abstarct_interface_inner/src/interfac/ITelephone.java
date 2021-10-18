package interfac;

public interface ITelephone {
//interface exists to define methods to implemented
	// we actually don't need access modifier
	void PowerOn();
	void dial(int phoneNumber);
	void answer();
	boolean callPhone(int phoneNumber);
	boolean isRinging();

	
	
}
