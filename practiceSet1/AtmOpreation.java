package practiceSet1;

import java.util.Scanner;

public class AtmOpreation {

	public static void main(String[] args) 
	{
		int balance = 10000, withdraw, deposite;
		Scanner sc = new Scanner(System.in);
		while(true) 
		{
			System.out.println("Welcome to STATE BANK OF INDIA");
			System.out.println("Please insert your card");
			System.out.println("1:Withdraw");
			System.out.println("2.Deposite");
			System.out.println("3.Checking balance");
			System.out.println("4:exit");
			System.out.println("Choose any operation");
		    int n = sc.nextInt();
		    
        switch(n)
        {
            case 1:
            System.out.println("Enter money to be withdraw:");
            withdraw = sc.nextInt();
            if(balance >= withdraw)
            {
                balance = balance - withdraw;
                System.out.println("Please collect your money");
                System.out.println("Your current balance :"+balance);
            }
            else
            {
                System.out.println("Insufficient Balance");
            }
            break;

            case 2:
            System.out.print("Enter money to be deposited:");
            deposite = sc.nextInt();
            balance = balance + deposite;
            System.out.println("Your Money has been successfully depsited");
            break;

            case 3:
            System.out.println("Balance : "+balance);
            System.out.println("");
            break;

            case 4:
            System.exit(0);
            break;
            
            default:
            System.out.println("Please enter the correct option");
            break;
        }
      }
    }
  }

