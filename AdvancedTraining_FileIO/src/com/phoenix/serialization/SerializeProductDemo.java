package com.phoenix.serialization;

import java.io.*;

import com.phoenix.models.Product;

public class SerializeProductDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try(ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("productData.txt"));
		   ){
			Product product= new Product(5602,"LED TV","sony",52000.00f);
			out.writeObject(product);
			System.out.println("product object is serialized!");
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
