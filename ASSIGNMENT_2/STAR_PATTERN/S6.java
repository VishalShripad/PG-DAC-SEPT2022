class S6
{
	public static void main (String args[])
	{
		for(int i=5;i>=1;i--)  ///row printing
		{
			for(int j=5;j>i;j--) //column
			{
				System.out.print(" ");
			}
			
			for(int j=1;j<=i;j++) //column
			{
				System.out.print("*");
			}
			
			
			for(int j=1;j<i;j++) //column
			{
				System.out.print("*");
			}
			System.out.println();
			
			
		}
	}
}