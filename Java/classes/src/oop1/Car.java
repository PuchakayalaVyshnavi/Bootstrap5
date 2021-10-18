package oop1;

public class Car {
private String model;
private int color;

public void setModel(String model) {//setting the model value of field from the Main method
	String validModel= model.toLowerCase();//setters can be used for validation also
	if(validModel.equals("ford")||validModel.equals("alto")) {
	this.model = model;
	}
	else {
		this.model="Unknown";
	}
}
public String getModel() {// getting the value of the model
	return this.model;
}

}
