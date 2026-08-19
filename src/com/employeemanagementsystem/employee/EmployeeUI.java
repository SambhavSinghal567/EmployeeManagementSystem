package com.employeemanagementsystem.employee;

import com.employeemanagementsystem.utility.Input;

public class EmployeeUI {

    public static void UIForEmployee() {

        System.out.println("1.Open Profile");
        System.out.println("2.Apply For Leave");
        System.out.println("3.Logout");
        System.out.print("CHOOSE: ");
        Employee.setEmployeeChoice(Input.inputInt());
        EmployeeUIService.checkValidEmployeeChoice();

    }

    public static void UIForEmployeeLeaveApplication() {
        System.out.println("1.Apply New Leave Application");
        System.out.println("2.View Your Leave Application");
        System.out.println("3.Back");
        System.out.println("CHOOSE: ");
        Employee.setEmployeeLeaveApplicationChoice(Input.inputInt());
        EmployeeUIService.checkValidEmployeeLeaveApplicationChoice();
    }

    public static void UIForEmployeeNewLeaveApplication() {
        System.out.println("For how many days you want to Leave?");
        Employee.setLeaveDays(Input.inputInt());
        EmployeeUIService.checkValidEmployeeLeaveDays();
    }



}
