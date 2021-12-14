package javaProjects.okulYonetimi;

public class Ogrenci extends Kisi{

private	String numara;
private	String sýnýf;


public Ogrenci () {
	
}


public Ogrenci(String adSoyad, String kimlikNo, int yas, String numara, String sýnýf) {
	super(adSoyad, kimlikNo, yas);
	this.numara = numara;
	this.sýnýf = sýnýf;
}
public String getNumara() {
	return numara;
}
public void setNumara(String numara) {
	this.numara = numara;
}
public String getSýnýf() {
	return sýnýf;
}
public void setSýnýf(String sýnýf) {
	this.sýnýf = sýnýf;
}


@Override
public String toString() {
	return "Ogrenci [numara=" + numara + ", sýnýf=" + sýnýf + "]";
}
	
	
	
	
}
