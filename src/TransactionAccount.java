public class TransactionAccount extends BankAccount {
    private final double overDraftLimit = 500 ;

    public TransactionAccount (String accountHolderName , String accountNumber , double initialBalance){
        super(accountHolderName , accountNumber , initialBalance) ;
    }

    @Override
    public void calculateInterest(){
        System.out.println("There is no interest for this account") ;
    }

    @Override
    public void withdraw (double amount){
        if((amount > 0) && (amount <= balance + overDraftLimit) ){
            this.balance -= amount ;
            System.out.println("Amount " + amount + " was withdrawn from account number " + this.getAccountNumber()) ;
        }
        else if(amount > balance + overDraftLimit){
            System.out.println("Insufficient account balance") ;
        }
        else{
            System.out.println("The withdrawal amount cannot be negative") ;
        }
    }
}
