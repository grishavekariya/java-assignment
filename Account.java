import java.util.*;

class Account
{
    private int id;
    private double balance;
    private double annualInterestRate;
    private Date dateCreated;
     public Account()
     {
        int id=0;
        double balance=0;
        double annualInterestRate=0;
     }

         public Account(int id,double balance)
         {
            this.id=id;
            this.balance=balance;
         }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public double getBalance() {
            return balance;
        }

        public void setBalance(double balance) {
            this.balance = balance;
        }

        public double getAnnualInterestRate() {
            return annualInterestRate;
        }

        public void setAnnualInterestRate(double annualInterestRate) {
            this.annualInterestRate = annualInterestRate;
        }

        public Date getDateCreated() {
            return dateCreated;
        }

        public void setDateCreated(Date dateCreated) {
            this.dateCreated = dateCreated;
        }

        public double getMonthlyInterestRate()
        {
            double result;
            result=((annualInterestRate/100)/12);
            return result;
        }

        public double getMonthlyInterest()
        {
            double getMonthlyInterest;
            getMonthlyInterest= balance*getMonthlyInterest();
            return getMonthlyInterest;
        }
        public void withdraw(double amount)
        {
            this.balance-=amount;
        }
        public void deposit(double amount)
        {
            this.balance+=amount;
            System.out.println("balance is: "+balance);
        }

        public String toString() 
	{
		return "\nAccount ID: " + id + "\nDate created: " + getDateCreated() + "\nBalance: $" + String.format("%.2f", balance);
	}
}
