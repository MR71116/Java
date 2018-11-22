import java.io.BufferedReader;
import java.io.InputStreamReader;
public class Task3 {
			public void calcf() throws Exception
			{
			
			System.out.println("Enter temperature in Fahrenheit:");
			BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
			double ft = Integer.parseInt(br.readLine());
			double a=(ft-32)*(0.5556);
			System.out.printf("The Result for Conversation of Temperature from "+ft+ " Fahrenheit to Celcius is "+a); 
			
		}
			
			public void calcc() throws Exception
			{
			
			System.out.println("\nEnter temperature in Celcius:");
			BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
			double ft = Integer.parseInt(br.readLine());
			double b=((ft*9)/5)+32;
			System.out.printf("The Result for Conversation of Temperature from "+ft+ " Fahrenheit to Celcius is "+b); 
			
		}

	public static void main(String[] args) throws Exception
	{
		
			Task3 t=new Task3();
			t.calcf();
			t.calcc();
	}

}