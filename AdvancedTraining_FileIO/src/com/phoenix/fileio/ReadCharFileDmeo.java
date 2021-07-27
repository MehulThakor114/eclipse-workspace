package com.phoenix.fileio;

import java.io.*;

public class ReadCharFileDmeo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        try(FileReader fr = new FileReader(new File("hello.txt"));)
        {
        	int data = 0;
			while((data=fr.read())!=-1) {
				System.out.print((char)data);
			}
        } catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
