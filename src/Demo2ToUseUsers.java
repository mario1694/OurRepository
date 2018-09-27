import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Demo2ToUseUsers {
	public static void main(String[] args) {
		
		User pesho = new User("Pesho", 23, "pesho123@abv.bg", "pesho_Peshkata", "pesho123456789");
		File mavzolei = new File("Mavzolei.txt");
		try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(mavzolei))) {
			oos.writeObject(pesho);
		} catch (Exception e) {
			System.out.println("Oops");
		}
		
		
		
	}

}
