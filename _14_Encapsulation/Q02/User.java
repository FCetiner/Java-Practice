package _14_Encapsulation.Q02;


public class User {

	private String username;
	private String password;
	private int id=100;
	private boolean active=false;
	private boolean signedIn=false;
	
	User(){
		
	}
	
	public User(int id,String username,String password,	boolean active, boolean signedIn){
		this.id=id;
		this.username=username;
		this.password=password;
		this.active=active;
		this.signedIn=signedIn;
		
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username=username;
	}
	public User(String username, String password) {
		super();
		this.username = username;
		this.password = password;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		if(password.length()<6) {
			System.out.println("Þireniz en az 6 karakter içermelidir.");
			System.out.println("==============HATA=================");
			System.out.println("Bilgilerinizi tekrar doldurunuz.");
			UserMain.kullaniciEkle();
		}else {
			this.password = password;
	}
	}

	public int getId() {
		id+=id;
		return id;
	}

	public void setId(int id) {
		this.id += id;
	}

	public boolean isActive() {
		return active;
	}

	public void setActive(boolean active) {
		this.active = active;
	}

	public boolean isSignedIn() {
		return signedIn;
	}

	public void setSignedIn(boolean signedIn) {
		this.signedIn = signedIn;
	}
}
