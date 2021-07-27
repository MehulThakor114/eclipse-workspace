package com.phoenix.fileio;

import java.io.File;
import java.io.IOException;

public class FileUtility {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			File file = new File("hello.txt");
			System.out.println("file created: "+file.createNewFile());
			
			File dir = new File("MyDir");
			System.out.println("directory created: "+dir.mkdir());
			
			File f1 = new File(dir, "hello.txt");
			System.out.println("file created: "+f1.createNewFile());
			
			File f2 = new File(dir, "Welcome.txt");
			System.out.println("Renaming file "+ f1.getName()+ " to "+f2.getName()+ ": "+f1.renameTo(f2));
			
			File f3 = new File("Welcome.txt");
			System.out.println("File Deleted: "+f3.delete());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
