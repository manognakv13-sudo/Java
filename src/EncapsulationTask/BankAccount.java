package EncapsulationTask;

public class BankAccount {

    private double balance = 40000.00;

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount){
        try {
            if (amount <= 0) {
                throw new ArithmeticException("deposit is too low");
            }
        }
        catch (Exception e){
            System.out.println(e);
        }
        System.out.println("the deposit is "+ balance);
        balance = balance +amount;
        System.out.println("the balance is "+ balance);
    }

    public void withdraw(double amount){
        try {
            if (balance < amount) {
                throw new ArithmeticException("the amount is too low");
            }
        }
        catch (Exception e){
            
        }
        System.out.println("the withdraw amount is :"+amount);
        System.out.println("the balance: ");
        balance = balance -amount;
        System.out.print( balance );
    }

    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount();
        System.out.println(bankAccount.getBalance());
        bankAccount.deposit(8900);
        System.out.println(bankAccount.getBalance());
        bankAccount.withdraw(90000);

    }




}
