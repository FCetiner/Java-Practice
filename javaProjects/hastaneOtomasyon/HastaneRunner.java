package javaProjects.hastaneOtomasyon;

public class HastaneRunner extends Hastane {
	private static Hastane hastane = new Hastane();

	public static void main(String[] args) {

		String hastaDurumu = "Migren";
		String unvan =doktorUnvan(hastaDurumu);


		hastane.setDoktor(doktorBul(unvan));
		hastane.setHasta(hastaBul(hastaDurumu));
		System.out.println("Doktor Ýsmi: "+hastane.getDoktor().getIsim());
		System.out.println("Doktor Soyisim: "+hastane.getDoktor().getSoyisim());
		System.out.println("Doktor Unvaný: "+hastane.getDoktor().getUnvan());
		System.out.println("Hasta Adý: "+hastane.getHasta().getIsim());
		System.out.println("Hasta Soyadý: "+hastane.getHasta().getSoyisim());
		System.out.println("Hasta Durumu: "+hastaDurumu);

	}

	public static String doktorUnvan(String aktuelDurum) {

		if (aktuelDurum.equalsIgnoreCase("Allerji")) {
			return "Allergist";
		}
		if (aktuelDurum.equalsIgnoreCase("Bas Agrisi")) {
			return "Norolog";
		}
		if (aktuelDurum.equalsIgnoreCase("Diabet")) {
			return "Genel Cerrah";
		}
		if (aktuelDurum.equalsIgnoreCase("Sogukalginligi")) {
			return "Cocukdoktoru";
		}
		if (aktuelDurum.equalsIgnoreCase("Migren")) {
			return "Dahiliye";
		}
		if (aktuelDurum.equalsIgnoreCase("Kalphastaliklari")) {
			return "Kardiolog";
		} else
			return "Yanlýs Unvan";
	}

	public static Doktor doktorBul(String unvan) {
		Doktor doktor = new Doktor();
		for (int i = 0; i < hastane.unvanlar.length; i++) {
			if (unvan.equals(hastane.unvanlar[i])) {
				doktor.setIsim(hastane.doktorIsimleri[i]);
				doktor.setSoyisim(hastane.doktorSoyisimleri[i]);
				doktor.setUnvan(unvan);
			}
		}

		return doktor;
	}

	public static Durum hastaDurumuBul(String aktuelDurum) {
		Durum hastaDurumu = new Durum();

		switch (aktuelDurum) {
		case "Allerji":
			hastaDurumu.setAciliyet(false);
			break;
		case "Bas agrisi":
			hastaDurumu.setAciliyet(false);
			break;
		case "Diabet":
			hastaDurumu.setAciliyet(false);
			break;
		case "Sogukalginligi":
			hastaDurumu.setAciliyet(false);
			break;
		case "Migren":
			hastaDurumu.setAciliyet(true);
			break;
		case "Kalp Hastalýklari":
			hastaDurumu.setAciliyet(true);
			break;

		default:
			System.out.println("Tanýmlý bir hastalýk girmediniz");
			break;
		}

		return hastaDurumu;

	}
	
	public static Hasta hastaBul(String aktuelDurum) {
		Hasta hasta = new Hasta();
		for (int i = 0; i < hastane.durumlar.length; i++) {
			if (aktuelDurum.equals(hastane.durumlar[i])) {
				hasta.setIsim(hastane.hastaIsimleri[i]);
				hasta.setSoyisim(hastane.hastaSoyIsimleri[i]);
				hasta.setHastaId(hastane.hastaIDleri[i]);
				hastaDurumuBul(aktuelDurum);
				hasta.setHastaDurumu(null);
						
			}
		}
		
		
		
		return hasta;
		
		
	}

}
