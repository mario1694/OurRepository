import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class VoinaIMir {
	public static void main(String[] args) throws IOException {
		File abc = new File("abc");
		abc.createNewFile();
		FileWriter writer = new FileWriter(abc);
		Scanner sc = new Scanner(abc);
		int commas = 0;
		while(sc.hasNextLine()) {
			String row = sc.nextLine();
			for(int i = 0; i < row.length(); i++) {
				if(row.charAt(i) == ',') {
					commas++;
				}
			}
		}
		System.out.println("The commas in War and Peace is " + commas);
	}

}
