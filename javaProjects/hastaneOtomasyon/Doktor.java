package javaProjects.hastaneOtomasyon;

public class Doktor {
private String isim;
private String soyisim;
private String unvan;

public Doktor() {
	
}

public Doktor(String isim, String soyisim, String unvan) {
	super();
	this.isim = isim;
	this.soyisim = soyisim;
	this.unvan = unvan;
}
public String getIsim() {
	return isim;
}
public void setIsim(String isim) {
	this.isim = isim;
}
public String getSoyisim() {
	return soyisim;
}
public void setSoyisim(String soyisim) {
	this.soyisim = soyisim;
}
public String getUnvan() {
	return unvan;
}
public void setUnvan(String unvan) {
	this.unvan = unvan;
}
}
