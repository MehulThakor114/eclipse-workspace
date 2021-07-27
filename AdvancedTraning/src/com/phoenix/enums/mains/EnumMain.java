package com.phoenix.enums.mains;

import com.phoenix.enums.WeekDay;
import com.phoenix.enums.Enum;

public class EnumMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        System.out.println(Enum.BLACK);
        System.out.println("Ordinal: "+ Enum.BLACK.ordinal());
        
        WeekDay today= WeekDay.TUESDAY;
        System.out.println("today: "+today);
        WeekDay WhichDay = WeekDay.SUNDAY;
        switch(WhichDay) {
           case MONDAY:
        	   System.out.println("meeting");
        	   break;
           case TUESDAY:
        	   System.out.println("knowledge session");
        	   break;
           case WEDNESDAY:
        	   System.out.println("wed");
        	   break;
           case THURSDAY:
        	   System.out.println("thu");
        	   break;
           case SUNDAY:
        	   System.out.println("holiday");
        	   break;
           default:
        	   break;
        	   
        }
        WeekDay c = WeekDay.THURSDAY; 
		 // System.out.println(c);
		 // System.out.println("Ordinal: " +c.ordinal()); 
			
			  for (WeekDay days:WeekDay.values()) 
				  System.out.println(days + " Ordinal:" +days.ordinal());
			 
		  System.out.println("Day No: " + c.getDayNo()); 
		  System.out.println("Short Name: " +c.getShortName()); 
	 
   
	//Switch Case
	
	  WeekDay Day=WeekDay.TUESDAY; 
	  switch(Day) {
      case MONDAY:
   	   System.out.println("meeting");
   	   break;
      case TUESDAY:
   	   System.out.println("knowledge session");
   	   break;
      case WEDNESDAY:
   	   System.out.println(Enum.BLACK);
   	   break;
      case THURSDAY:
   	   System.out.println("thu");
   	   break;
      case SUNDAY:
   	   System.out.println("holiday");
   	   break;
      default:
   	   break;
   	   
   }
	 
}

}
