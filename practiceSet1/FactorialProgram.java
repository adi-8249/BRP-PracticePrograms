package practiceSet1;

import java.util.Scanner;

public class FactorialProgram 
{
	public static void main(String[] args)
	{
		int fact=1;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number here");
		int number = sc.nextInt();
		
		for(int i =1;i<=number;i++)
		{
			fact=fact*i;
		}
		System.out.println("Factorial of "+number+" is :"+fact);
	}
}
