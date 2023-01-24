import java.util.Scanner;

public class Q5 
{

	public static void main(String[] args) 
	{
		
		/* WAP to sort an array using Selection Sort Algorithm */
		/* Concept reference video: https://www.youtube.com/watch?v=fgYlVyrt1vE */
		
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
		
		/* Logic for Selection Sort */
		for(int i = 0; i < ar.length; i++)
		{
			int min = ar[i];
			int index = 0;
			for(int j = i+1; j < ar.length; j++)
			{
				if(ar[j] < min)  //Flip the sign in this condition for descending order sorting
				{
					min = ar[j];
					index = j;
				}
			}
			if(index != 0)
			{
				int temp;
				temp = ar[index];
				ar[index] = ar[i];
				ar[i] = temp;
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
