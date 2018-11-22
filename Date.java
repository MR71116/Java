
import java.io.*;
class Date
{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int dat;
    int month;
    int year;

    Date()
    {
        dat=01;
        month=01;
        year=2001;
    }
    public void get_dat()throws Exception
    {
        System.out.println("Enter date");
        dat=Integer.parseInt(br.readLine());
    }
    public void get_month()throws Exception
    {
        System.out.println("Enter month");
        month=Integer.parseInt(br.readLine());
    }
    public void get_year()throws Exception
    {
        System.out.println("Enter year");
        year=Integer.parseInt(br.readLine());
    }
    public void set_dat(int dat)
    {
        this.dat=dat;
            }
    public void set_month(int mon)
    {
        month=mon;
    }
    public void set_year(int year)
    {
        this.year=year;
    }
    public void display()
    {
        System.out.println("Entered Date : "+dat+"/"+month+"/"+year);
    }

    public static void main(String [] args)throws Exception
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Date d1= new Date();
        Date d2 = new Date();

        d1.get_dat();
        d1.get_month();
        d1.get_year();

        d2.set_dat(30);
        d2.set_month(12);
        d2.set_year(1988);

        System.out.println("the date for get method");
        d1.display();
        System.out.println("the date for set method");
        d2.display();

    }
}

