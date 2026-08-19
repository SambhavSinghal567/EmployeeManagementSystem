package com.employeemanagementsystem.manager;

import com.employeemanagementsystem.employee.Employee;
import com.employeemanagementsystem.employee.employeeleaveapplication.EmployeeLeaveApplication;
import com.employeemanagementsystem.login.LoginData;
import com.employeemanagementsystem.utility.Input;

public class ManagerUIService {
    public static void checkValidManagerChoice(){
        int temp = Manager.getManagerChoice();
        while(temp<1||temp>4){
            System.out.println("Invalid Choice");
            System.out.print("CHOOSE: ");
            Manager.setManagerChoice(Input.inputInt());
            temp=Manager.getManagerChoice();
        }
    }

    public static void checkValidManagerToManageEmployee(){
        int temp = Manager.getManagerToManageEmployeeChoice();
        while(temp<1||temp>4){
            System.out.println("Invalid Choice");
            System.out.print("CHOOSE: ");
            Manager.setManagerToManageEmployeeChoice(Input.inputInt());
            temp=Manager.getManagerToManageEmployeeChoice();
        }
    }





}
