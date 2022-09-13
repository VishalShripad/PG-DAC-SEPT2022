class P12
{
	public static void main(String args[])
	{
		for(int i=1 ; i<=5 ; i++) //ROW
		{
			for(int j=5 ; j>i ; j--)  //SPACE COL
			{
				System.out.print(" ");
			}
			for(int j=1 ; j<=i ; j++)  //PRINT COL
			{
				System.out.print(i+" ");
			}
			
			System.out.println();
		}
	}
}