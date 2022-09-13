import java.util.Scanner;

class LcmNumber
{
	public static void main(String args[])
	{
		System.out.println("*****LCM of the given Numbers*****");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the 1st positve No. ");
		int a = sc.nextInt();
		System.out.println("Enter the 2nd positive No. ");
		int b = sc.nextInt();
		int gcd = 0;
		
		System.out.print("LCM of the given number is ");
		
		for(int i = 1; i<=a ; i++)
		{
			if (a%i==0 && b%i==0)
			{
				gcd=i;
			}
		}
		System.out.print((a*b)/gcd);
	}
}	