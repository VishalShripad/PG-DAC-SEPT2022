import java.util.Scanner;

class SumOfTheDigit
{
	public static void main(String args[])
	{
		System.out.println("******Sum Of The Digit******");
		System.out.println("Enter the Number positive");
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int count = 1;
		int A = N;
		int sum = 0;
		while(A/10!=0)
		{
			A = A/10;
			count++;
		}
		A = N;
		for(int i = 1 ; i<=count ; i++)
		{
			int B = A%10;
			A = A/10;
			sum = sum + B;
		}
		System.out.println(sum);
	}
}