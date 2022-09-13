import java.util.Scanner;

class SumWithoutArmt
{
	public static void main(String args[])
	{
		System.out.println("*****Sum of two number without arethmatic*****");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the 1st No. ");
		int a = sc.nextInt();
		System.out.println("Enter the 2nd No. ");
		int b = sc.nextInt();
		
		if (a>=0 && b>=0)
		{
			for (int i=1;i<=a;i++)
			{
				b++;
			}
			System.out.println("The addition of the given number is "+b);
		}
		else if(a<0)
		{
			for (int i=0;i>a;i--)
			{
				b--;
			}
			System.out.println("The addition of the given number is "+b);
		}	
		else if(a>0 && b<0)
		{
			for (int i=0;i>b;i--)
			{
				a--;
			}
			System.out.println("The addition of the given number is "+a);
		}
		/*else if(a<0 && b<0)
		{
			for (int i=0;i>a;i--)
			{
				b--;
			}
			System.out.println("The addition of the given number is "+b);
		}*/
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		/*
		if(a<b)
		{
			if(a>0)
			{
				for (int i=1;i<=a;i++)
				{
					b++;
				}
				System.out.println("The addition of the given number is "+b);
			}
			else
			{
				for (int i=1;i>=a;i--)
				{
					b++;
				}
				System.out.println("The addition of the given number is "+b);
			}		
		}
		else
		{
			for (int i=1;i<=b;i++)
			{
				a++;
			}
			System.out.println("The addition of the given number is "+a);
		}*/
	}	
	
}