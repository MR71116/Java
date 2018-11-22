import java.io.*;
class Book{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String book1;
    int isbn1;
    String author1;
    String publisher1;

    Book(){
      book1="Java";
      isbn1=71116;
      author1="ArulSuju";
      publisher1="LICET";
    }

    public void getbook_name()throws Exception{
        System.out.println("Enter book name");
        book1 = br.readLine();
    }
    public void getisbn()throws Exception{
        System.out.println("Enter isbn number ");
        isbn1 = Integer.parseInt(br.readLine());
    }
    public void getauthor()throws Exception {
        System.out.println("Enter author name");
        author1 = br.readLine();
    }
    public void getpublisher()throws Exception{
        System.out.println("Enter publisher name");
        publisher1 = br.readLine();
    }
     public void setbook_name(String book)
    {
        this.book1=book;
    }
    public void setisbn(int isbn)
    {
       this.isbn1=isbn;
    }
    public void setauthor(String author)
    {
        this.author1=author;
    }
    public void setpublisher(String publisher)
    {
        this.publisher1=publisher;
    }

    public void display()
    {
        System.out.println("\n Book name "+book1);
        System.out.println("\n ISBN number "+isbn1);
        System.out.println("\n Author name "+author1);
        System.out.println("\n Publisher name "+publisher1);
    }

    public static void main(String [] args)throws Exception
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Book [] book = new Book [30];
        int i=0;
        System.out.println(" How many books info you want to store ");
        int n = Integer.parseInt(br.readLine());
        System.out.printf("you want to give the values by get method or set method \nEnter 1 for get method \n 2 for set method");
        int ch = Integer.parseInt(br.readLine());
        try
        {
        if(ch==1)
        {
        for(i=0;i<n;i++)
        {
            System.out.printf("\n Enter %d book Details\n",i+1);
            book[i]=new Book();
            book[i].getbook_name();
            book[i].getisbn();
            book[i].getauthor();
            book[i].getpublisher();
        }
        }
        else
        {
            book[i]=new Book();
            book[i].setbook_name("vj");
            book[i].setisbn(1007410);
            book[i].setauthor("vijaysethu");
            book[i].setpublisher("maven");
        }
        }
        catch(Exception ex)
        {
            System.out.println(ex);
        }
        for(i=0;i<n;i++)
        {
            book[i].display();
            System.out.println();
        }
    }
}