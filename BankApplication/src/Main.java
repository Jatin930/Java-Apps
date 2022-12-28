import java.util.*;
class Bank{
    public float balance;
    public  int pin = 2022;      // PRE-SET PIN NUMBER
    public float prevTran;

    public  void checkPin(){     // METHOD TO CHECK PIN
        System.out.println("Please Enter The Pin: ");
        Scanner scan = new Scanner(System.in);
        int pinIn = scan.nextInt();
        if (pinIn == pin){
            menu();
        }
        else
        {
            System.out.println("Wrong Pin Number, Please Try Again");
            checkPin();
        }

    }
    public void menu(){          //METHOD TO DISPLAY MENU
        System.out.println();
        System.out.println("===========================");
        System.out.println("Please Select An Option: ");
        System.out.println("1) Check Your Account Balance ");
        System.out.println("2) Make A Deposit ");
        System.out.println("3) Make A Withdrawal");
        System.out.println("4) View Previous Transaction ");
        System.out.println("5) Calculate Interest ");
        System.out.println("6) Exit Application ");
        System.out.println("===========================");
        System.out.println();
        Scanner scan = new Scanner(System.in);
        int opt = scan.nextInt();
        if (opt == 1){
            actbalance();
        } else if (opt == 2) {
            deposit();
        } else if (opt == 3) {
            withdrawal();
        } else if (opt == 4) {
            previousTrans();
        } else if (opt == 5) {
            calcInterest();
        } else if (opt == 6) {
            System.out.println("Thank You For Using This Application!");
            return;
        }
        else {
            System.out.println("Enter A Valid Option Number");
            menu();
        }
    }

    private void calcInterest() {     //METHOD TO CALCULATE THE INTEREST
        System.out.println("Enter The Number Of Years You Want To Calculate Your Interest For: ");
        Scanner scan = new Scanner(System.in);
        int years = scan.nextInt();
        double rate = 0.05;
        float interest = (float) (balance * rate * years);
        System.out.println("===========================");
        System.out.println("The Calculated Interest Is: " + interest);
        System.out.println("===========================");
        menu();
    }

    private void previousTrans() {     //METHOD TO SEE PREVIOUS TRANSACTION
        if (prevTran > 0)
        {
            System.out.println("Deposited: " + prevTran);
        }
        else if (prevTran < 0)
        {
            System.out.println("Withdrawn: " + Math.abs(prevTran));
        }
        else
        {
            System.out.println("No Transactions Occurred");
        }
        menu();
    }

    private void withdrawal() {     //METHOD TO WITHDRAW MONEY
        System.out.println("Enter The Amount You Would Like To Withdrawal: ");
        Scanner scan = new Scanner(System.in);
        float amount = scan.nextFloat();
        if (amount > balance){
            System.out.println("Your Account Balance Is Insufficient");
            System.out.println("Please Enter A Valid Amount To Withdraw");
            withdrawal();
        }
        else
        {
            balance = balance - amount;
            prevTran = -amount;
            System.out.println("===========================");
            System.out.println("Money Withdrawn Successfully");
            System.out.println("Your New Balance Is: " + balance);
            System.out.println("===========================");
        }
        System.out.println();
        menu();
    }

    private void deposit() {     //METHOD TO DEPOSIT MONEY
        System.out.println("Enter The Amount You Would Like To Deposit: ");
        Scanner scan = new Scanner(System.in);
        float amount = scan.nextFloat();
        if (amount > 0)
        {
            balance = balance + amount;
            prevTran = amount;
        }
        else
        {
            System.out.println("Please Deposit An Amount Greater Than 0");
            deposit();
        }
        System.out.println("===========================");
        System.out.println("Money Deposited Successfully");
        System.out.println("Your new balance is: " + balance);
        System.out.println("===========================");
        System.out.println();
        menu();
    }

    private void actbalance() {     //METHOD TO VIEW ACCOUNT BALANCE
        System.out.println("Your balance is: " + balance);
        if (balance == 0){
            System.out.println("just delete your acct bro");
        }
        System.out.println();
        menu();
    }


}
public class Main {
    public static void main(String[] args) {
        Bank obj = new Bank();
        System.out.println("Welcome!!!");
        obj.checkPin();

    }
}