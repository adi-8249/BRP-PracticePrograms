package practiceSet1;

import java.util.Scanner;

public class PrimeNumber 
{
	int number;
	public static void main(String[] args)
	{
		int count = 0;
	    Scanner scanner = new Scanner(System.in); 
	     int number=scanner.nextInt();
	     System.out.println("Enter a number here");
	     
	     for(int i = 2;i<=number;i++)
	     {
	    	 
	    	 if(number % i == 0) 
	    	 {
	    		count++;
	    	 }
	    	 
	     }
	    	if(count == 0)
	    	{
	    		System.out.println("Number is prime");
	    	}
	    	else 
	    	{
	    		System.out.println("Number is not prime");
	    	}
	    	 scanner.close();
	     }
	}



