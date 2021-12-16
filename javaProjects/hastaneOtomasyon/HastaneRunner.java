package javaProjects.hastaneOtomasyon;

import java.util.ArrayList;
import java.util.List;

public class HastaneRunner {
	static List doktorList=new ArrayList<>();
	public static void main(String[] args) {
	
		String hastaDurumu;
		String unvan;
		
	//	unvan=doktorUnvan();

	}

	public static String doktorUnvan (String aktuelDurum) {
		
		if (aktuelDurum.equalsIgnoreCase("Allerji")) {
			return "Allergist";
		}
		if (aktuelDurum.equalsIgnoreCase("Bas Agrisi")) {
			return "Norolog";
		}
		if (aktuelDurum.equalsIgnoreCase("Diabet")) {
			return "Genel Cerrah";
		}if (aktuelDurum.equalsIgnoreCase("Sogukalginligi")) {
			return "Cocukdoktoru";
		}
		if (aktuelDurum.equalsIgnoreCase("Migren")) {
			return "Dahiliye";
		}
		if (aktuelDurum.equalsIgnoreCase("Kalphastaliklari")) {
			return "Kardiolog";
		} else return "Yanlýs Unvan";
	}

	public static Doktor doktorBul(String Unvan) {
		Doktor doktor=new Doktor();
		
	//	for (Doktor d : doktorList) {
			
	//	}
		
		return doktor;
	}

}
