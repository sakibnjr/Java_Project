package Project_02;

import java.util.Scanner;
//All balance related calculation are in this class
public class Balance {


    Scanner input = new Scanner(System.in);
    long balance, debit, randomuser;
    //balance & debit for (total balance management)
    //randomuser used in (send money method)

    int choice; //for switching cases
    long number; //inputs mobile number for (mobile recharge method)
    int amount; //value for top up (mobile recharge method)
    String again; //takes input for (Y/N) cases

    public void deposit() { //controls Add Money method
        System.out.println("You have selected : (Add Money)");
        System.out.println("Enter amount you want to deposit : ");
        balance = input.nextLong();
        System.out.println("[Balance Added]");
        System.out.printf("[Your Current Balance is : %d TK]\n", balance);
    }

    public void sendmoney() { //controls Send Money method
        System.out.println("You have selected : (Send Money)");
        if (balance > 0) { //checks if balance is more than zero or not
            System.out.println("Enter Receiver A/C Number :");
            randomuser = input.nextLong();
            System.out.println("Enter amount : ");
            debit = input.nextLong();
            if (balance >= debit) { //checks if balance is more than input amount or not
                System.out.println("[A/C Number:" + randomuser + "]" + " " + "[Amount:" + debit + "]" + " Confirm? (Y/N)");
                again = input.next();
                if (again.equalsIgnoreCase("Y")) {
                    balance = balance - debit;
                    System.out.printf("\n[Transaction Completed, %d TK has been Sent]\n", debit);
                } else if (again.equalsIgnoreCase("N")) {
                    System.out.println("[Canceled]" + " " + "Returning to Main Menu");
//                    Login log = new Login();
//                    log.displayMenu();
                } else
                    System.out.println("Invalid Choice");
            } else
                System.out.println("Chosen amount is more than Balance!");
        } else {
            System.out.println("Insufficient Balance!");
        }
    }

    public void mobile_recharge() { //controls Mobile Recharge method
        System.out.println("You have selected : (Mobile Recharge)");
        if (balance > 0) { //checks if balance is more than zero or not
            System.out.println("Select Operator : ");
            System.out.println("*  [1] ==> Grameenphone   *");
            System.out.println("*  [2] ==> Robi           *");

            choice = input.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Enter phone number :");
                    number = input.nextLong();
                    System.out.println("Enter Amount : ");
                    amount = input.nextInt();
                    if (balance >= amount) { //checks if balance is more than input amount or not
                        System.out.println("[Number=" + number + "]" + " " + "[Amount=" + amount + "]" + " " + "Confirm? (Y/N)");
                        again = input.next();
                        if (again.equalsIgnoreCase("Y")) {
                            balance = balance - amount;
                            System.out.println("[Mobile Recharge Successful]");
                        } else if (again.equalsIgnoreCase("N")) {
                            System.out.println("[Canceled]" + " " + "Returning to Main Menu");
//                            Login log = new Login();
//                            log.displayMenu();
                        } else
                            System.out.println("Invalid Choice");
                    } else
                        System.out.println("Chosen amount is more than Balance!");
                    break;
                case 2:
                    System.out.println("Enter phone number :");
                    number = input.nextLong();
                    System.out.println("Enter Amount : ");
                    amount = input.nextInt();
                    if (balance >= amount) { //checks if balance is more than input amount or not
                        System.out.println("[Number=" + number + "]" + " " + "[Amount=" + amount + "]" + " " + "Confirm? (Y/N)");
                        again = input.next();
                        if (again.equalsIgnoreCase("Y")) {
                            balance = balance - amount;
                            System.out.println("[Mobile Recharge Successful]");
                        } else if (again.equalsIgnoreCase("N")) {
                            System.out.println("[Canceled]" + " " + "Returning to Main Menu");
//                            Login log = new Login();
//                            log.displayMenu();
                        } else
                            System.out.println("Invalid Choice");
                    } else
                        System.out.println("Chosen amount is higher than Balance!");
                    break;
                default:
                    break;
            }
        } else
            System.out.println("Insufficient Balance!");
    }

    public void payment() { //controls Payment method
        System.out.println("You have selected : (Payment)");
        if (balance > 0) { //checks if balance is more than zero or not
            System.out.println("*  [1] ==> Tuition Fees       *");
            System.out.println("*  [2] ==> Internet Bill      *");
            System.out.println("*  [3] ==> Electricity Bill   *");

            choice = input.nextInt();
            switch (choice) {
                case 1:
                    tuitionfee();
                    break;
                case 2:
                    System.out.println("Enter Amount: ");
                    amount = input.nextInt();
                    if (balance >= amount) { //checks if balance is more than input amount or not
                        balance = balance - amount;
                        System.out.println("[Payment Complete]");
                    } else
                        System.out.println("Chosen amount is more than Balance!");
                    break;
                case 3:
                    System.out.println("Enter Amount: ");
                    amount = input.nextInt();
                    if (balance >= amount) { //checks if balance is more than input amount or not
                        balance = balance - amount;
                        System.out.println("[Payment Done]");
                    } else
                        System.out.println("Chosen amount is more than Balance!");
                    break;
                default:
                    break;
            }
        } else
            System.out.println("Insufficient Balance!");
    }

    public void tuitionfee() { //controls extended functionality of Payment method
        if (balance > 0) { //checks if balance is more than zero or not
            System.out.println("Choose Option: ");
            System.out.println("*  [1] ==> DIU Semester fee    *");
            System.out.println("*  [2] ==> Hall fee            *");
            choice = input.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Enter Amount: ");
                    amount = input.nextInt();
                    if (balance >= amount) { //checks if balance is more than input amount or not
                        balance = balance - amount;
                        System.out.println("[Payment Done]");
                    } else
                        System.out.println("Chosen amount is more than Balance!");
                    break;
                case 2:
                    System.out.println("Enter Amount: ");
                    amount = input.nextInt();
                    if (balance >= amount) { //checks if balance is more than input amount or not
                        balance = balance - amount;
                        System.out.println("[Payment Complete]");
                    } else
                        System.out.println("Chosen amount is more than Balance!");
                    break;
            }
        }
    }


    public void cashout() { //controls Cash Out method
        System.out.println("You have selected : (Cash Out)");
        if (balance > 0) { //checks if balance is more than zero or not
            System.out.println("Enter Withdrawal Balance : ");
            debit = input.nextLong();
            if (balance >= debit) { //checks if balance is more than input amount or not
                balance = balance - debit;
                System.out.println("[Cash out Successful]");
            } else
                System.out.println("Chosen amount is more than Balance!");
        } else
            System.out.println("Insufficient Balance!");
    }

    public void check_balance() { //controls Check Balance method
        System.out.println("You have selected : (Check Balance)");
        System.out.printf("[Available Balance : %d TK]\n", balance);
    }


}
