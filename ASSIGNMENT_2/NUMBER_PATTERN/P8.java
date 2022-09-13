class P8
{
	public static void main(String args[])
	{
		
		for(int i=5 ; i>=1 ; i--)
		{
			int c = i;
			for(int j=1 ; j<i ; j++)
			{
				System.out.print(" ");
			}
			
			for(int j=5 ; j>=i ; j--)
			{
				System.out.print(c+" ");
				c++;
			}
			System.out.println();
			
		}
	}
}