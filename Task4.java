import java.io.*;
public class Task4 {
			public void calc() throws Exception
			{
			
			System.out.println("Enter the First Number");
			BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
			int ft = Integer.parseInt(br.readLine());
			System.out.println("Enter the Second Number");
			BufferedReader bae=new BufferedReader(new InputStreamReader(System.in));
			int sc = Integer.parseInt(bae.readLine());
			int sum=ft+sc;
			int product=ft*sc;
			int diff=ft-sc;
			int div=ft/sc;
			System.out.println("The sum of First number: "+ft+" and Second number "+sc+  " is "+sum);
			System.out.println("The Multiplication of First number: "+ft+" and Second number "+sc+  " is "+product);
			System.out.println("The difference of First number: "+ft+" and Second number "+sc+  " is "+diff);
			System.out.println("The Division of First number: "+ft+" and Second number "+sc+  " is "+div);
			} 

	public static void main(String[] args) throws Exception
	{
		
			Task4 t=new Task4();
			t.calc();
	}

}
