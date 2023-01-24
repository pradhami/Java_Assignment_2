import java.util.Scanner;

public class Q3 
{

	public static void main(String[] args) 
	{
		
		/* WAP to sort an array using Bubble Sort Algorithm */
		
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
		
		/* Logic for Bubble Sort */
		for(int i = 0; i < ar.length; i++)
		{
			for(int j = 1; j < ar.length-i; j++)
			{
				if(ar[j-1] > ar[j])  //Flip the sign in this condition for descending order sorting
				{
					int temp;
					temp = ar[j-1];
					ar[j-1] = ar[j];
					ar[j] = temp;
				}
			}
		}
		System.out.println();
		System.out.print("Final Sorted Array(ascending order): ");
		for(int el:ar)
		{
			System.out.print(el + " ");
		}
	}

}
