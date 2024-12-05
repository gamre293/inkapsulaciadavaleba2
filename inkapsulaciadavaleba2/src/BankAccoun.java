import java.util.ArrayList;
import java.util.List;

public class BankAccoun {
    //1
//    private String accountHolderName;
//    private String accountNumber;
//    private List<String> transactionHistory;
//
//    public BankAccoun(String accountHolderName, String accountNumber) {
//        this.accountHolderName = accountHolderName;
//        this.accountNumber = accountNumber;
//        this.transactionHistory = new ArrayList<>();
//    }
//
//    public void addTransaction(String transaction) {
//        if (transaction != null) {
//            transactionHistory.add(transaction);
//        }
//    }
//
//    public void printTransactionHistory() {
//        System.out.println("Transaction History:");
//        for (String transaction : transactionHistory) {
//            if (transaction != null) {
//                System.out.println(transaction);
//            }
//        }
//    }

    //2
//    private String accountHolderName;
//    private String accountNumber;
//    private double balance;
//    private List<String> transactionHistory;
//
//    public BankAccoun(String accountHolderName, String accountNumber, double initialBalance) {
//        this.accountHolderName = accountHolderName;
//        this.accountNumber = accountNumber;
//        this.balance = initialBalance;
//        this.transactionHistory = new ArrayList<>();
//    }
//
//    public void addTransaction(String transaction) {
//        if (transaction != null) {
//            transactionHistory.add(transaction);
//        }
//    }
//
//    public boolean transferMoney(BankAccoun targetAccount, double amount) {
//        if (amount <= 0) {
//            System.out.println("Transfer amount must be positive.");
//            return false;
//        }
//        if (amount > 1000) {
//            System.out.println("Transfer amount exceeds the $1000 limit.");
//            return false;
//        }
//        if (amount > this.balance) {
//            System.out.println("Insufficient balance for the transfer.");
//            return false;
//        }
//
//        this.balance -= amount;
//        targetAccount.balance += amount;
//
//        String outgoingTransaction = "Transferred $" + amount + " to account " + targetAccount.accountNumber;
//        String incomingTransaction = "Received $" + amount + " from account " + this.accountNumber;
//
//        this.addTransaction(outgoingTransaction);
//        targetAccount.addTransaction(incomingTransaction);
//
//        System.out.println("Transfer successful: $" + amount + " transferred to " + targetAccount.accountHolderName);
//        return true;
//    }
//
//    public void printTransactionHistory() {
//        System.out.println("Transaction History for " + accountHolderName + ":");
//        for (String transaction : transactionHistory) {
//            if (transaction != null) { // Skip null values
//                System.out.println(transaction);
//            }
//        }
//    }
//
//    public double getBalance() {
//        return balance;
//    }

    //3
//    private String accountHolderName;
//    private String accountNumber;
//    private double balance;
//    private boolean accountLock;
//    private List<String> transactionHistory;
//
//    public BankAccoun(String accountHolderName, String accountNumber, double initialBalance) {
//        this.accountHolderName = accountHolderName;
//        this.accountNumber = accountNumber;
//        this.balance = initialBalance;
//        this.accountLock = false;
//        this.transactionHistory = new ArrayList<>();
//    }
//
//    public void addTransaction(String transaction) {
//        if (transaction != null) {
//            transactionHistory.add(transaction);
//        }
//    }
//
//    public void lockAccount() {
//        accountLock = true;
//        System.out.println("Account locked for " + accountHolderName);
//    }
//
//    public void unlockAccount() {
//        accountLock = false;
//        System.out.println("Account unlocked for " + accountHolderName);
//    }
//
//    public boolean transferMoney(BankAccoun targetAccount, double amount) {
//        if (accountLock) {
//            System.out.println("Account is locked. Transaction cannot be processed.");
//            return false;
//        }
//
//        if (amount <= 0) {
//            System.out.println("Transfer amount must be positive.");
//            return false;
//        }
//        if (amount > 1000) {
//            System.out.println("Transfer amount exceeds the $1000 limit.");
//            return false;
//        }
//        if (amount > this.balance) {
//            System.out.println("Insufficient balance for the transfer.");
//            return false;
//        }
//
//        this.balance -= amount;
//        targetAccount.balance += amount;
//
//        String outgoingTransaction = "Transferred $" + amount + " to account " + targetAccount.accountNumber;
//        String incomingTransaction = "Received $" + amount + " from account " + this.accountNumber;
//
//        this.addTransaction(outgoingTransaction);
//        targetAccount.addTransaction(incomingTransaction);
//
//        System.out.println("Transfer successful: $" + amount + " transferred to " + targetAccount.accountHolderName);
//        return true;
//    }
//
//    public void printTransactionHistory() {
//        if (accountLock) {
//            System.out.println("Account is locked. Cannot display transaction history.");
//            return;
//        }
//
//        System.out.println("Transaction History for " + accountHolderName + ":");
//        for (String transaction : transactionHistory) {
//            if (transaction != null) {
//                System.out.println(transaction);
//            }
//        }
//    }
//
//    public double getBalance() {
//        return balance;
//    }

    //4
//    private String accountHolderName;
//    private String accountNumber;
//    private double balance;
//    private boolean accountLock;
//    private List<String> transactionHistory;
//
//    public BankAccoun(String accountHolderName, String accountNumber, double initialBalance) {
//        this.accountHolderName = accountHolderName;
//        this.accountNumber = accountNumber;
//        this.balance = initialBalance;
//        this.accountLock = false;
//        this.transactionHistory = new ArrayList<>();
//    }
//
//    public void addTransaction(String transaction) {
//        if (transaction != null) {
//            transactionHistory.add(transaction);
//        }
//    }
//
//    public double depositCalculator(double amount, int months) {
//        if (accountLock) {
//            System.out.println("Account is locked. Cannot calculate deposit.");
//            return 0.0;
//        }
//
//        if (amount <= 0 || months <= 0) {
//            System.out.println("Invalid input. Amount and months must be positive.");
//            return 0.0;
//        }
//
//        double finalAmount = amount;
//        for (int i = 0; i < months; i++) {
//            finalAmount += finalAmount * 0.01;
//        }
//        return finalAmount;
//    }
}
