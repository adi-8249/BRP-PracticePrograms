package practiceSet1;

import java.util.Scanner;

public class Palindrum 
{
	public static void main(String[] args) 
	{
		int rev = 0;
		int rem;
		int temp;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number here");
		int number = sc.nextInt();
		
		while(number > 0) 
		{ 
			
		rem= number % 10;
		rev=rev*10 + rem;
		number = number/10; 
		
		}
		if(number == rev) 
		{
			System.out.println("The number is palendrum");
		}
		else 
		{
			System.out.println("The number is not palendrum");
		}
	}
		
}


