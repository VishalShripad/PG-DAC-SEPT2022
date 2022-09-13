class P13
{
	public static void main(String args[])
	{
		for(char i=65 ; i<=69 ; i++) //ROW
		{
			for(char j=69 ; j>i ; j--)  //SPACE COL
			{
				System.out.print(" ");
			}
			for(char j=65 ; j<=i ; j++)  //PRINT COL
			{
				System.out.print(i+" ");
			}
			
			System.out.println();
		}
	}
}