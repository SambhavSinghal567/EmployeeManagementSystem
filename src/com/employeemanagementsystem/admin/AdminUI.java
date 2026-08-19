package com.employeemanagementsystem.admin;

import com.employeemanagementsystem.manager.Manager;
import com.employeemanagementsystem.utility.Input;

public class AdminUI {

    public static void UIforAdmin(){
        System.out.println("1.Open Profile");
        System.out.println("2.Manage Staff");
        System.out.println("3.View Activity");
        System.out.println("4.Logout");
        System.out.print("CHOOSE: ");
        Admin.setAdminChoice(Input.inputInt());
        AdminUIService.checkValidAdminChoice();
    }

    public static void UIForAdminToManageStaff(){
        System.out.println("1.View Staff");
        System.out.println("2.Remove Manager");
        System.out.println("3.Promote/Remove Employee");
        System.out.println("4.View Leave Applications");
        System.out.println("5.Back");
        System.out.println("CHOOSE: ");
        Admin.setAdminToManageStaffChoice(Input.inputInt());
        AdminUIService.checkValidAdminToManageStaff();
    }

}
