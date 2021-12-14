package javaProjects.kitapYonetimi;

public class Kitap {
int no;
private	String kitapAd�;
private	String yazarAd�;
private	int yay�nY�l�;
private	double fiyat;

//Setlere mesela yazar ad� b�y�k olsun arada bo�l�k olmas�n fiyat eksi olamaz gibi duzenlemeler
//yay�n y�l� 1950 ve sonras� olsun setterlar iflerle forlarla geli�tirilebilir

public Kitap () {
	
}


public Kitap(int no, String kitapAd�, String yazarAd�, int yay�nY�l�, double fiyat) {
	super();
	this.no = no;
	this.kitapAd� = kitapAd�;
	this.yazarAd� = yazarAd�;
	this.yay�nY�l� = yay�nY�l�;
	this.fiyat = fiyat;
}
public int getNo() {
	return no;
}
public void setNo(int no) {
	this.no = no;
}
public String getKitapAd�() {
	return kitapAd�;
}
public void setKitapAd�(String kitapAd�) {
	this.kitapAd� = kitapAd�;
}
public String getYazarAd�() {
	return yazarAd�;
}
public void setYazarAd�(String yazarAd�) {
	this.yazarAd� = yazarAd�;
}
public int getYay�nY�l�() {
	return yay�nY�l�;
}
public void setYay�nY�l�(int yay�nY�l�) {
	this.yay�nY�l� = yay�nY�l�;
}
public double getFiyat() {
	return fiyat;
}
public void setFiyat(double fiyat) {
	this.fiyat = fiyat;
}


@Override
public String toString() {//Bu metot objenin fieldslerini yazd�r�r
	return "Kitap [no=" + no + ", kitapAd�=" + kitapAd� + ", yazarAd�=" + yazarAd� + ", yay�nY�l�=" + yay�nY�l�
			+ ", fiyat=" + fiyat + "]";
}

}
