import java.io.*;
class Bank {
private String name;

Bank(String name) {
this.name = name;
}
public String getBankName() 
{
    return this.name;
}
}
class Employee {

private String name;
Employee(String name) {
this.name = name;
}

public String getEmployeeName() {
    return this.name;
}
}
class Practical_12 {

public static void main(String[] args) {

Bank bank = new Bank("SBI");
Employee emp = new Employee("GRISHA");
System.out.println(emp.getEmployeeName()+ " is employee of "+ bank.getBankName());
 System.out.println("\nprepared by 21CE153_grisha");
}
}
