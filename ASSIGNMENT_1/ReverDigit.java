import java.util.Scanner;

class ReverseDigit
{
	public static void main(String args[])
	{
		System.out.println("**** Reverse the number *******");
		System.out.print("Enter the Number ");
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int a = N;
		System.out.print("The reverse of "+N+" is ");
		while(a>0)
		{
			System.out.print(a%10);
			a=a/10;
		}
			
	}
}	