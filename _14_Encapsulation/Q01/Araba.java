package _14_Encapsulation.Q01;

public class Araba {
private String model;
private String renk;
private int motor;
private int yýl;


public Araba () {//parametresiz constractor
	
}


public Araba(String model, String renk, int motor, int yýl) {
	super();
	this.model = model;
	this.renk = renk;
	//this.motor = motor;
	// this.yýl = yýl;
	setYýl(yýl);
	setMotor(motor);
}


public String getModel() {
	return model;
}


public void setModel(String model) {
	this.model = model;
}


public String getRenk() {
	return renk;
}


public void setRenk(String renk) {
	this.renk = renk;
}


public int getMotor() {
	return motor;
}


public void setMotor(int motor) {
	if (motor>=100) {
		this.motor=motor;
		System.out.println("Agam tekerine taþ deðmesin");
	} else {
		System.out.println("100 ün altýnda beygir gücü olmaz");
	}
	
}


public int getYýl() {
	return yýl;
}


public void setYýl(int yýl) {
	if (yýl<=0) {
		System.out.println("negatif yýl giremezsiniz");
		this.yýl = -yýl;
	}else this.yýl = yýl;
	
}


}
