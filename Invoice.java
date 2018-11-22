import java.io.*;
import java.util.Scanner;

public class Invoice
{
	String Pnum;
	String Pdesc;
	int Pquantity;
	double Pprice;
	public Invoice(String number, String descrn, int quantity, double price) {
		Pnum = number;
		Pdesc = descrn;
		Pquantity = quantity;
		Pprice = price;
    }
     
    public void setPartNumber (String number) {
    	Pnum = number;
    }
     
    public String getPartNumber () {
        return Pnum;
   }
     
    public void setPartDescription (String description) {
    	Pdesc = description;
    }
     
    public String getPartDescription () {
        return Pdesc;
    }
     
    public void setQuantityOfItemPurchased (int quantity) {
    	Pquantity = quantity;
    }
     
    public int getQuantityOfItemPurchased () {
        return Pquantity;
    }
     
    public void setPricePerItem (double price) {
    	Pprice = price;
    }
     
    public double getPricePerItem () {
        return Pprice;
    }
     
    public double getInvoiceAmount () {
        double calculateTotalAmount;
        calculateTotalAmount = Pquantity * Pprice;
        return calculateTotalAmount;
    }
     
   public static void main (String [] args) {
 
    Invoice I = new Invoice (" ", " ", 0, 0.0);
 
 Scanner input = new Scanner (System.in);
         
        String item;
        String description;
        int quantity;
        double price;
         
        System.out.print ("Enter Number: ");
        item = input.nextLine();
        I.setPartNumber(item);
         
        System.out.print ("Enter Description of Item Purchased: ");
        description = input.nextLine();
        I.setPartDescription(description);
         
        System.out.print ("Enter The Quantity of Item Purchased: ");
        quantity = input.nextInt();
 if (quantity > 0)
        I.setQuantityOfItemPurchased(quantity);
         
        System.out.print ("Enter The Price Per Item: ");
        price = input.nextDouble();
 if (price > 0)
        I.setPricePerItem (price);
         
        System.out.printf ("The Total Amount for all items purchased = RS %.2f\n",
                I.getInvoiceAmount());
 
    }
}


	
