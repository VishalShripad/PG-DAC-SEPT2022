import java.util.Scanner;

class Swap
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number to swap");
		System.out.println("A = ");
		int A = sc.nextInt();
		System.out.println("B = ");
		int B = sc.nextInt();
		//int count=0;
		A = A+B;
		B = A-B;
		A = A-B;
		System.out.println("A="+A+" B="+B);
		/*if(A<B)
		{	for(;A!=B;++A)
			{
				count++;
			}
			for(;count!=0;--count)
			{
				B--;
			}
			System.out.println(A+" "+B);
				
		}*/	
	}
}