import java.util.Scanner;

class OddNumber
{
	public static void main(String args[])
	{
		System.out.println("**** Odd number series *******");
		System.out.print("Enter the Number upto which series to be printed ");
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		//int a = N/2;
		System.out.print("The Odd number series upto "+N+" is");
		for (int i = 1; i<=N ; i+=2)
		{
			System.out.print(" "+i);
		}
		System.out.print(".");
	}
}	