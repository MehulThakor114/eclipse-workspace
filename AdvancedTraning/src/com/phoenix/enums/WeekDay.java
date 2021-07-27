package com.phoenix.enums;

public enum WeekDay {
	MONDAY(20,"mon"),TUESDAY, WEDNESDAY(34),THURSDAY(300,"thur"),FRIDAY(-23),SATURDAY,SUNDAY;

	private int dayNo;
	private String shortName;
	
	WeekDay(){
		dayNo= -1;
		System.out.println("No-arg Constructor of enum Weekday");
	}
	WeekDay(int dayNo){
		this.dayNo= dayNo;
		System.out.println("Single parameterized Constructor of enum Weekday");
	}
	
	WeekDay(int dayNo,String shortName){
		this.shortName=shortName;
		this.dayNo= dayNo;
		System.out.println("Two parameterized Constructor of enum Weekday");
	}
	public int getDayNo(){
	   return dayNo;	
	}
	public String getShortName(){
		return shortName;
	}
}

