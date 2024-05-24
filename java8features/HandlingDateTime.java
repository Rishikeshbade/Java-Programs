package java8features;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class HandlingDateTime {

	public static void main(String[] args) {
		LocalDate currentDate = LocalDate.now();
		System.out.println("Current Date : "+currentDate);
		
		LocalTime currentTime = LocalTime.now();
		System.out.println("Current Time : "+currentTime);
		
		LocalDateTime current = LocalDateTime.now();
		System.out.println("Current Date and Time : "+current);
		
		LocalDate ownDate = LocalDate.parse("2011-12-25");
		System.out.println("Setting Date using String : "+ownDate);
		
		LocalDate ownDate2 = LocalDate.of(2015, Month.FEBRUARY, 15);
		System.out.println("Setting Date using int : "+ownDate2);
		
		//Retrieving yesterday's and tomorrow's date
		LocalDate yesterday = currentDate.minusDays(1);
		System.out.println("Yesterday's Date : "+yesterday);
		LocalDate tomorrow = currentDate.plusDays(1);
		System.out.println("Tomorrow's Date : "+tomorrow);
		
		System.out.println("is Leap year? : "+currentDate.isLeapYear());
		
		//Changing date/time format
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy"+"HH:mm:ss");
		String formattedDate = current.format(formatter);
		System.out.println("Setting Date-Time Pattern : "+formattedDate);
		
		//handling zones
		ZonedDateTime currentZone = ZonedDateTime.now();
		System.out.println("Current Date/Time with zone : "+currentZone);
		
		System.out.println("Current Zone : "+currentZone.getZone());
		
		//setting Tokyo Zone
		ZoneId tokyo = ZoneId.of("Asia/Tokyo");
		
		ZonedDateTime tokyozone = currentZone.withZoneSameInstant(tokyo);
		System.out.println("Tokyo Zone Date Time : "+tokyozone);
		

	}

}
