import java.io.*;
public class Task1 {
			public void calc() throws Exception
			{
			
			System.out.println("Enter the Height Feet");
			BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
			int ft = Integer.parseInt(br.readLine());
			System.out.println("Enter the Height Inches");
			BufferedReader bae=new BufferedReader(new InputStreamReader(System.in));
			int inch = Integer.parseInt(bae.readLine());
			double a=ft*30.48;
			double b=inch*2.54;
			double res=a+b;
			System.out.printf("The Result for Conversation of height "+ft+ " feet " +inch+ " inches into Centimeter is "+res);
				
		}

	public static void main(String[] args) throws Exception
	{
		
			Task1 t=new Task1();
			t.calc();
	}

}
