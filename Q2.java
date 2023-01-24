import java.util.Scanner;

public class Q2 
{
	
	public static void main(String[] args) 
	{
		
		/* WAP to sort an array using Quick Sort Algorithm */
		/* Concept reference video: https://www.youtube.com/watch?v=ZHVk2blR45Q */
		
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
		
		quickSort(ar, 0, ar.length-1);
		System.out.println();
		System.out.print("Final Sorted Array(ascending order): ");
		for(int el:ar)
		{
			System.out.print(el + " ");
		}	
	}
	
	/* Logic for array Partition */
	static int partition(int[] ar, int low, int high)
	{
		int i = 0,j,pivot;
		if(high > low)
		{
			pivot = ar[high];
			for(j = 0;j < high;j++)
			{
				if(ar[j] < pivot)  //Flip the sign in this condition for descending order sorting
				{
					int temp;
					temp = ar[j];
					ar[j] = ar[i];
					ar[i] = temp;
					i++;
				}
			}
			ar[high] = ar[i];
			ar[i] = pivot;
		}
		return i;
	}
	
	/* Logic for Quick Sort */
	static void quickSort(int[] ar, int low, int high)
	{
		if(high > low)
		{
			int p = partition(ar,low,high);
			quickSort(ar,low,p-1);
			quickSort(ar,p+1,high);
		}
	}

}
