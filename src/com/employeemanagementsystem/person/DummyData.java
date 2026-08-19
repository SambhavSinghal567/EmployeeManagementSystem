package com.employeemanagementsystem.person;

import com.employeemanagementsystem.admin.Admin;
import com.employeemanagementsystem.employee.Employee;
import com.employeemanagementsystem.employee.employeeleaveapplication.EmployeeLeaveApplication;
import com.employeemanagementsystem.login.LoginData;
import com.employeemanagementsystem.manager.Manager;
import com.employeemanagementsystem.person.enums.DepartmentType;
import com.employeemanagementsystem.person.enums.Gender;
import com.employeemanagementsystem.person.enums.Role;

public class DummyData {

    public static void loadPersonData() {
        LoginData.person.add(new Admin("sambhav", "admin@gmail.com", "12345678", 19, Gender.MALE));

        // Manager
        LoginData.person.add(new Manager("manager1", "tmanager@gmail.com", "12345678", 20, Gender.MALE, DepartmentType.TECHNICAL));
        LoginData.person.add(new Manager("manager2", "mmanager@gmail.com", "12345678", 20, Gender.MALE, DepartmentType.MARKETING));
        LoginData.person.add(new Manager("manager3", "smanager@gmail.com", "12345678", 20, Gender.MALE, DepartmentType.SALES));

        // Employee
        LoginData.person.add(new Employee("employee1", "jtemployee@gmail.com", "12345678", 21, Gender.MALE, DepartmentType.TECHNICAL, Role.JUNIOR));
        LoginData.person.add(new Employee("employee2", "stemployee@gmail.com", "12345678", 21, Gender.MALE, DepartmentType.TECHNICAL, Role.SPECIALIST));
        LoginData.person.add(new Employee("employee3", "jmemployee@gmail.com", "12345678", 21, Gender.MALE, DepartmentType.MARKETING, Role.JUNIOR));
        LoginData.person.add(new Employee("employee4", "smemployee@gmail.com", "12345678", 21, Gender.MALE, DepartmentType.MARKETING, Role.SPECIALIST));
        LoginData.person.add(new Employee("employee5", "jsemployee@gmail.com", "12345678", 21, Gender.MALE, DepartmentType.SALES, Role.JUNIOR));
        LoginData.person.add(new Employee("employee6", "ssemployee@gmail.com", "12345678", 21, Gender.MALE, DepartmentType.SALES, Role.SPECIALIST));
    }

    public static void loadLeaveApplicationData() {
        Employee.employeeLeaveApplicationsForTechnicalDepartment.add(new EmployeeLeaveApplication("employee1",Role.JUNIOR,3));
    }

}