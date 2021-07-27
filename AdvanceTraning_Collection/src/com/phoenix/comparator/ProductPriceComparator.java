package com.phoenix.comparator;

import java.util.Comparator;

import com.phoenix.models.Product;

public class ProductPriceComparator implements Comparator<Product> {

	@Override
	public int compare(Product o1, Product o2) {
		if(o1.getPrice()<o2.getPrice())
			return 1;
		else if(o1.getPrice()>o2.getPrice())
			return -1;
		else
			return 0;
	}

}
