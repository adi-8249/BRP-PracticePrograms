package practiceSet1;

public class ReverseString 
{

	public static void main(String[] args)
	{
		String name="Anjaneya";
		int len=name.length();
		String rev="";
		//here we use two methods 1-length(); 2-ChatAt()
		
		for(int i = len-1;i>=0;i--) 
		{
			rev=rev + name.charAt(i);
		}
		System.out.println(rev);
	}
}
