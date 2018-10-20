interface vehicle
{
	public void displayvehiclename();
	public void displayvehicleprice();
	public void displayvehiclecolor();
}
class vehiclename implements vehicle
{
	public String vname;
	int price;
	String color;
	public void displayvehiclename()
	{
	System.out.println("The Vehicle Name is "+vname);
	}
	public void displayvehicleprice()
	{
	System.out.println("The Vehicle price is "+price);
	}
	public void displayvehiclecolor()
	{
	System.out.println("The Vehicle color is "+color);
	}
	public static void main(String args[])
	{
		vehiclename vn=new vehiclename();
		vn.vname="Hero";
		vn.price=55000;
		vn.color="black";
		vn.displayvehiclename();
		vn.displayvehicleprice();
		vn.displayvehiclecolor();
		vn.vname="Suzuki";
		vn.price=85000;
		vn.color="red";
		vn.displayvehiclename();
		vn.displayvehicleprice();
		vn.displayvehiclecolor();
	}

}