/**
 * Prints the calendars of all the years in the 20th century.
 */
public class Calendar1 {
	// Starting the calendar on 1/1/1900
	static int dayOfMonth = 1;
	static int month = 1;
	static int year = 1900;
	static int dayOfWeek = 2; // 1.1.1900 was a Monday
	static int nDaysInMonth = 31; // Number of days in January

	/**
	 * Prints the calendars of all the years in the 20th century. Also prints the
	 * number of Sundays that occured on the first day of the month during this
	 * period.
	 */
	public static void main(String args[]) {
		// Advances the date and the day-of-the-week from 1/1/1900 till 31/12/1999,
		// inclusive.
		// Prints each date dd/mm/yyyy in a separate line. If the day is a Sunday,
		// prints "Sunday".
		// The following variable, used for debugging purposes, counts how many days
		// were advanced so far.
		int sundayCount = 0;
		int debugDaysCounter = 0;
		//// Write the necessary initialization code, and replace the condition
		//// of the while loop with the necessary condition
		while (year != 2000) {
			if (dayOfWeek == 1) {
				System.out.println(dayOfMonth + "/" + month + "/" + year + " Sunday");
			}

			else {
				System.out.println(dayOfMonth + "/" + month + "/" + year);
			}

			if (dayOfMonth == 1 && dayOfWeek == 1) {
				sundayCount++;
			}

			advance();
			debugDaysCounter++;
		}
		System.out.println("During the 20th century, " + sundayCount + " Sundays fell on the first day of the month");
	}

	// Advances the date (day, month, year) and the day-of-the-week.
	// If the month changes, sets the number of days in this month.
	// Side effects: changes the static variables dayOfMonth, month, year,
	// dayOfWeek, nDaysInMonth.
	private static void advance() {
		if (dayOfWeek == 7)
			dayOfWeek = 1;

		else
			dayOfWeek++;

		if (dayOfMonth == nDaysInMonth(month, year) && month != 12) {
			month++;
			dayOfMonth = 1;

		}

		else if (dayOfMonth == nDaysInMonth(month, year) && month == 12) {
			year++;
			dayOfMonth = 1;
			month = 1;
		}

		else
			dayOfMonth++;

	}

	// Returns true if the given year is a leap year, false otherwise.
	private static boolean isLeapYear(int year) {
		boolean leapYear;
		leapYear = year % 400 == 0;
		leapYear = leapYear || year % 4 == 0 && (year % 100) != 0;
		return leapYear;
	}

	// Returns the number of days in the given month and year.
	// April, June, September, and November have 30 days each.
	// February has 28 days in a common year, and 29 days in a leap year.
	// All the other months have 31 days.
	private static int nDaysInMonth(int month, int year) {
		int days;

		// April, June, September, November
		if (month == 4 || month == 6 || month == 9 || month == 11)
			days = 30;

		// February
		else if (month == 2) {

			if (isLeapYear(year))
				days = 29;
			else
				days = 28;
		}

		// January, March, May, July, August, October, December
		else
			days = 31;

		return days;
	}
}
