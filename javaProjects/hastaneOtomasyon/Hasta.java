package javaProjects.hastaneOtomasyon;

public class Hasta {

	private String isim;
	private String soyisim;
	private int hastaId;
	private Durum hastaDurumu;
	
	
	public Hasta() {
		
	}
	
	public Hasta(String isim, String soyisim, int hastaId, Durum hastaDurumu) {
		super();
		this.isim = isim;
		this.soyisim = soyisim;
		this.hastaId = hastaId;
		this.hastaDurumu = hastaDurumu;
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
	public int getHastaId() {
		return hastaId;
	}
	public void setHastaId(int hastaId) {
		this.hastaId = hastaId;
	}
	public Durum getHastaDurumu() {
		return hastaDurumu;
	}
	public void setHastaDurumu(Durum hastaDurumu) {
		this.hastaDurumu = hastaDurumu;
	}
}
