import java.util.Scanner;

class PositiveNegative
{
	public static void main(String args[])
	{
		System.out.println("*****Positive Negative******");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number to test = ");
		int A = sc.nextInt();
		if(A<0)
		{
			System.out.println(A+" is the \"Negative\" number");
		}
		else
		{
			System.out.println(A+" is the \"Positive\" number");
		}
	}
}