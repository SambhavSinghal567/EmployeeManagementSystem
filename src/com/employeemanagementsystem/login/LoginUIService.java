package com.employeemanagementsystem.login;

import com.employeemanagementsystem.admin.Admin;
import com.employeemanagementsystem.employee.Employee;
import com.employeemanagementsystem.manager.Manager;
import com.employeemanagementsystem.person.Person;
import com.employeemanagementsystem.utility.Input;

public class LoginUIService {
    public  static boolean checkValidEmail(){
        return LoginData.getEmail().endsWith("@gmail.com");
    }
    public static boolean checkDuplicateEmail(){
        for(Person p : LoginData.person){
            return p.getPersonEmail().equals(LoginData.getEmail());
        }
        return false;
    }
    public static void checkEmailExists() {
        boolean found = false;

        while (!found) {
            for (Person p : LoginData.person) {
                if (p.getPersonEmail().equals(LoginData.getEmail())) {
                    found = true;
                    break;
                }
            }

            if (!found) {
                System.out.println("The email entered does not exist!");
                System.out.println("Enter your email: ");
                LoginData.setEmail(Input.inputString());
            }
        }
    }



    public static boolean checkValidPassword(){
        return LoginData.getPassword().length() >= 8 ;
    }
    public static boolean checkDuplicatePassword(){
        for(Person p : LoginData.person){
            return p.getPersonEmailPassword().equals(LoginData.getPassword());
        }
        return false;
    }

    public static void checkUser(){
        for(Person p : LoginData.person){
            int temp;
            if(!p.getPersonEmail().equals(LoginData.getEmail()) || !p.getPersonEmailPassword().equals(LoginData.getPassword())){
                System.out.println("User does not exist");
            }
        }
    }


    public static void emailCheckService(){
        boolean checkValidEmail = checkValidEmail();

        while(!checkValidEmail){
            System.out.println("Email entered is not valid");
            System.out.print("Enter your email: ");
            LoginData.setEmail(Input.inputString());
            checkValidEmail = checkValidEmail();
        }

        boolean  checkDuplicateEmail = checkDuplicateEmail();

        while(checkDuplicateEmail){
            System.out.println("Email already exists");
            System.out.print("Enter your email: ");
            LoginData.setEmail(Input.inputString());
            checkDuplicateEmail = checkDuplicateEmail();
        }
    }
   public static void passwordCheckService(){
        boolean checkValidPassword = checkValidPassword();
        while(!checkValidPassword){
            System.out.println("Password entered is not valid");
            System.out.print("Enter your password: ");
            LoginData.setPassword(Input.inputString());
            checkValidPassword = checkValidPassword();
        }

        boolean checkDuplicatePassword = checkDuplicatePassword();
        while(checkDuplicatePassword){
            System.out.println("Password already in exists");
            System.out.print("Enter your password: ");
            LoginData.setPassword(Input.inputString());
            checkDuplicatePassword = checkDuplicatePassword();
        }
    }

    public static void checkValidAge(){
        while(LoginData.getAge()<=15){
            System.out.println("Age entered is invalid");
            System.out.print("Enter your age: ");
            LoginData.setAge(Input.inputInt());
        }
    }

    public static void checkValidGenderChoice(){
        while(LoginData.getGenderChoice() !=1 && LoginData.getGenderChoice() != 2){
            System.out.println("The gender choice entered is invalid");
            System.out.print("CHOOSE: ");
            LoginData.setGenderChoice(Input.inputInt());
        }
    }

    public static void checkValidCompanyPositionChoice(){
        while(LoginData.getCompanyPositionChoice() !=1 && LoginData.getCompanyPositionChoice() != 2 && LoginData.getCompanyPositionChoice() != 3){
            System.out.println("The company position choice entered is invalid");
            System.out.print("CHOOSE: ");
            LoginData.setCompanyPositionChoice(Input.inputInt());
        }
    }

    public static void checkValidDepartmentPositionChoice(){
        while(LoginData.getDepartmentChoice() !=1 && LoginData.getDepartmentChoice() != 2 && LoginData.getDepartmentChoice() != 3){
            System.out.println("The department choice entered is invalid");
            System.out.print("CHOOSE: ");
            LoginData.setDepartmentChoice(Input.inputInt());
        }
    }

    public static void checkValidRoleChoice(){
        while(LoginData.getRoleChoice() !=1 && LoginData.getRoleChoice() != 2){
            System.out.println("The role choice entered is invalid");
            System.out.print("CHOOSE: ");
            LoginData.setRoleChoice(Input.inputInt());
        }
    }

    public static void checkValidFormTypeChoice(){
        while(LoginData.getFormTypeChoice() != 1 && LoginData.getFormTypeChoice() != 2){
            System.out.println("The form type choice entered is invalid");
            System.out.print("CHOOSE: ");
            LoginData.setFormTypeChoice(Input.inputInt());
        }
    }

    public static void storePersonDataInLoginData(){
        for(Person p : LoginData.person){
            if(p.getPersonEmail().equals(LoginData.getEmail())){
                LoginData.setLoginData(p);
            }
        }
    }

    public static void createPerson(){
        if(LoginData.getCompanyPositionChoice() == 1){
            LoginData.person.add(new Employee(LoginData.getFullName(), LoginData.getEmail(), LoginData.getPassword(), LoginData.getAge(), LoginData.getGender(),LoginData.getDepartment(),LoginData.getRole()));
        }else if(LoginData.getCompanyPositionChoice() == 2){
            LoginData.person.add(new Manager(LoginData.getFullName(), LoginData.getEmail(), LoginData.getPassword(), LoginData.getAge(), LoginData.getGender(),LoginData.getDepartment()));
        }else if(LoginData.getCompanyPositionChoice() == 3){
            LoginData.person.add(new Admin(LoginData.getFullName(), LoginData.getEmail(), LoginData.getPassword(), LoginData.getAge(), LoginData.getGender()));
        }
    }

}
