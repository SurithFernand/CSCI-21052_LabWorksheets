package Q3;

public class BankAccount {
    private double balance;

    public BankAccount() {
        this.balance = 0.0;
    }

    public void deposit(double depositMoney){
        System.out.println(depositMoney + " has been deposited to the account.");
        balance += depositMoney;
        System.out.println("New balance is " + balance);
    }

    public void withdraw(double withdrawMoney){
        if (withdrawMoney<=balance){
            balance -= withdrawMoney;
            System.out.println(withdrawMoney + " has been withdrawn from the account.");
            System.out.println("New balance is " + balance);
        }else {
            System.out.println("Insufficient balance to withdraw money");
        }
    }

    public double getBalance(){
        return balance;
    }

}
