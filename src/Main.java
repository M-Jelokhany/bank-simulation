public class Main {
    public static void main(String[] args) {
        BankCustomers Bank = new BankCustomers();

        SavingsAccount aliSavingsAccount = new SavingsAccount("9439041717", "ali", 1000);
        SavingsAccount rezaSavingsAccount = new SavingsAccount("3984893142", "reza", 2000);
        SavingsAccount farhadSavingsAccount = new SavingsAccount("9384894939", "farhad", 1500);

        TransactionAccount vahidTransactionAccount = new TransactionAccount("3948934939", "vahid", 500);
        TransactionAccount hamidTransactionAccount = new TransactionAccount("9847791213", "hamid", 1000);
        TransactionAccount kazemTransactionAccount = new TransactionAccount("9804803425", "kazem", 300);

        Bank.addAccount(aliSavingsAccount);
        Bank.addAccount(rezaSavingsAccount);
        Bank.addAccount(farhadSavingsAccount);
        Bank.addAccount(vahidTransactionAccount);
        Bank.addAccount(hamidTransactionAccount);
        Bank.addAccount(kazemTransactionAccount);

        BankAccount aliFindAccount = Bank.findAccount("9439041717");
        BankAccount hashemFindAccount = Bank.findAccount("8958948492");

        System.out.println("Ali's savings account balance : " + farhadSavingsAccount.balance);
        farhadSavingsAccount.deposit(100);
        System.out.println("Farhad's savings account balance : " + farhadSavingsAccount.balance);
        System.out.println();

        kazemTransactionAccount.deposit(-4);
        System.out.println();

        rezaSavingsAccount.calculateInterest();
        System.out.println();
        hamidTransactionAccount.calculateInterest();
        System.out.println();
        System.out.println("Reza's savings account balance : " + rezaSavingsAccount.balance) ;
        System.out.println();
        System.out.println("Hamid's savings account balance : " + hamidTransactionAccount.balance) ;
        System.out.println();

        aliSavingsAccount.withdraw(200) ;
        rezaSavingsAccount.withdraw(2200) ;
        farhadSavingsAccount.withdraw(-100) ;
        vahidTransactionAccount.withdraw(200) ;
        hamidTransactionAccount.withdraw(1600) ;
        kazemTransactionAccount.withdraw(-300) ;
        System.out.println() ;

        Bank.showAllBalances() ;
    }
}