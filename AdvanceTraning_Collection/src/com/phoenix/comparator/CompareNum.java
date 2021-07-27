package com.phoenix.comparator;

import java.util.Comparator;
/*
*  Author:mehul.thakor@stltech.in
*  Creation Date: 14-Jul-2021
*  Version:1.0
*  Copyright: Sterlite Technologies Ltd.
*/
public class CompareNum implements Comparator<Integer> {

	public int compare(Integer o1,Integer o2) {
		if(o1<o2)
			return 1;
		else if(o1>o2)
			return -1;
		else
			return 0;
	}
}
