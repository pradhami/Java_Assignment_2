import java.util.Scanner;

public class Q6 
{

	public static void main(String[] args) 
	{
		
		/*  WAP to check whether an array is a subset of another array */
		
		int n1,n2;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Please enter the number of inputs for first array: ");
		n1 = sc.nextInt();
		int[] ar1 = new int[n1];
		
		/* Taking input from user */
		System.out.println("Enter "+n1+" Numbers: ");
		for(int i=0; i<ar1.length; i++)
		{
			ar1[i] = sc.nextInt();
		}
		
		System.out.print("Please enter the number of inputs for second array: ");
		n2 = sc.nextInt();
		int[] ar2 = new int[n2];
		
		/* Taking input from user */
		System.out.println("Enter "+n2+" Numbers: ");
		for(int i=0; i<ar2.length; i++)
		{
			ar2[i] = sc.nextInt();
		}
		sc.close();
		
		/* Logic to check for subset*/
		int j = 0;
		for(int i = 0; i < ar1.length; i++)
		{
			if(ar2[j] == ar1[i])
			{
				j++;
			}
		}
		System.out.println();
		if(j == ar2.length)
		{
			System.out.print("[");
			for(int el:ar2)
			{
				System.out.print(el + " ");
			}
			System.out.print("]");
			System.out.print(" is a subset of ");
			System.out.print("[");
			for(int el:ar1)
			{
				System.out.print(el + " ");
			}
			System.out.print("]");
		}
		else
		{
			System.out.print("[");
			for(int el:ar2)
			{
				System.out.print(el + " ");
			}
			System.out.print("]");
			System.out.print(" is not a subset of ");
			System.out.print("[");
			for(int el:ar1)
			{
				System.out.print(el + " ");
			}
			System.out.print("]");
		}
	}

}
