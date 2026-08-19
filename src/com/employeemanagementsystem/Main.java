package com.employeemanagementsystem;

import com.employeemanagementsystem.admin.Admin;
import com.employeemanagementsystem.admin.AdminUI;
import com.employeemanagementsystem.employee.Employee;
import com.employeemanagementsystem.employee.EmployeeUI;
import com.employeemanagementsystem.employee.employeeleaveapplication.EmployeeLeaveApplicationService;
import com.employeemanagementsystem.login.LoginData;
import com.employeemanagementsystem.login.LoginUIService;
import com.employeemanagementsystem.login.UserStatus;
import com.employeemanagementsystem.manager.Manager;
import com.employeemanagementsystem.manager.ManagerService;
import com.employeemanagementsystem.manager.ManagerUI;
import com.employeemanagementsystem.person.DummyData;
import com.employeemanagementsystem.login.LoginUI;
import com.employeemanagementsystem.person.Profile;
import com.employeemanagementsystem.person.enums.PersonType;

public class Main {
   public static void main(String[] args) {
        DummyData.loadPersonData();
        DummyData.loadLeaveApplicationData();

       // System.out.println(Employee.employees);

        /*
        For employee, we are using their name for their unique identity,
        but later we can give each employee even managers and admins their unique code for them
         */

        LoginUI.greet();

        while (true) {
            LoginUI.formTypeUi();

            switch (LoginData.getFormTypeChoice()) {
                case 1:
                    LoginUI.signInUi();
                    LoginUIService.storePersonDataInLoginData();
                    LoginData.setUserStatus(UserStatus.LOGGED_IN);
                    LoginUI.signInGreet(LoginData.getFullName());
                    UIForPersonType();
                    break;
                case 2:
                    LoginUI.signUpUi();
                    LoginUIService.createPerson();
                    break;
                case 3:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Default Choice");
            }
        }
    }

    static void UIForPersonType() {

        while (true) {

            if(LoginData.getUserStatus() == UserStatus.LOGGED_OUT) {
                return;

            }

            switch (LoginData.getCompanyPosition()) {
                case PersonType.EMPLOYEE:
                    EmployeeUI.UIForEmployee();
                    UIForEmployeeChoice();
                    break;
                case PersonType.MANAGER:
                    ManagerUI.UIForManager();
                    UIForManagerChoice();
                    break;
                case PersonType.ADMIN:
                    AdminUI.UIforAdmin();
                    UIForAdminChoice();
                    break;
                default:
                    System.out.println("Default Choice");
            }

        }
    }

    static void UIForEmployeeChoice() {
            switch (Employee.getEmployeeChoice()) {
                case 1:
                    Profile.showProfile();
                    break;
                case 2:
                    EmployeeUI.UIForEmployeeLeaveApplication();
                    UIForEmployeeLeaveApplicationChoice();
                    break;
                case 3:
                    LoginData.setUserStatus(UserStatus.LOGGED_OUT);
                    break;
                default:
                    System.out.println("Default Choice");
        }
    }

    static void UIForEmployeeLeaveApplicationChoice() {
        switch (Employee.getEmployeeLeaveApplicationChoice()) {
            case 1:
                EmployeeUI.UIForEmployeeNewLeaveApplication();
                EmployeeLeaveApplicationService.createLeaveApplication();
                break;
                case 2:
                    EmployeeLeaveApplicationService.showEmployeeTheirLeaveApplications();
                    break;
                    case 3:
                        break;
                        default:
                            System.out.println("Default Choice");
        }
    }

    static void UIForManagerChoice() {
            switch (Manager.getManagerChoice()) {
                case 1:
                    Profile.showProfile();
                    break;
                case 2:
                    ManagerUI.UIForManagerToManageEmployee();
                    UIForManagerToManageEmployeeChoice();
                    break;
                case 3:
                    break;
                case 4:
                    LoginData.setUserStatus(UserStatus.LOGGED_OUT);
                    break;
                default:
                    System.out.println("Default Choice");
        }
    }

    static void UIForManagerToManageEmployeeChoice() {
        switch (Manager.getManagerToManageEmployeeChoice()) {
            case 1:
                ManagerService.viewEmployees();
                break;
                case 2:
                    ManagerService.viewEmployees();
                    ManagerUI.UIForManagerToManageEmployeeAction();
                    break;
                    case 3:
                        ManagerUI.UIForManagerToManageEmployeeLeaveApplications();
                        UIForManagerToManageEmployeeLeaveApplicationsChoice();
                        break;
                        case 4:
                            break;
                            default:
                                System.out.println("Default Choice");
        }
    }

    static void UIForManagerToManageEmployeeActionChoice(){
        switch (Manager.getManagerToManageEmployeeActionChoice()) {
            case 1:
                break;
                case 2:
                    break;
                    case 3:
                        break;
                        default:
                            System.out.println("Default Choice");
        }
    }

    static void UIForManagerToManageEmployeeLeaveApplicationsChoice() {
        switch (Manager.getManagerToManageEmployeeLeaveApplicationsChoice()) {
            case 1:
                ManagerService.showEmployeesLeaveApplications();
                break;
                case 2:
                    ManagerService.showEmployeesLeaveApplications();
                    ManagerUI.UIForManagerToManageEmployeeLeaveApplicationsAction();
                    UIForManagerToManageEmployeeLeaveApplicationsActionChoice();
                    break;
                    case 3:
                        break;
                        default:
                            System.out.println("Default Choice");
        }
    }

    static void UIForManagerToManageEmployeeLeaveApplicationsActionChoice() {
        switch (Manager.getManagerToManageEmployeeLeaveApplicationsActionChoice()) {
            case 1,2:ManagerUI.UIForManagerToManageEmployeeLeaveApplicationsActionAcceptOrReject();
                break;
                    case 3:
                        break;
                        default:
                            System.out.println("Default Choice");
        }
    }

    static void UIForAdminChoice() {
            switch (Admin.getAdminChoice()) {
                case 1:
                    Profile.showProfile();
                    break;
                case 2:
                    AdminUI.UIForAdminToManageStaff();
                    break;
                case 3:
                    break;
                case 4:
                    LoginData.setUserStatus(UserStatus.LOGGED_OUT);
                    break;
                default:
                    System.out.println("Default Choice");
        }
    }

}
