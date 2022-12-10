package Project_02;
//This in #Main Class, Code executes from here
public class Main {
    public static void main(String[] args) {
        Welcome screen = new Welcome(); //created Welcome class object, to call the constructor of Welcome class
        Login log = new Login(); ////created Login class object, to call the method of Login class

        log.registration_or_login(); //printing another screen from Login Class
        log.login_control(); //calling the method of Login class, for login & Registration

    }
}
