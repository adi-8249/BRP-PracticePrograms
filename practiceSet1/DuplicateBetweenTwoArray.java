package practiceSet1;

public class DuplicateBetweenTwoArray {

	public static void main(String[] args) 
	{
		int count =0;
		int[] arr1= {4,6,8,9,2,3};
		int[] arr2= {5,3,6,8,1,0};
		
		for(int i= 0; i < arr1.length;i++) 
		{
			for(int j=0;j< arr2.length;j++) 
			{
				if(arr1[i]==arr2[j]) 
				{
					count++;
				   System.out.println(arr1[i]);	
				}
			}
		}
		System.out.println("Repeated elements number is "+count);
 	}

}
