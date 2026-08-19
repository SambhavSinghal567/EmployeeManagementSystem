package com.employeemanagementsystem.admin;

import com.employeemanagementsystem.utility.Input;

public class AdminUIService {
    public static void checkValidAdminChoice(){
        int temp = Admin.getAdminChoice();
        while(temp<1||temp>4){
            System.out.println("Invalid Choice");
            System.out.print("CHOOSE: ");
            Admin.setAdminChoice(Input.inputInt());
            temp=Admin.getAdminChoice();
        }
    }

    public static void checkValidAdminToManageStaff(){
        int temp = Admin.getAdminToManageStaffChoice();
            while(temp<1||temp>5){
                System.out.println("Invalid Choice");
                System.out.print("CHOOSE: ");
                Admin.setAdminToManageStaffChoice(Input.inputInt());
                temp=Admin.getAdminToManageStaffChoice();
            }
    }

}
