package com.employeemanagementsystem.employee;

import com.employeemanagementsystem.utility.Input;

public class EmployeeUIService {
    public static void checkValidEmployeeChoice() {
        int temp = Employee.getEmployeeChoice();
        while(temp<1||temp>3) {
            System.out.println("Invalid Choice");
            System.out.print("CHOOSE: ");
            Employee.setEmployeeChoice(Input.inputInt());
            temp=Employee.getEmployeeChoice();
        }
    }

    public static void checkValidEmployeeLeaveApplicationChoice(){
        int temp = Employee.getEmployeeLeaveApplicationChoice();
        while(temp<1||temp>3) {
            System.out.println("Invalid Choice");
            System.out.print("CHOOSE: ");
            Employee.setEmployeeLeaveApplicationChoice(Input.inputInt());
            temp=Employee.getEmployeeLeaveApplicationChoice();
        }
    }

    public static void checkValidEmployeeLeaveDays(){
        int temp = Employee.getLeaveDays();
        while(temp>0){
            System.out.println("Invalid");
            Employee.setLeaveDays(Input.inputInt());
            temp=Employee.getLeaveDays();
        }
    }

}
