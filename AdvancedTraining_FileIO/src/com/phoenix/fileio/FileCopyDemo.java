package com.phoenix.fileio;

import java.io.*;


public class FileCopyDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//try with resources
		try(FileInputStream fis = new FileInputStream("hello.txt");
			FileOutputStream fos = new FileOutputStream("data.txt", true))
		{
			//file copying logic
			int data = 0;
			while((data=fis.read())!=-1) {
				fos.write(data);;
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
