package practiceSet1;

public class ObjectComparison {

	public static void main(String[] args)
	{
		//Creating obj and passing values
		//creating constructor of the Double class   
		Double x = new Double(123.45555);  
		//creating constructor of the Long class   
		Long y = new Long(9887544);  
		//invoking the equals() method   
		
		
		
		System.out.println("Objects are not equal, hence it returns " + x.equals(y));  
		System.out.println("Objects are equal, hence it returns " + x.equals(123.45555)); 
		
	}
}
