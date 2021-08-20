package practiceSet1;

import java.util.Scanner;

public class ReverseNumber 
{

	public static void main(String[] args) 
	{
		int rem; 
		int rev=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number here");
		int number = sc.nextInt();
		
		while(number > 0) 
		{
		rem=number % 10;
		rev=rev*10+rem;
		number=number/10;
		}
		System.out.println(rev);
  }
}
