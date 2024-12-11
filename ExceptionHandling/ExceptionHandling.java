package ExceptionHandling;

public class ExceptionHandling extends Exception {

    public ExceptionHandling(String msg){
        super(msg);
    }
}

class BankAccount {
    private double balance;

    public BankAccount(double balance){
        this.balance = balance;
    }

    public void withdraw(double amount) throws ExceptionHandling{
        if(amount >= balance){
            throw new ExceptionHandling("Insufficient balance");
        }
        balance -= amount;
        System.out.println("Withdraw successful " + balance);
    }
}

class BankAcc {
    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount(5000.0);

        try {
            bankAccount.withdraw(9000.0);
        } catch (ExceptionHandling e){
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Transaction completed");
        }
    }
}
