class cubecalculation
{
	static int c;
	static int res;
	
	public static void cube()
	{	
		System.out.println("The number is "+c);
		res=c*c*c;
		System.out.println("The cube of "+c+ " is "+res);	
	}
	public static void main(String args[])
	{
		c=3;		
		cube();
	}
}