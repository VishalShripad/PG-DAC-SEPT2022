import java.util.Scanner;

class Digit
{
	public static void main(String args[]){
	System.out.println("**** Print digits *******");
	System.out.print("Enter the Number positive ");
	Scanner sc = new Scanner(System.in);
	int N = sc.nextInt();
	//int count = 1;
	int A = N;
	int C = 0;
	int D = 0;
	int count1 = 0;
	int count2 = 0;
	
	while(A/10 != 0)
	{
		A=A/10;
		count1++;
	}
	A = N;
	
	
	while(A>0)
	{
		D = A%10;
		A = A/10;
		C = C*10 + D;
	}
	int E = C;
	
	while(E/10 != 0)
	{
		E=E/10;
		count2++;
	}
	
	
	if(count1 == count2)
	{
		System.out.print("The reverse of "+N+" is ");
		while(C>0)
		{
			System.out.print(C%10+" ");
			C=C/10;
		}
	}
	else
	{
		System.out.print("The reverse of "+N+" is ");
		System.out.print(C%10+" ");
		while(count2<=count1)
		{
			System.out.print(0+" ");
			
			count2++;
		}
	}
	
	
	
}
}








/*while(N/10 != 0)
	{
		N=N/10;
		count++;
	}*/
	