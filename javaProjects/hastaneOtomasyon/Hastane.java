package javaProjects.hastaneOtomasyon;

public class Hastane extends VeriBankas�{

	Doktor doktor=new Doktor();
	Hasta hasta=new Hasta();
	
	
	public Doktor getDoktor() {
		return doktor;
	}
	public void setDoktor(Doktor doktor) {
		this.doktor = doktor;
	}
	public Hasta getHasta() {
		return hasta;
	}
	public void setHasta(Hasta hasta) {
		this.hasta = hasta;
	}
	
}
