import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Curkva {
	
	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
		
		System.out.println("Kavi za pesho!");
		
		File mavzolei = new File("Mavzolei.txt");
		//mavzolei.createNewFile();
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream(mavzolei));
		Object peshoTheWhite = ois.readObject();
		User pesho = (User) peshoTheWhite;
		System.out.println("I'm " + pesho.getName());
		System.out.println("I'm " + pesho.getAge());
		System.out.println("I'm " + pesho.getMail());
	}

}
