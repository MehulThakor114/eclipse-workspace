package com.phoenix.comparator;

import java.util.Comparator;

import com.phoenix.models.Product;

public class ProductBrandComparator implements Comparator<Product> {

	@Override
	public int compare(Product o1, Product o2) {
		String product1Brand = o1.getBrand();
		String peoduct2Brand = o2.getBrand();
		return product1Brand.compareTo(peoduct2Brand);
	}

}
