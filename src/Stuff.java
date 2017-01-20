/*
 * @author shinabarger
 * 
 */

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

/*GOAL: Calculate the duration between 2 dates in years, months, and days. 
 * Ask user for input for two dates
 * Have program show the result of the difference in time (days? months? years) between dates
 * Push & share to new GitHub repository
 */

class DateCalculator {
	public static void main(String args[]) {
		// Get date one, assign to date1
		System.out.print("Please enter a starting date in format Month day, year : ");
		Scanner in = new Scanner(System.in);
		String dateOne = in.nextLine();
		
		//format & parse 1st date submitted
		DateTimeFormatter formatter1 = DateTimeFormatter.ofPattern("MMMM d, yyyy", Locale.ENGLISH);
		LocalDate date1 = LocalDate.parse(dateOne, formatter1);
		System.out.println("Your starting date is: " + dateOne);

		// Get date two, assign to date2
		System.out.print("Please enter an ending date in format Month day, year : ");
		String dateTwoString = in.nextLine();
		
		//format & parse 2nd date submitted
		DateTimeFormatter formatter2 = DateTimeFormatter.ofPattern("MMMM d, yyyy", Locale.ENGLISH);
		LocalDate date2 = LocalDate.parse(dateTwoString, formatter2);
		System.out.println("Your ending date is: " + dateTwoString);

		// Add calculator to look at difference between date1 & date 2 & vice versa
		// Can't mix joda time with other imports. Don't even try it, buddy. 

		Period difference = date1.until(date2);
		int daysDiff = difference.getDays();
		int monthsDiff = difference.getMonths();
		int yearsDiff = difference.getYears();

		System.out.println("Your TOTAL difference in time is:");
		System.out.println("Years: " + yearsDiff + " ");
		System.out.println("Months: " + monthsDiff + " ");
		System.out.println("Days: " + daysDiff + " ");
	}
}
