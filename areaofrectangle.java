class areaofrectangle
{
// area of rectange formula is Length * Breadth

	int res;
	int len;
	int breadth;
	public areaofrectangle(int len,int breadth)
	{
		this.len=len;
		this.breadth=breadth;
		
	}	
	public areaofrectangle(int l)
	{
		this.len=l;
				
	}
	public void getdetails()
	{
		System.out.println("The length of Rectangle is "+len);
		System.out.println("The breadth of Rectangle is "+breadth);
		res=len*breadth;
		System.out.println("The area of Rectangle is "+res);
	}
	public void getdetailsforsquare()
	{
		System.out.println("The length of Square is "+len);
		res=len*len;
		System.out.println("The area of Square is "+res);
	}
	public static void main(String args[])
	{
		areaofrectangle a=new areaofrectangle(3,8);
		a.getdetails();
		areaofrectangle a1=new areaofrectangle(4);
		a1.getdetailsforsquare();
	}
	
}