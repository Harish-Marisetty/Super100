import java.util.Scanner;

public class BankAccount3 {
    private String accountHolder;
    private int accountNo;
    private double balance;
    private Scanner sc; //= new Scanner(System.in);

    public BankAccount3(String accountHolder, int accountNo, int balance) {
        this.accountHolder = accountHolder;
        this.accountNo = accountNo;
        this.balance = balance;
        this.sc = new Scanner(System.in);
    }

    private boolean isMatched(String enteredName, int enterActNum) {
        return accountHolder.equals(enteredName) && accountNo == enterActNum;
    }

    public void displayBalance() {
        System.out.println(balance);
    }

    public void withdraw() {
        System.out.println("Enter the amount");
        double amt = sc.nextDouble();
        if (amt > 0 && amt <= balance) {
            balance -= amt;
            System.out.println("Withdrawal successful. New balance: " + balance);
        } else {
            System.out.println("Insufficient funds or invalid amount");
        }
    }

    public void deposit() {
        System.out.println("Enter the amount ");
        double depositAmt = sc.nextDouble();
        if (depositAmt > 0) {
            balance += depositAmt;
            System.out.println("Your deposit is successful.\nCurrent balance: " + balance);
        } else {
            System.out.println("Invalid amount");
        }
    }

    public void service(int choice) {
        switch (choice) {
            case 1:
                displayBalance();
                break;
            case 2:
                withdraw();
                break;
            case 3:
                deposit();
                break;
            default:
                System.out.println("Invalid choice");
                break;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BankAccount3 myAccount = new BankAccount3("SuryaBhai", 998877, 6969);
        System.out.println("Enter your name");
        String enteredName = sc.nextLine();
        System.out.println("Enter the account number");
        int enterActNum = sc.nextInt();
        if (myAccount.isMatched(enteredName, enterActNum)) {
            System.out.println("Enter your service\n1. Display Balance\n2. Withdraw\n3. Deposit");
            int choice = sc.nextInt();
            myAccount.service(choice);
        } else {
            System.out.println("Invalid bank details");
        }
    }
}
