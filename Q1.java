import java.util.Scanner;

public class Q1 
{

	public static void main(String[] args) 
	{
		
		/* WAP to find the duplicates present in an array */
		
		int n;
		System.out.print("Please enter the number of inputs: ");
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		
		int[] ar = new int[n];
		
		/* Taking input from user */
		System.out.println("Enter "+n+" Numbers: ");
		for(int i=0; i<ar.length; i++)
		{
			ar[i] = sc.nextInt();
		}
		sc.close();
		
		/* Logic to find duplicates */
		int flag = 0;
		for(int i=0; i<ar.length; i++)
		{
			int count = -1;
			int[] ind = new int[n];
			for(int j=0; j<ar.length; j++)
			{
				if(ar[i] == ar[j] && i > j)
				{
					break;
				}
				else if(ar[i] == ar[j])
				{
					count+=1;
					ind[count] = j;
				}
			}
			if(count > 0)
			{
				flag = 1;
				System.out.println();
				System.out.print(ar[i]+" is duplicate and present at index: ");
				for(int k = 0; k <= count; k++)
				{
					System.out.print(ind[k] +" ");
				}
			}
		}
		if(flag == 0)
		{
			System.out.println("No duplicate values found!");
		}
	}

}
