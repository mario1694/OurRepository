import java.io.Serializable;

public class User implements Serializable{
	
	private String name;
	private int age;
	private String mail;
	private String userName;
	private String pass;
	
	public User(String name, int age, String mail, String userName, String pass) {
		this.name = name;
		this.age = age;
		this.mail = mail;
		this.userName = userName;
		this.pass = pass;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public String getMail() {
		return mail;
	}

	public String getUserName() {
		return userName;
	}

	public String getPass() {
		return pass;
	}

	
	
}
