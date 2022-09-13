import java.util.Scanner;

class OddEven
{
	public static void main(String args[])
	{
		System.out.println("******ODD EVEN NUMBER******");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int N = sc.nextInt();
		if(N%2==0)
		{
			System.out.println("The number "+N+" is even number");
		}
		else
		{
			System.out.println("The number "+N+" is odd number");
		}
		sc.close();
	}
}