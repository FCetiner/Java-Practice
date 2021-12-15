package javaProjects.OgrenciIsleri;

public class Ogrenci {

	private int no;
	private String ad;
	private String soyad;
	private double ortalama;
	
	public Ogrenci() {
		
	}
	
	public Ogrenci(int no, String ad, String soyad, double ortalama) {
		super();
		this.no = no;
		this.ad = ad;
		this.soyad = soyad;
		this.ortalama = ortalama;
	}


	public int getNo() {
		return no;
	}


	public void setNo(int no) {
		this.no = no;
	}


	public String getAd() {
		return ad;
	}


	public void setAd(String ad) {
		this.ad = ad;
	}


	public String getSoyad() {
		return soyad;
	}


	public void setSoyad(String soyad) {
		this.soyad = soyad;
	}


	public double getOrtalama() {
		return ortalama;
	}


	public void setOrtalama(double ortalama) {
		this.ortalama = ortalama;
	}


	@Override
	public String toString() {
		return "Ogrenci [numara=" + no + ", ad=" + ad + ", soyad=" + soyad + ", ortalama=" + ortalama + "]";
	}
	
	
	
	
	
	
	
}
