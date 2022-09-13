import java.util.Scanner;

class EvenNumber
{
	public static void main(String args[])
	{
		System.out.println("**** Even number series *******");
		System.out.print("Enter the Number upto which series to be printed ");
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		//int a = N/2;
		System.out.print("The Even number series upto "+N+" is");
		for (int i = 2; i<=N ; i+=2)
		{
			System.out.print(" "+i);
		}
		System.out.print(".");
	}
}	