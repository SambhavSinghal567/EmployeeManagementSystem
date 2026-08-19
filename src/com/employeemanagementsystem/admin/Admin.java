package com.employeemanagementsystem.admin;

import com.employeemanagementsystem.person.enums.DepartmentType;
import com.employeemanagementsystem.person.enums.Gender;
import com.employeemanagementsystem.person.Person;
import com.employeemanagementsystem.person.enums.PersonType;
import com.employeemanagementsystem.person.enums.Role;

public class Admin extends Person {

    public Admin(String personName,String personEmail, String personEmailPassword, int personAge, Gender personGender ) {
        super(personName,personEmail, personEmailPassword, personAge, personGender,PersonType.ADMIN, DepartmentType.LEADERSHIP, Role.EXECUTIVE);
    }

    private static int adminChoice;
    private static int AdminToManageStaffChoice;


    public static int getAdminChoice() {
        return adminChoice;
    }

    public static void setAdminChoice(int adminChoice) {
        Admin.adminChoice = adminChoice;
    }

    public static int getAdminToManageStaffChoice() {
        return AdminToManageStaffChoice;
    }

    public static void setAdminToManageStaffChoice(int adminToManageStaffChoice) {
        AdminToManageStaffChoice = adminToManageStaffChoice;
    }
}
