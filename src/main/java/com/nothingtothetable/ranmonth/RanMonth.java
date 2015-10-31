package com.nothingtothetable.ranmonth;

import java.util.Random;

public class RanMonth
{

	public static void main(String[] args)
	{
		Random rand = new Random(System.currentTimeMillis());
		Calendar cal = new Calendar(2015);
		int days = cal.getDays(Month.NOVEMBER);
		System.out.println((rand.nextInt(days-1) + 1));
	}
 
}
