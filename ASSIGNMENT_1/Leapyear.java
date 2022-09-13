import java.util.Scanner;

class Leapyear
{
	public static void main(String args[])
	{
		System.out.println("*****Leap yeaer*****");
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the yr ");
		int yr = sc.nextInt();
		if( (yr%400==0) || (yr%4==0 && yr%100!=0))
		{
			System.out.println(yr+" is the leap year");
		}
		else
		{
			System.out.println(yr+" is not the leap year");
		}
	}	
	
}