package com.nothingtothetable.ranmonth.types;

public class Calendar {
	private int year;
	private boolean isLeapYear;

	public Calendar(int year)
	{
		this.year = year;
		this.isLeapYear = determineLeap(year);
	}
	
	public int getDays(Month month)
	{
		if(month == month.FEBRUARY && this.isLeapYear)
		{
			return month.getDays() + 1;
		}
		
		return month.getDays();
	}
	
	private boolean determineLeap(int year)
	{
		if((year % 4) == 0)
		{
			if((year % 100) == 0)
			{
				if((year % 400) == 0)
				{
					return true;
				}
			}
		}

		return false;
	}
	
	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public boolean isLeapYear() {
		return isLeapYear;
	}

}
