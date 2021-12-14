package javaProjects.kitapYonetimi;

public class Kitap {
int no;
private	String kitapAdý;
private	String yazarAdý;
private	int yayýnYýlý;
private	double fiyat;

//Setlere mesela yazar adý büyük olsun arada boþlýk olmasýn fiyat eksi olamaz gibi duzenlemeler
//yayýn yýlý 1950 ve sonrasý olsun setterlar iflerle forlarla geliþtirilebilir

public Kitap () {
	
}


public Kitap(int no, String kitapAdý, String yazarAdý, int yayýnYýlý, double fiyat) {
	super();
	this.no = no;
	this.kitapAdý = kitapAdý;
	this.yazarAdý = yazarAdý;
	this.yayýnYýlý = yayýnYýlý;
	this.fiyat = fiyat;
}
public int getNo() {
	return no;
}
public void setNo(int no) {
	this.no = no;
}
public String getKitapAdý() {
	return kitapAdý;
}
public void setKitapAdý(String kitapAdý) {
	this.kitapAdý = kitapAdý;
}
public String getYazarAdý() {
	return yazarAdý;
}
public void setYazarAdý(String yazarAdý) {
	this.yazarAdý = yazarAdý;
}
public int getYayýnYýlý() {
	return yayýnYýlý;
}
public void setYayýnYýlý(int yayýnYýlý) {
	this.yayýnYýlý = yayýnYýlý;
}
public double getFiyat() {
	return fiyat;
}
public void setFiyat(double fiyat) {
	this.fiyat = fiyat;
}


@Override
public String toString() {//Bu metot objenin fieldslerini yazdýrýr
	return "Kitap [no=" + no + ", kitapAdý=" + kitapAdý + ", yazarAdý=" + yazarAdý + ", yayýnYýlý=" + yayýnYýlý
			+ ", fiyat=" + fiyat + "]";
}

}
