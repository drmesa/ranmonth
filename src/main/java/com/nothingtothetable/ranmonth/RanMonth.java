package com.nothingtothetable.ranmonth;

import java.util.Random;

public class RanMonth
{

	public static void main(String[] args)
	{
		Month thisMonth = Month.MAY;
		Random rand = new Random(System.currentTimeMillis());
		Calendar cal = new Calendar(2019);
		int days = cal.getDays(thisMonth);
		int randResult = rand.nextInt(days) + 1;
		System.out.println("Event should occur on " + randResult + " " + thisMonth.name());
	}
 
}
