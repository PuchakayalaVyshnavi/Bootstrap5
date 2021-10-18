package encapsulation;

public class EnhancedPlayer {
 private String name;
 private int hitpoints =100;
 private String weapon;//Making fields private and making sure fields are not accessible out of the class
public EnhancedPlayer(String name, int health, String weapon) {
	super();
	this.name = name;
	if(health>0 && health<=100) {
	this.hitpoints = health;
	}
	this.weapon = weapon;
}
 public void loseHealth(int damage) {
	 this.hitpoints= this.hitpoints- damage;
	 if(this.hitpoints<0) {
	 System.out.println("player knocked out");
	 }
 }
public int getHealth() {
	return hitpoints;
}
//when we change field health to hitpoints , we can run the code in Main as it is without any change
//we can change names at anytime without change in code
// we prevent unauthorised set up to access
}
