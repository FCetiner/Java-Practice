package _14_Encapsulation.Q01;

public class ArabaMain {

	public static void main(String[] args) {


		Araba honda = new Araba();	//parametresiz contractorda honda objesi create edildi

		honda.setMotor(1300);
		honda.setModel("civic");
		honda.setY�l(2021);
		honda.getModel();System.out.println(honda.getY�l());
		Araba volvo = new Araba ("xc90","beyaz",20,2020);
		Araba vw = new Araba ("passat","k�rm�z�",1600,-2010);
		
		System.out.println("sectiginiz arac volvo " + " y�l� "+volvo.getY�l()+" rengi " + volvo.getRenk()+" motoru " +volvo.getMotor());
		System.out.println("sectiginiz arac vw " +" y�l� "+ vw.getY�l()+" rengi " +vw.getRenk()+" motoru " +vw.getMotor());
		
		
		
	}

}
