import java.util.ArrayList ;

public class BankCustomers {
    private ArrayList<BankAccount> accountsList = new ArrayList<>() ;

    public void addAccount(BankAccount account){
        accountsList.add(account) ;
    }

    public void showAllBalances(){
        for(BankAccount x : accountsList){
            System.out.println("Account number : " + x.getAccountNumber()) ;
            System.out.println("Account holder name : " + x.getAccountHolderName()) ;
            System.out.println("Account balance : " + x.getBalance()) ;
            System.out.println("-----------------------------------") ;
        }
    }

    public BankAccount findAccount(String accountNumber) {
        for (BankAccount x : accountsList) {
            if (x.getAccountNumber().equals(accountNumber)) {
                System.out.println("Account number : " + x.getAccountNumber()) ;
                System.out.println("Account holder name : " + x.getAccountHolderName()) ;
                System.out.println("Account balance : " + x.getBalance()) ;
                System.out.println() ;
                return x ;
            }
        }
        System.out.println("No account with this account number was found") ;
        System.out.println() ;
        return null ;
    }
}
