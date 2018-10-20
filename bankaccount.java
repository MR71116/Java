class bankaccount
{
	String AccName;
	int Balance;
	int DepositAmt;
	int WithdrawlAmt;
	public void Balancedisplay()
	{
	System.out.println("The Current balance in the Account of "+AccName+ " is "+Balance);
	}
	public void Deposit(int amt)
	{
	this.DepositAmt=amt;
	System.out.println("The Deposited Amount in the Account of "+AccName+ " is "+DepositAmt);
	Balance+=DepositAmt;
	}
	public void Withdrawl(int amt)
	{
	this.WithdrawlAmt=amt;
	System.out.println("The Withdrawn Amount in the Account of "+AccName+ " is "+WithdrawlAmt);
	Balance-=WithdrawlAmt;	
	}
	public static void main(String args[])
	{
		bankaccount tr=new bankaccount();
		tr.AccName="Murali";	
		tr.Balance= 1000;		
		tr.Balancedisplay();		
		tr.Deposit(3500);
		tr.Balancedisplay();
		tr.Withdrawl(2500);
		tr.Balancedisplay();
	}
}