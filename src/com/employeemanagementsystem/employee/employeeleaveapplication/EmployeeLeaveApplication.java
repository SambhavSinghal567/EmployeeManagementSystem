package com.employeemanagementsystem.employee.employeeleaveapplication;

import com.employeemanagementsystem.person.enums.Role;

public class EmployeeLeaveApplication {
   private final String employeeName;
   //private final DepartmentType departmentType;
   private final Role employeeRole;
   private final int leaveDays;
   private EmployeeLeaveApplicationStatus employeeLeaveApplicationStatus = EmployeeLeaveApplicationStatus.IN_PROCESS;

   public EmployeeLeaveApplication(String employeeName, Role employeeRole, int leaveDays) {
       this.employeeName = employeeName;
       //this.departmentType = departmentType;
       this.employeeRole = employeeRole;
       this.leaveDays = leaveDays;
   }

    public EmployeeLeaveApplicationStatus getEmployeeLeaveApplicationStatus() {
        return employeeLeaveApplicationStatus;
    }

    public void setEmployeeLeaveApplicationStatus(EmployeeLeaveApplicationStatus employeeLeaveApplicationStatus) {
        this.employeeLeaveApplicationStatus = employeeLeaveApplicationStatus;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public Role getEmployeeRole() {
        return employeeRole;
    }

    public int getLeaveDays() {
        return leaveDays;
    }

//    public DepartmentType getDepartmentType() {
//        return departmentType;
//    }
}
