package com.nothingtothetable.ranmonth;

public enum Month {
	JANUARY("january", 31),
	FEBRUARY("february", 28),
	MARCH("march", 31),
	APRIL("april", 30),
	MAY("may", 31),
	JUNE("june", 30),
	JULY("july", 31),
	AUGUST("august", 31),
	SEPTEMBER("september", 30),
	OCTOBER("october", 31),
	NOVEMBER("november", 30),
	DECEMBER("december", 31);
	
	private final String month;
	private final int days;
	
	Month (String month, int days)
	{
		this.month = month;
		this.days = days;
	}
	
	public int getDays()
	{
		return days;
	}
	
	public String getMonth()
	{
		return month;
	}
}
