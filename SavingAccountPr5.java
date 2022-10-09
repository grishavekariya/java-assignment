public class SavingAccountPr5 extends Account 
{
	public SavingAccountPr5() 
	{
		super();
	}

	public SavingAccountPr5(int id, double balance) 
	{
		super(id, balance);
	}

	public void withdraw(double amount) 
	{
		if (amount < getBalance()) 
		{
			setBalance(getBalance() - amount);
		}
		else
		{
			System.out.println("Error! Savings account overdrawn transaction rejected");
		}
	}
}
