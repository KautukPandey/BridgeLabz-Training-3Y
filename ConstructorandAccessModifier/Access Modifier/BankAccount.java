public class BankAccount {
    public int accountNumber;
    protected String accountHolder;
    private double balance;

    BankAccount(int accountNumber, String accountHolder, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
        } else {
            System.out.println("Insufficient Balance!");
        }
    }

    public double getBalance() {
        return balance;
    }

    public void displayAccountDetails() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder: " + accountHolder);
        System.out.println("Balance: " + balance);
        System.out.println("--------------------");
    }

    public static void main(String[] args) {
        BankAccount acc1 = new BankAccount(1001, "Raj", 5000);
        acc1.displayAccountDetails();

        acc1.deposit(2000);
        acc1.withdraw(1000);
        System.out.println("Updated Balance: " + acc1.getBalance());

        SavingsAccount sa = new SavingsAccount(2001, "Meena", 8000, 5);
        sa.displaySavingsDetails();
    }
}

class SavingsAccount extends BankAccount {
    double interestRate;

    SavingsAccount(int accountNumber, String accountHolder, double balance, double interestRate) {
        super(accountNumber, accountHolder, balance);
        this.interestRate = interestRate;
    }

    public void displaySavingsDetails() {
        System.out.println("Savings Account Number: " + accountNumber);  
        System.out.println("Account Holder: " + accountHolder);          
        System.out.println("Interest Rate: " + interestRate + "%");
        System.out.println("--------------------");
    }
}
