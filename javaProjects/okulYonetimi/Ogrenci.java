package javaProjects.okulYonetimi;

public class Ogrenci extends Kisi{

private	String numara;
private	String s�n�f;


public Ogrenci () {
	
}


public Ogrenci(String adSoyad, String kimlikNo, int yas, String numara, String s�n�f) {
	super(adSoyad, kimlikNo, yas);
	this.numara = numara;
	this.s�n�f = s�n�f;
}
public String getNumara() {
	return numara;
}
public void setNumara(String numara) {
	this.numara = numara;
}
public String getS�n�f() {
	return s�n�f;
}
public void setS�n�f(String s�n�f) {
	this.s�n�f = s�n�f;
}


@Override
public String toString() {
	return "Ogrenci [numara=" + numara + ", s�n�f=" + s�n�f + "]";
}
	
	
	
	
}
