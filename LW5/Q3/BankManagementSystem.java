package Q3;

public class BankManagementSystem {
    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount();
        bankAccount.deposit(10000);
        bankAccount.withdraw(4000);
        System.out.println("Current balance: " + bankAccount.getBalance());
    }
}
