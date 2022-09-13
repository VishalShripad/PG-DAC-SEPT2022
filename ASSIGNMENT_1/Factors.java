import java.util.Scanner;


class Factors
{
	public static void main(String args[])
	{
		System.out.println("*****Foctors*****");
		System.out.println("Enter the number ");
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int A = N/2;
		System.out.print("The factors of "+N+" are ");
		for(int i = 1 ; i<=A ; i++)
		{
			if(N%i==0)
			{
				System.out.print(i+", ");
			}
		}
		System.out.print(N+".");
	
	}
}