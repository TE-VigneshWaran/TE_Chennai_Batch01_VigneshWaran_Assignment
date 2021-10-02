package assignment.practice.program;

import java.io.File;
import java.io.IOException;
import java.io.FileWriter;
import java.io.FileReader;
import java.util.Scanner;
import java.util.concurrent.locks.ReentrantReadWriteLock.WriteLock;

public class FileCreation {

	public static void main(String[] args) {
		// Folder Creation
		File ref=new File("E:\\Happy");
		ref.mkdir();
		
		
		try {
			File ref1=new File("E:\\Happy\\world.txt");
			ref1.createNewFile();
			FileWriter writes =new FileWriter(ref1);
	        writes.write("Hai, Hello....");
			writes.flush();
			
			 Scanner read=new Scanner(ref1);
			 
			 while(read.hasNext()) {
				 System.out.println(read.nextLine());
			 }
			 
			 read.close();
		} catch (IOException e) {
			
			e.printStackTrace();
		}
	}

}
