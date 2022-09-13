import java.util.Scanner;

class Palindrome
{
	public static void main(String args[])
	{
		System.out.println("***** Palindrome Number *****");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the positve number");
		int N = sc.nextInt();
		int A = N;
		int B = 0;
		
		while (N>0)
		{
			int C = N%10;
			N = N/10;
			B = B*10+C;
		}
		
		if(A == B)
		{
			System.out.println("The number is palindrome");
		}
		else
		{
			System.out.println("The number is not palindrome");
		}
	
	}
}