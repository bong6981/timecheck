
import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

public class MyToday {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String today = sc.next();
		File todayFile = new File("C:\\Users\\82104\\Documents\\timesheet\\" + today +".txt");
		FileWriter writer = null;
		if(todayFile.isFile()) {
			System.out.println("The File exist already");
			writer = new FileWriter(todayFile, true);
			
		}else {
			System.out.println("Create the new file");
			
		}
		sc.close();	
		
	}

}
