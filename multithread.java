import java.io.*;
class Table
{
	public synchronized void tables(int tn)
	{
	
	for(int i=1;i<=10;i++)
	{
	
	try
	{
	//System.out.println(tn*i);
	//System.out.println(tn*i);
	System.out.format("%2d x %d = %2d\n", tn,i,i*tn);
	//System.out.println((tn) "* = is" (tn*i));
	Thread.sleep(1000);
	}
	
	catch(Exception e)
	{
	}
	}
	}

}
class twotable extends Thread
{
	
	Table t;
	public twotable(Table t)
	{
	this.t=t;
	}
	public void run()
	{
	try
	{
	System.out.println("Enter the number for tables");
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	int num = Integer.parseInt(br.readLine());
	t.tables(num);
	}
	catch(Exception e)
	{}
	}
}
class fourtable extends Thread
{
	
	Table t;
	public fourtable(Table t)
	{
	this.t=t;
	}
	public void run()
	{
	try
	{
	System.out.println("Enter the number for tables");
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	int num = Integer.parseInt(br.readLine());
	t.tables(num);
	}
	catch(Exception e)
	{}
	}
	
}
class multithread
{
	public static void main(String args[])
	{
	Table t=new Table();
	fourtable f4=new fourtable(t);
	twotable f2=new twotable(t);
	f2.start();
	f4.start();
	}	
	

}
