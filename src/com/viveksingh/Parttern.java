package com.viveksingh;

public class Parttern {

	public static void main(String args[])
	{
		int rows =5;
		for(int i=1; i<=rows; ++i)
		{
			for(int j=1; j<=i; ++j)
			{
				System.out.println("*");
			}
			System.out.println();
		}
	}
}
