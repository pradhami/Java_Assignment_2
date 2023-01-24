import java.util.Scanner;

public class Q4 
{

	public static void main(String[] args) 
	{

		/* WAP to sort an array using Merge Sort Algorithm */
		/* Concept reference video: https://www.youtube.com/watch?v=qdv3i6X0PiQ */

		int n;
		System.out.print("Please enter the number of inputs: ");
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();

		int[] ar = new int[n];

		/* Taking input from user */
		System.out.println("Enter " + n + " Numbers: ");
		for (int i = 0; i < ar.length; i++) 
		{
			ar[i] = sc.nextInt();
		}
		sc.close();

		mergeSort(ar, 0, ar.length - 1);
		
		System.out.println();
		System.out.print("Final Sorted Array(ascending order): "); 
		for(int el:ar) 
		{
			System.out.print(el + " "); 
		} 
	}

	/* Logic for Merge Sort */
	static void mergeSort(int[] ar, int low, int high) 
	{
		if (high > low) 
		{
			int mid = (high + low) / 2;
			mergeSort(ar, low, mid);
			mergeSort(ar, mid + 1, high);
			merge(ar, low, mid, high);
		}
	}

	/* Logic to merge two subArray */
	static void merge(int[] ar, int low, int mid, int high) 
	{
		int[] rr = new int[(high - low) + 1];
		int i = low, j = mid+1 , k = 0, l = 0;
		
		/* Comparing elements of two subArray */
		while (i <= mid && j <= high) 
		{
			if ((ar[i] < ar[j]))  //Flip the sign in this condition for descending order sorting
			{
				rr[k] = ar[i];
				i++;
				k++;
			} 
			else 
			{
				rr[k] = ar[j];
				j++;
				k++;
			}
		}

		/* Copying remaining elements from first subArray to the local array */
		while (i <= mid) 
		{
			rr[k] = ar[i];
			i++;
			k++;
		}

		/* Copying remaining elements from second subArray to the local array */
		while (j <= high) 
		{
			rr[k] = ar[j];
			j++;
			k++;
		}
		
		/* Updating sorted values from local array to original array */
		for(i = low; i<=high; i++)
		{
			ar[i] = rr[l];
			l++;
		}
	}
}
