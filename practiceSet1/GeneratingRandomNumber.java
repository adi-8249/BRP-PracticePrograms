package practiceSet1;

public class GeneratingRandomNumber 
{

	public static void main(String[] args)
	{
		//Here we will generating random number between 200 and 400
		//Using Math.random()
		System.out.println("Printing random number:"+Math.random());
		System.out.println("Printing random number:"+Math.random());
		
		int min=200;
		int max=201;
		
		System.out.println(Math.random()*(max-min+1)+min);//here we created random with double
		System.out.println((int)(Math.random()*(max-min+1)+min));//Here we created random with double and coverted into int
	}

}
