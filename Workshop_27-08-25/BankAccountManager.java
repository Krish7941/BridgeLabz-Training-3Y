import java.util.*;
public class BankAccountManager {
    public static void CheckBalance(double balance){
        System.out.println("Your balance is Rs. "+balance);
    }
    public static double deposits(double balance , double deposit){
        balance+=deposit;
        System.out.println("Your amount of Rs. "+deposit+" has been deposited in your account");
        return balance;
    }
    public static double withdraw(double balance , double w_d){
        if(balance<w_d){
            System.out.println("You don't have enough balance to withdraw your amount!!!");
            return 0;
        }else{
            balance-=w_d;
            System.out.println("You have withdrawn a amount of "+w_d);
            return balance;
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your bank account number : ");
        int Account = sc.nextInt();
        System.out.print("Enter your initial balance : ");
        double balance = sc.nextDouble();
        String cont = "";
        do {
            System.out.print("Enter D for depositing for amount , W for withdraw a amount and C for checking balance : ");
            String choice = sc.next();
            switch (choice) {
                case "D":
                    System.out.print("Enter your amount to be deposited : ");
                    double deposit = sc.nextDouble();
                    balance = deposits(balance, deposit);;
                    break;
                case "W":
                    System.out.print("Enter the amount to withdraw : ");
                    double w_d = sc.nextDouble();
                    balance=withdraw(balance, w_d);
                    break;
                case "C":
                    CheckBalance(balance);
                    break;
                default :
                    System.out.print("Enter a valid choice");
            }
            System.out.print("Do you want to continue (Y | N) : ");
            cont = sc.next();
        }while(!cont.equals("N"));
        System.out.print("Your current balance is : "+balance);
    }
}
