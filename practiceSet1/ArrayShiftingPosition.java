package practiceSet1;
import java.util.Scanner;
public class ArrayShiftingPosition
{

	public static void main(String[] args) 
	{
	   int[] arr = new int[] {1,4,3,5,9,6};
	   Scanner sc = new Scanner(System.in);
	   System.out.println("Enter number here");
	   int number = sc.nextInt();
	   
	   System.out.println("Printing existing array");
	   //printing user input array here
	   for(int i = 0;i<=arr.length-1;i++)
	   {
		   System.out.print(arr[i]+" ");
	   }
	   
	   for(int i = 0; i < number; i++)
	   {    
           int j, temp; 
           //storing array
           temp = arr[arr.length-1];    
           
           for(j = arr.length-1; j > 0; j--)
           {        
               arr[j] = arr[j-1];    
           }        
           arr[0] = temp;    
	   }
	   System.out.println();    
       
       //Display the shifting array    
       System.out.println("Array after right rotation: ");    
       for(int i = 0; i< arr.length; i++)
       {    
           System.out.print(arr[i] + " ");    
       }
       sc.close();
    }
}
