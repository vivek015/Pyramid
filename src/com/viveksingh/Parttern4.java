package com.viveksingh;

public class Parttern4 {

	public static void main(String args[])
	{
		char last='E', alphabet='A';
		
		for(int i=1; i<= (last-'a'+1); ++i)
		{
			for (int j=1; j<=i; ++j)
			{
				System.out.print(alphabet + " ");
			}
			++alphabet;
		}
		System.out.println();
	}
}
