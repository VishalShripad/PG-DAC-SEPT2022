import java.util.Scanner;

class Factorial
{
	public static void main(String args[])
	{
		System.out.println("*****Factorial program*****");
		System.out.println("Enter the positive number ");
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int sum = 1;
		int A = N;
		if(N==0)
		{
			System.out.println("The factorial of "+N+" is 1");
		}
		else
		{
			while(A>=1)
			{
				sum = sum * A;
				A--;
			}
			System.out.println("The factorial of "+N+" is "+sum);
		}
	}
}