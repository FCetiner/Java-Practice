package javaProjects.hastaneOtomasyon;

public class Durum {
private String aktuelDurum;
private boolean aciliyet;


public Durum () {
	
}
public Durum(String aktuelDurum, boolean aciliyet) {
	super();
	this.aktuelDurum = aktuelDurum;
	this.aciliyet = aciliyet;
}
public String getAktuelDurum() {
	return aktuelDurum;
}
public void setAktuelDurum(String aktuelDurum) {
	this.aktuelDurum = aktuelDurum;
}
public boolean isAciliyet() {
	return aciliyet;
}
public void setAciliyet(boolean aciliyet) {
	this.aciliyet = aciliyet;
}
}
