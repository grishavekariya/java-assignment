public class PracticalMain_1 {
    public static void main(String[] args) {
        Account obj= new Account(10,20000);
        obj.setAnnualInterestRate(5);

        System.out.println("Account id:"+obj.getId());
        System.out.println("balance :"+obj.getBalance());
        System.out.println("Annual interest rate:"+obj.getAnnualInterestRate());

        obj.deposit(1000);
        System.out.println("prepared by 21CE153_grisha");
    }
}
