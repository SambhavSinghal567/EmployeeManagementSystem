package com.employeemanagementsystem.manager;


import com.employeemanagementsystem.utility.Input;

public class ManagerUI {

    public static void UIForManager(){
        System.out.println("1.Open Profile");
        System.out.println("2.Manage Employee");
        System.out.println("3.Apply For Leave");
        System.out.println("4.Logout");
        System.out.print("CHOOSE: ");
        Manager.setManagerChoice(Input.inputInt());
        ManagerUIService.checkValidManagerChoice();
    }

    public static void UIForManagerToManageEmployee(){
        System.out.println("1.View Employees");
        System.out.println("2.Promote/Remove Employee");
        System.out.println("3.Manage Employees Leave Applications");
        System.out.println("4.Back");
        System.out.print("CHOOSE: ");
        Manager.setManagerToManageEmployeeChoice(Input.inputInt());
        ManagerUIService.checkValidManagerToManageEmployee();

    }

    public static void UIForManagerToManageEmployeeAction(){
        System.out.println("1.Promote");
        System.out.println("2.Remove");
        System.out.println("3.Back");
        System.out.print("CHOOSE: ");
        Manager.setManagerToManageEmployeeActionChoice(Input.inputInt());
    }

    public static void UIForManagerToManageEmployeeLeaveApplications(){
        System.out.println("1.View Leave Applications");
        System.out.println("2.Accept/Reject Leave Application");
        System.out.println("3.Back");
        System.out.print("CHOOSE: ");
        Manager.setManagerToManageEmployeeLeaveApplicationsChoice(Input.inputInt());
    }

    public static void UIForManagerToManageEmployeeLeaveApplicationsAction(){
        System.out.println("1.Accept");
        System.out.println("2.Reject");
        System.out.println("3.Back");
        System.out.println("CHOOSE: ");
        Manager.setManagerToManageEmployeeLeaveApplicationsActionChoice(Input.inputInt());

    }

    public static void UIForManagerToManageEmployeeLeaveApplicationsActionAcceptOrReject(){
        while(Manager.getLeaveApplicantName().equals("e")){}
        System.out.print("Write Name(type 'e' for exit): ");
        Manager.setManagerToManageEmployeeLeaveApplicationsActionChoice(Input.inputInt());
        ManagerService.employeeLeaveApplicationStatusUpdate();
    }


}
