package Project_02;

import java.util.Scanner;
//this class controls what user option will do
public class Control_Center{
    Balance cash = new Balance();
    //Created an object of Balance class,
    //reason: to call & use the methods of Balance Class
    Scanner input = new Scanner(System.in);
    int choice; //for switching cases
    String again; //takes input for (Y/N) cases

    public void admin() {
        choice = input.nextInt();
        switch (choice) {
            case 1:
                cash.deposit();
                System.out.println("Select Another Option : ");
                admin(); //to again use other options
                break;
            case 2:
                cash.sendmoney();
                System.out.println("Select Another Option : ");
                admin();
                break;
            case 3:
                cash.mobile_recharge();
                System.out.println("Select Another Option : ");
                admin();
                break;
            case 4:
                cash.payment();
                System.out.println("Select Another Option : ");
                admin();
                break;
            case 5:
                cash.cashout();
                System.out.println("Select Another Option : ");
                admin();
                break;
            case 6:
                cash.check_balance();
                System.out.println("Select Another Option : ");
                admin();
                break;
            case 7:
                //sign out clears all the data, so a user-friendly msg is displayed
                System.out.println("You have selected : (Sign Out)");
                System.out.println("[Caution!!!]");
                System.out.println("<All data will be erased>");
                System.out.println("Continue (Y/N)");
                again = input.next();
                if (again.equalsIgnoreCase("Y")) {
                    Login log = new Login();
                    log.registration_or_login();
                    log.login_control();
                } else if (again.equalsIgnoreCase("N")) {
                    System.out.println("Select Another Option : ");
                    admin();
                } else
                    System.out.println("[Invalid Choice]");
                break;
            case 8:
                System.out.println("You have selected : (Exit)");
                System.out.println("Terminating System...");
                System.exit(0); //terminates system
                break;
            default:
                break;
        }
    }
}
