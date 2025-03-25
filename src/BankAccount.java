public abstract class BankAccount {
    final private String accountNumber ;
    private String accountHolderName ;
    protected double balance ;

    public BankAccount(String accountNumber , String accountHolderName , double balance){
        this.accountNumber = accountNumber ;
        this.accountHolderName = accountHolderName ;
        this.balance = balance ;
    }

    public abstract void calculateInterest() ;

    public void deposit(double amount){
        if(amount > 0){
            this.balance += amount ;
            System.out.println("Amount " + amount + " was deposited into account number " + this.accountNumber ) ;
        }
        else{
            System.out.println("The deposit amount must be positive") ;
        }
    }

    public void withdraw(double amount){
        if((amount > 0) && (amount < this.balance)){
            this.balance -= amount ;
            System.out.println("Amount " + amount + " was withdrawn from account number " + this.accountNumber) ;
        }
        else if(amount > this.balance){
            System.out.println("Insufficient account balance") ;
        }
        else{
            System.out.println("The withdrawal amount cannot be negative") ;
        }
    }

    public double getBalance(){
        return this.balance ;
    }

    public String getAccountNumber(){
        return this.accountNumber ;
    }

    public String getAccountHolderName(){
        return this.accountHolderName ;
    }

}
