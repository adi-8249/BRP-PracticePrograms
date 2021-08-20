package practiceSet1;

import java.util.Scanner;

public class DeleteElement {

	public static void main(String[] args) 
	{
		int[] a= {10,20,30,40,50};
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter which number u want to delete");
		int delete=sc.nextInt();
	    for (int i = 0; i<a.length;i++) 
	    {	
	    	if(delete == a[i])
	    	{
	    		
	    		for (int j=i;j<a.length-1;j++)
	    		{
	    			a[j]=a[j+1];
	    		}
	    		break;
	    	}
	    }

	    	for(int i = 0;i<a.length-1;i++) {
	    		System.out.println(a[i]+" ");
	    	}
	}

}
