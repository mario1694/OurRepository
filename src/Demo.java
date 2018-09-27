import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Scanner;

public class Demo {
	public static void main(String[] args) throws IOException {
		File arebe = new File("arebe.txt");
		arebe.createNewFile();
//		FileWriter pisach = new FileWriter(arebe);
//		pisach.write("ebasi qkoto, moga da pisha vuv fail!");
//		pisach.flush();
//		pisach.write("\n");
//		pisach.write("pfff");
//		pisach.write("\n");
//		pisach.write("egati");
//		pisach.flush();
		
		Scanner sc = new Scanner(arebe);
//		System.out.println(sc.nextLine());
//		System.out.println(sc.nextLine());
//		System.out.println(sc.nextLine());
		
		while(sc.hasNextLine()) {
			System.out.println(sc.nextLine());
			
		}
		
		PrintStream ps = new PrintStream(arebe);
		ps.println("dali stava a?");
		ps.println("epa stavalo...");
		ps.println("Ti da vidish!");
		
		
		while(sc.hasNextLine()) {
			System.out.println(sc.nextLine());
			
		}
		
		
	}

}
