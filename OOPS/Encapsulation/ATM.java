package OOPS.Encapsulation;

public class ATM {

    private long amount;

    public ATM(long initialAmount){
        this.amount = initialAmount;
    }

    public double getBalance(String pin) {
        if (isValid(pin)) {
            return amount;
        } else {
            System.out.println("Invalid PIN. Access denied!");
            return 0.0;
        }
    }

    public void withdraw(String pin, long balance){
        if(isValid(pin)){
            if(amount > 0 && balance <= amount) {
                balance -= amount;
                System.out.println("Dispensed " + balance);
            } else {
                System.out.println("Insufficient fund : ");
            }
        } else {
            System.out.println("Access denied");
        }
    }

    public boolean isValid(String pin){
        if(pin.isEmpty() || pin.isBlank()){
            return false;
        }
        return "1234".equals(pin);
    }
}

class Machine{
    public static void main(String[] args) {
        ATM atm = new ATM(12000);
        atm.withdraw("1234",12000);
        System.out.println(atm.getBalance("1234"));
    }
}