package composition;

public class PC {
private Case thecase;
private Monitor monitor;
private Motherboard motherboard;
public PC(Case thecase, Monitor monitor, Motherboard motherboard) {
	super();
	this.thecase = thecase;
	this.monitor = monitor;
	this.motherboard = motherboard;
}
public void powerUp() {
	thecase.pressPowerButton();
	drawLogo();
}
private void drawLogo() {
	monitor.drawPixelAt(12, 90, "red");
}

//public Case getThecase() {
//	return thecase;
//}
//public Monitor getMonitor() {
//	return monitor;
//}
//public Motherboard getMotherboard() {
//	return motherboard;
//}

}
