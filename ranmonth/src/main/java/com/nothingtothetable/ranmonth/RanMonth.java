package com.nothingtothetable.ranmonth;

import java.util.Random;

public class RanMonth
{

	public static void main(String[] args)
	{
		Random rand = new Random(System.currentTimeMillis());
		
		int days = 28;
		System.out.println((rand.nextInt(days-1) + 1));
	}
 
}
