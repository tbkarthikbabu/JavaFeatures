package dev.eight.feature;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

/**
 * 
 * LocalDate is final and immuable class and makes it thread-safe
 * 
 * @author karth
 *
 */
public class DateAndTimeTest {

	public static void main(String[] args) {

		LocalDate ld = LocalDate.now();
		System.out.println(ld);

		LocalTime lt = LocalTime.now();
		System.out.println(lt);

		LocalDateTime currDT = LocalDateTime.now();
		System.out.println(currDT);

		DateTimeFormatter dtFormat = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
		String specD = currDT.format(dtFormat);

		System.out.println(specD);

		LocalDate ld2 = LocalDate.of(1950, 01, 26);
		System.out.println(ld2);
	}

}
