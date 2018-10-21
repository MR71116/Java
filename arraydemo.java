import java.io.*;
class arraydemo
{
	static int array[]={20,30,10};
	public static void main(String args[]) throws Exception
	{
		System.out.println("Array length is "+array.length);
		try
		{
		array[2]=90;
		for(int i=0;i<array.length;i++)
		{
		System.out.println("The numbers are "+array[i]);
		}
		}
		catch(Exception e)
		{
		System.out.println("The Exception is "+e);
		}
		}	
}