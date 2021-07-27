package com.phoenix.fileio;

import java.io.*;
public class LineReadDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try(
				BufferedReader br = new BufferedReader(new FileReader("hello.txt"));
				//BufferedWriter bw = new BufferedWriter(new FileWriter("data2.txt"));
				//PrintWriter out = new PrintWriter(bw);
				PrintWriter out = new PrintWriter("data2.txt");)
		{
			String line= null;
			while((line=br.readLine())!=null) {
				//bw.write(line);
				//bw.newLine();
				out.println(line);
			}
				System.out.println("data is copied line by line");
		} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
		} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
		}
    }
}

