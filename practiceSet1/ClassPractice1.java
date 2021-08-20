package practiceSet1;
import java.util.Scanner;
public class ClassPractice1
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string here");
		String s = sc.nextLine();
	}

	public static String stringSwap(String s) 
	{
		if(s == null || s.isEmpty()) 
			return s;
		
	//converting given string into charArray
	char[] ch =s.toCharArray();
	
	for(int i = 0;i < ch.length-1;i+=2)
	{
		
	//swapping characters here
		char temp=ch[i];
		ch[i]=ch[i+1];
		ch[i+1]=temp;
	}	
}




