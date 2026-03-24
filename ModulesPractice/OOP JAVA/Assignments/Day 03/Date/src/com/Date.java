package com;


public class Date {
	private int day;
	private int month;
	private int year;
	private int [] daysOfMonth = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
	
	public Date(int dd, int mm, int yyyy){		//Parameterized constructor
		day = dd;
		month = mm;
		year = yyyy;
		validate();
	}
	
	public boolean isLeapYear(int yyyy) {
		return (yyyy % 4 == 0 && yyyy % 100 != 0) || (yyyy % 400 == 0);
	}
	

	private int getDaysInCurrentMonth() {
        if (month == 2 && isLeapYear(year)) {
            return 29;
        }
        return daysOfMonth[month];
    }
	
	public void validate() {
        
        while (month > 12) {
            month -= 12;
            year++;
        }
        while (month < 1) { 
            month += 12;
            year--;
        }

        while (day > getDaysInCurrentMonth()) {
            day -= getDaysInCurrentMonth();
            month++;
            if (month > 12) {
                month = 1;
                year++;
            }
        }
        
        //when date is less than 1 (eg. 0)
        while (day < 1) {
            
            month--; 
            if (month < 1) {
                month = 12;
                year--;
            }
         
            day += getDaysInCurrentMonth(); 
        }
    }
	public void addDays(int dd) {
		day += dd;
		validate();
	}
	
	public void addMonths(int mm) {
		month += mm;
		validate();
	}
	
	public void addYears(int yy) {
		year += yy;
	}
	
	
	public boolean compareDates(Date d) {
		return (day == d.day && month == d.month && year == d.year);
	}
	public void displayDate() {
		System.out.println(day + "/" + month + "/" +year);
	}
		
}

