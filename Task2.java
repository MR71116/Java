import java.io.*;
public class Task2 {

	public void table() throws Exception
	{
	System.out.printf("%-12s%-8s\n", "Miles", "Kilometers");
	for(int i=1;i<=10;i++)
	{
	try
	{
		double v =1.609;
		double res=i*v;
	
	System.out.format("%-12d%-8.3f\n",i,res);
	Thread.sleep(1000);
	}
	
	catch(Exception e)
	{
	}
	}
	}

	public static void main(String[] args)  throws Exception
	{
		
		Task2 t=new Task2();
		t.table();
	}

}
