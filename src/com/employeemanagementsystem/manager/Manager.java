package com.employeemanagementsystem.manager;

import com.employeemanagementsystem.person.enums.DepartmentType;
import com.employeemanagementsystem.person.enums.Gender;
import com.employeemanagementsystem.person.Person;
import com.employeemanagementsystem.person.enums.PersonType;
import com.employeemanagementsystem.person.enums.Role;

public class Manager extends Person {

    public Manager(String personName,String personEmail, String personEmailPassword, int personAge,  Gender personGender, DepartmentType departmentType ) {
        super(personName,personEmail, personEmailPassword, personAge,  personGender,PersonType.MANAGER, departmentType, Role.SENIOR);
    }

    private static int managerChoice;
    private static int managerToManageEmployeeChoice;
    private static int managerToManageEmployeeLeaveApplicationsChoice;
    private static int managerToManageEmployeeLeaveApplicationsActionChoice;
    private static String leaveApplicantName;
    private static int managerToManageEmployeeActionChoice;


    public static int getManagerChoice() {
        return managerChoice;
    }

    public static void setManagerChoice(int managerChoice) {
        Manager.managerChoice = managerChoice;
    }

    public static int getManagerToManageEmployeeChoice() {
        return managerToManageEmployeeChoice;
    }

    public static void setManagerToManageEmployeeChoice(int managerToManageEmployeeChoice) {
        Manager.managerToManageEmployeeChoice = managerToManageEmployeeChoice;
    }


    public static int getManagerToManageEmployeeLeaveApplicationsChoice() {
        return managerToManageEmployeeLeaveApplicationsChoice;
    }

    public static void setManagerToManageEmployeeLeaveApplicationsChoice(int managerToManageEmployeeLeaveApplicationsChoice) {
        Manager.managerToManageEmployeeLeaveApplicationsChoice = managerToManageEmployeeLeaveApplicationsChoice;
    }

    public static int getManagerToManageEmployeeLeaveApplicationsActionChoice() {
        return managerToManageEmployeeLeaveApplicationsActionChoice;
    }

    public static void setManagerToManageEmployeeLeaveApplicationsActionChoice(int managerToManageEmployeeLeaveApplicationsActionChoice) {
        Manager.managerToManageEmployeeLeaveApplicationsActionChoice = managerToManageEmployeeLeaveApplicationsActionChoice;
    }

    public static String getLeaveApplicantName() {
        return leaveApplicantName;
    }

    public static void setLeaveApplicantName(String leaveApplicantName) {
        Manager.leaveApplicantName = leaveApplicantName;
    }

    public static int getManagerToManageEmployeeActionChoice() {
        return managerToManageEmployeeActionChoice;
    }

    public static void setManagerToManageEmployeeActionChoice(int managerToManageEmployeeActionChoice) {
        Manager.managerToManageEmployeeActionChoice = managerToManageEmployeeActionChoice;
    }
}
