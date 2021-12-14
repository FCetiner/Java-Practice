package javaProjects.okulYonetimi;

public class Kisi {
private String adSoyad;
private String kimlikNo;
private int yas;


public Kisi () {
	
}



public Kisi(String adSoyad, String kimlikNo, int yas) {
	super();
	this.adSoyad = adSoyad;
	this.kimlikNo = kimlikNo;
	this.yas = yas;
}
public String getAdSoyad() {
	return adSoyad;
}
public void setAdSoyad(String adSoyad) {
	this.adSoyad = adSoyad;
}
public String getKimlikNo() {
	return kimlikNo;
}
public void setKimlikNo(String kimlikNo) {
	this.kimlikNo = kimlikNo;
}
public int getYas() {
	return yas;
}
public void setYas(int yas) {
	this.yas = yas;
}



@Override
public String toString() {
	return "Kisi [adSoyad=" + adSoyad + ", kimlikNo=" + kimlikNo + ", yas=" + yas + "]";
}
}
