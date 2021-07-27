package com.phoenix.fileio;

import java.io.*;

public class FileCopyCharDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try(FileReader fr = new FileReader("hello.txt");
			FileWriter fw = new FileWriter("data1.txt");
			)
		{
				//file copying logic
				int data = 0;
				while((data=fr.read())!=-1) {
					fw.write(data);;
				}
				System.out.println("data is copied successfully");
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	}

}
