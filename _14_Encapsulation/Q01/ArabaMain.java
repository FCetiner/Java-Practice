package _14_Encapsulation.Q01;

public class ArabaMain {

	public static void main(String[] args) {


		Araba honda = new Araba();	//parametresiz contractorda honda objesi create edildi

		honda.setMotor(1300);
		honda.setModel("civic");
		honda.setYýl(2021);
		honda.getModel();System.out.println(honda.getYýl());
		Araba volvo = new Araba ("xc90","beyaz",20,2020);
		Araba vw = new Araba ("passat","kýrmýzý",1600,-2010);
		
		System.out.println("sectiginiz arac volvo " + " yýlý "+volvo.getYýl()+" rengi " + volvo.getRenk()+" motoru " +volvo.getMotor());
		System.out.println("sectiginiz arac vw " +" yýlý "+ vw.getYýl()+" rengi " +vw.getRenk()+" motoru " +vw.getMotor());
		
		
		
	}

}
