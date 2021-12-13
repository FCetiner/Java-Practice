package _14_Encapsulation.Q01;

public class Araba {
private String model;
private String renk;
private int motor;
private int y�l;


public Araba () {//parametresiz constractor
	
}


public Araba(String model, String renk, int motor, int y�l) {
	super();
	this.model = model;
	this.renk = renk;
	//this.motor = motor;
	// this.y�l = y�l;
	setY�l(y�l);
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
		System.out.println("Agam tekerine ta� de�mesin");
	} else {
		System.out.println("100 �n alt�nda beygir g�c� olmaz");
	}
	
}


public int getY�l() {
	return y�l;
}


public void setY�l(int y�l) {
	if (y�l<=0) {
		System.out.println("negatif y�l giremezsiniz");
		this.y�l = -y�l;
	}else this.y�l = y�l;
	
}


}
