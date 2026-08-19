package com.employeemanagementsystem.login;

import com.employeemanagementsystem.company.Company;
import com.employeemanagementsystem.utility.Input;

public final class LoginUI {

    public static void greet(){
        System.out.println("Welcome to "+ Company.getCompanyName());
    }

    //private static int formTypeChoice;

    public static void formTypeUi(){
        System.out.println("1.Sign In");
        System.out.println("2.Sign Up");
        System.out.println("3.Exit");
        System.out.print("CHOOSE: ");
         LoginData.setFormTypeChoice(Input.inputInt());
         LoginUIService.checkValidFormTypeChoice();
    }

    public static void signInUi(){//Fix here
        System.out.print("Enter your email: ");
         LoginData.setEmail(Input.inputString());
         LoginUIService.checkValidEmail();
         LoginUIService.checkEmailExists();

        System.out.print("Enter your password: ");
         LoginData.setPassword(Input.inputString());
         LoginUIService.checkValidPassword();

       //  LoginService.checkUser();

    }

    public static void signInGreet(String fullName){
        System.out.println("Welcome back "+ fullName);
    }


    public static void signUpUi(){
        System.out.print("Your full name: ");
         LoginData.setFullName(Input.inputString());

        System.out.print("Enter your email: ");
        LoginData.setEmail(Input.inputString());
        LoginUIService.emailCheckService();

        System.out.print("Enter your password: ");
        LoginData.setPassword(Input.inputString());
         LoginUIService.passwordCheckService();

        System.out.print("Enter your age: ");
        LoginData.setAge(Input.inputInt());
        LoginUIService.checkValidAge();

        System.out.println("What is your gender?");
        System.out.println("1. Male");
        System.out.println("2. Female");
        System.out.print("CHOOSE: ");
        LoginData.setGenderChoice(Input.inputInt());
        LoginUIService.checkValidGenderChoice();

        System.out.println("What is your position?");
        System.out.println("1.Employee");
        System.out.println("2.Manager");
        System.out.println("3.Admin");
        System.out.print("CHOOSE: ");
        LoginData.setCompanyPositionChoice(Input.inputInt());
        LoginUIService.checkValidCompanyPositionChoice();

         if(LoginData.getCompanyPositionChoice() == 1){
             System.out.println("What is your department?");
             System.out.println("1.Technical");
             System.out.println("2.Marketing");
             System.out.println("3.Sales");
             System.out.print("CHOOSE: ");
             LoginData.setDepartmentChoice(Input.inputInt());
             LoginUIService.checkValidDepartmentPositionChoice();

             System.out.println("What is your role?");
             System.out.println("1.Junior");
             System.out.println("2.Specialist");
             System.out.print("CHOOSE: ");
             LoginData.setRoleChoice(Input.inputInt());
             LoginUIService.checkValidRoleChoice();

             System.out.println("Thank you for registering!");

         }else if(LoginData.getCompanyPositionChoice() == 2){
             System.out.println("What is your department?");
             System.out.println("1.Technical");
             System.out.println("2.Marketing");
             System.out.println("3.Sales");
             System.out.print("CHOOSE: ");
             LoginData.setDepartmentChoice(Input.inputInt());
             LoginUIService.checkValidDepartmentPositionChoice();

             System.out.println("Thank you for registering!");

         }else if(LoginData.getCompanyPositionChoice() == 3){
             System.out.println("Thank you for registering!");
         }

        /*
        When a fresher will apply for any position in company,request will be sent as follows:-
        For Employee -> To Manager(of respective department)
        For Manager -> To Admin
         */

    }

}
