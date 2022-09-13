import java.util.Scanner;

class SmallestDigit
{
	public static void main(String args[])
	{
		System.out.println("*****Smallest Digit Program*****");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the 1st No. ");
		int a = sc.nextInt();
		System.out.println("Enter the 2nd No. ");
		int b = sc.nextInt();
		System.out.println("Enter the 3rd No. ");
		int c = sc.nextInt();
		
		if(a<b && a<c)
		{
			System.out.println(a+" is the smallest number between "+a+", "+b+" & "+c);
		}
		else
		{
			if(b<c)
			{
				System.out.println(b+" is the smallest number between "+a+", "+b+" & "+c);
			}
			else
			{
				System.out.println(c+" is the smallest number between "+a+", "+b+" & "+c);
			}
		}
	}
}