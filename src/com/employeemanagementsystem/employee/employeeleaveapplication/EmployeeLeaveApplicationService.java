package com.employeemanagementsystem.employee.employeeleaveapplication;

import com.employeemanagementsystem.employee.Employee;
import com.employeemanagementsystem.login.LoginData;
import com.employeemanagementsystem.person.enums.DepartmentType;

public class EmployeeLeaveApplicationService {

    public static void createLeaveApplication() {

        if(LoginData.getDepartment() == DepartmentType.TECHNICAL){
            Employee.employeeLeaveApplicationsForTechnicalDepartment.add(new EmployeeLeaveApplication(LoginData.getFullName(),LoginData.getRole(),Employee.getLeaveDays()));
        }else if(LoginData.getDepartment() == DepartmentType.MARKETING){
            Employee.employeeLeaveApplicationsForMarketingDepartment.add(new EmployeeLeaveApplication(LoginData.getFullName(),LoginData.getRole(),Employee.getLeaveDays()));
        }else if(LoginData.getDepartment() == DepartmentType.SALES){
            Employee.employeeLeaveApplicationsForSalesDepartment.add(new EmployeeLeaveApplication(LoginData.getFullName(),LoginData.getRole(),Employee.getLeaveDays()));
        }

    }

    public static void showEmployeeTheirLeaveApplications() {
        for(EmployeeLeaveApplication applicant : Employee.leaveApplicationsForDepartment.get(LoginData.getDepartment())){
            if(LoginData.getFullName().equals(applicant.getEmployeeName())){
                System.out.println("1. "+applicant.getEmployeeName()+" "+applicant.getEmployeeRole()+" "+applicant.getLeaveDays()+" "+applicant.getEmployeeLeaveApplicationStatus());
            }
        }
    }

}
