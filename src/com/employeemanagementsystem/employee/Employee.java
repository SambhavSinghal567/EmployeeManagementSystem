package com.employeemanagementsystem.employee;

import com.employeemanagementsystem.employee.employeeleaveapplication.EmployeeLeaveApplication;
import com.employeemanagementsystem.login.LoginData;
import com.employeemanagementsystem.person.enums.DepartmentType;
import com.employeemanagementsystem.person.enums.Gender;
import com.employeemanagementsystem.person.Person;
import com.employeemanagementsystem.person.enums.PersonType;
import com.employeemanagementsystem.person.enums.Role;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Employee extends Person {

    public Employee(String personName,String personEmail, String personEmailPassword, int personAge, Gender personGender, DepartmentType departmentType, Role personRole ) {
        super(personName,personEmail, personEmailPassword, personAge,personGender ,PersonType.EMPLOYEE , departmentType, personRole);
    }

    private static int employeeChoice;

    public static int getEmployeeChoice() {
        return employeeChoice;
    }

    public static void setEmployeeChoice(int employeeChoice) {
        Employee.employeeChoice = employeeChoice;
    }

    private static int employeeLeaveApplicationChoice;

    public static int getEmployeeLeaveApplicationChoice() {
        return employeeLeaveApplicationChoice;
    }

    public static void setEmployeeLeaveApplicationChoice(int employeeLeaveApplicationChoice) {
        Employee.employeeLeaveApplicationChoice = employeeLeaveApplicationChoice;
    }

    public static List<EmployeeLeaveApplication> employeeLeaveApplicationsForTechnicalDepartment = new ArrayList<>();
    public static List<EmployeeLeaveApplication> employeeLeaveApplicationsForMarketingDepartment = new ArrayList<>();
    public static List<EmployeeLeaveApplication> employeeLeaveApplicationsForSalesDepartment =  new ArrayList<>();

    private static int leaveDays;

    public static int getLeaveDays() {
        return leaveDays;
    }

    public static void setLeaveDays(int leaveDays) {
        Employee.leaveDays = leaveDays;
    }

    public static Map<DepartmentType, List<EmployeeLeaveApplication>> leaveApplicationsForDepartment = new HashMap<>(Map.ofEntries(
            Map.entry(DepartmentType.TECHNICAL, employeeLeaveApplicationsForTechnicalDepartment),
        Map.entry(DepartmentType.MARKETING, employeeLeaveApplicationsForMarketingDepartment),
        Map.entry(DepartmentType.SALES, employeeLeaveApplicationsForSalesDepartment)
    ));

    public static List<Employee> employees = LoginData.person.stream()
            .filter(x->x instanceof Employee)
            .map(Employee.class::cast)
            .collect(Collectors.toList());

}
