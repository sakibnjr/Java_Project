package Project_02;

import java.util.Scanner;
//this class contains login functionality, registration system.
public class Login {
    Scanner input = new Scanner(System.in);
    int choice; //for switching cases

    String pin; //default user pin

    String firstname, lastname, gender,PIN; //variable for registration
    long NID; //store nid number

    public void register() { //for registering a new user
        System.out.println("Registration Processing. . .");
        System.out.println("Enter your First Name : ");
        firstname = input.next();
        System.out.println("Enter your Last Name : ");
        lastname = input.next();
        System.out.println("Enter your Gender : ");
        gender = input.next();
        System.out.println("Enter your NID Number : ");
        NID = input.nextLong();
        System.out.println("Set PIN Code : ");
        PIN = input.next();
        System.out.println("\n" + "[New User Registered]" + "\n");
        registration_or_login(); //returns to register/login page
        login_control(); //method for login
    }

    public void login() { //check if username & password match or not
        for (int i = 1; i <= 3; i++) {
            pin = input.next();
            if (pin.equals("00115") || pin.equals(PIN)) {
                displayMenu(); //display user options
                System.out.println("Enter Your Choice : ");
                Control_Center manage = new Control_Center();
                manage.admin(); //controls what the option will do
            } else if (i <= 2) {
                System.out.println("Wrong PIN, Try Again. . .!");
            }
        }
        //if a user inputs pin wrong for three times, then...
        System.out.println("You have tried three times!");
        System.out.println("[Account Locked]");
        System.exit(0);
    }

    public void login_control() { //login method, controls login/registration functionality
        System.out.println("\n" + "Enter Your Choice : ");
        try { //stored in try catch block, cause user can type char value instead of any integer
            choice = input.nextInt();
        } catch (Exception x) { //if user inputs a char, then it will catch an exception & close program
            System.out.println(x + " Found!");
            System.out.println("Exiting. . .");
        } finally { // runs rest of the code
            if (choice <= 3) { //user can enter pin 3 time, more than 3, will block user account
                switch (choice) {
                    case 1:
                        System.out.println("Signing In. . .");
                        System.out.println("Enter PIN Number : ");
                        login(); //enters login method
                        break;
                    case 2:
                        register(); //enters register method
                        break;
                    case 3:
                        System.out.println("You have selected : (Exit)");
                        System.out.println("Terminating System...");
                        System.exit(0); //terminate system
                        break;
                    default:
                        break;
                }
            } else if (choice > 3) { //if user-input is more than 3, then the method will run again
                System.out.println("Invalid Choice, Try Again-");
                login_control();
            }
        }
    }

    public void registration_or_login() { //display main options
        System.out.println("*                 [1] ==> Sign In                    *");
        System.out.println("*                 [2] ==> Register                   *");
        System.out.println("*                 [3] ==> Exit                       *");
    }

    public void displayMenu() { //display user options
        System.out.println("*                 -----------------                  *");
        System.out.printf("*                 -< Hello %s >-                  *\n", firstname);
        System.out.println("*                 -----------------                  *");
        System.out.println("*                 [1] ==> Add Money                  *");
        System.out.println("*                 [2] ==> Send Money                 *");
        System.out.println("*                 [3] ==> Mobile Recharge            *");
        System.out.println("*                 [4] ==> Payment                    *");
        System.out.println("*                 [5] ==> Cash Out                   *");
        System.out.println("*                 [6] ==> Check Balance              *");
        System.out.println("*                 [7] ==> Sign Out                   *");
        System.out.println("*                 [8] ==> Exit                       *");
    }
}
