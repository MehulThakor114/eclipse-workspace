package com.phoenix.datetimes;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Set;

public class LocalDateTimeDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LocalDate date = LocalDate.now();
		System.out.println(date);
		
		LocalDate anyDate = LocalDate.of(1985, 5, 16);
		System.out.println(anyDate);
		
		LocalTime lt = LocalTime.now();
		System.out.println(lt);
		
		LocalTime anyTime = LocalTime.of(5, 23, 56);
		System.out.println(anyTime);
		
		LocalDateTime ldt = LocalDateTime.now();
		System.out.println(ldt);
		
		LocalDateTime anyldt = LocalDateTime.of(anyDate, anyTime);
		System.out.println(anyldt);
		
		ZonedDateTime zdt = ZonedDateTime.now();
		System.out.println(zdt);
		
		ZoneId defaultZone = ZoneId.systemDefault();
		System.out.println(defaultZone);
		
		Set<String> Zones = ZoneId.getAvailableZoneIds();
		//Zones.stream().sorted().forEach(System.out::println);
		Zones.stream().sorted().filter(z->z.startsWith("I")|| z.startsWith("A")).forEach(System.out::println);
		
		ZoneId zn = ZoneId.of("US/Hawaii");
		ZonedDateTime zdt1 = ZonedDateTime.of(anyldt,zn);
		System.out.println(zdt1);
		
	}

}
