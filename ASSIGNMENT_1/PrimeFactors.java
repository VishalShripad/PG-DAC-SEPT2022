import java.util.Scanner;

class PrimeFactors
{
	public static void main(String args[])
	{
		System.out.println("*****Prime factors*****");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the positve No. ");
		int N = sc.nextInt();
		int i = 2;
		while(N>1)
		{
			while(N%i==0)
			{
				N=N/i;
				System.out.print(i+" ");
			}
			i++;
		}
		
	}
}