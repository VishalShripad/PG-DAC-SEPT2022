class P10
{
	public static void main(String args[])
	{
		
		for(int i=69 ; i>=65 ; i--)
		{
			char c = (char)i;
			for(int j=65 ; j<i ; j++)
			{
				System.out.print(" ");
			}
			
			for(int j=69 ; j>=i ; j--)
			{
				System.out.print(c+" ");
				c++;
			}
			System.out.println();
			
		}
	}
}