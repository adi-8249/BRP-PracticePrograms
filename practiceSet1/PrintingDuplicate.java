package practiceSet1;

public class PrintingDuplicate {

	public static void main(String[] args) 
	{
		int count = 0;
		int[] a = {5,3,4,5,4,9,6};
		System.out.println("Duplicate elements are: ");
		for(int i = 0;i<a.length;i++) 
		{
			for(int j=i+1;j<a.length;j++) 
			{
				if((a[i]==a[j]) && (i!=j))
				{
					count++;
					System.out.print(a[j]+" \n");
				}
			}
		}
		System.out.println("the number of duplicates are: "+ count);
	}

}
