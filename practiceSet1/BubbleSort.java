package practiceSet1;

public class BubbleSort {

	public static void main(String[] args) 
	{
		int temp;
		int[] arr = {10,3,17,35,19,11};
      for(int i = 0; i<arr.length;i++) 
      {
    	  int flag=0;
    	for(int j=0; j<arr.length-1-i; j++) 
    	{ 
    		if (arr[j]>arr[j+1])
    		{
    			temp=arr[j+1];
    			arr[j+1]=arr[j];
    			arr[j]=temp;
    			flag=1;
    		}
    	}
    	if(flag == 1) 
    	{
    		break;
    	}
      }
      for(int i=0; i<=arr.length;i++)
      {
    	  System.out.println("the sorted numbers are:"+arr[i]);
      }
    	
	}

}
