package practiceSet1;

import java.util.HashSet;
public class DuplicateArray {

	public static void main(String[] args)00
	{
		int count = 0;
		int[] a = {1,2,3,7,5,9,4};
		 
		HashSet<Integer> hash = new HashSet<>();
		for (int i =0; i<a.length; i++) 
		{
			hash.add(a[i]);
			
		}
		
		for(int no:hash) 
		{
			count++;
			System.out.print(no+" \n");
		}
		System.out.println("Total numbers are :"+count);
		

	}

}
