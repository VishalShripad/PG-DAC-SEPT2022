class P15
{
	public static void main(String Args[])
	{
		for(int i=5 ; i>=1 ; i--)
		{
			int j=5;
			for(int k=1 ; k<=i ; k++)
			{
				System.out.print(j+" ");
				j--;
			}
			System.out.println();
		}
	}
}