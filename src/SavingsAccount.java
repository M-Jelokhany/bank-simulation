public class SavingsAccount extends BankAccount {
    private final double interestRate = 0.03 ;

    public SavingsAccount(String accountNumber, String accountHolderName, double initialBalance){
        super(accountNumber , accountHolderName , initialBalance) ;
    }

    @Override
    public void calculateInterest() {
        System.out.println("Interest on savings account with account number " + this.getAccountNumber() + " was calculated in the amount of " + balance * interestRate) ;
        this.deposit(balance * interestRate) ;
    }
}
