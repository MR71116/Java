import java.io.*;
class lecturersub
{
// two classes and one class inherits the methods of other class using the keyword extends
// name of lecturer is receiving from user in run time
// object is created for the derived class and all methods are called	
	public void subjectandmode(String subject, String mode)
	{
		System.out.println("The subject handled is "+subject);
		System.out.println("The mode of teaching is "+mode);		
	}

}
class designationanddepts extends lecturersub
{
	public void designationanddept(String designation, String dept) 
	{
		System.out.println("The Designation is "+designation);
		System.out.println("The Department is "+dept);
	}
  public static void main(String args[]) throws Exception
	{
		designationanddepts d=new designationanddepts();
		System.out.println("Input the name of Lecturer");
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String name=br.readLine();
		System.out.println("Lecturer "+name+ " qualification, department, mode of teaching and subject details are below");
		d.subjectandmode("maths","Online");
		d.designationanddept("M.Sc","Bio-tech");	
	}
}