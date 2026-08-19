package com.employeemanagementsystem.manager;

import com.employeemanagementsystem.employee.Employee;
import com.employeemanagementsystem.employee.employeeleaveapplication.EmployeeLeaveApplication;
import com.employeemanagementsystem.employee.employeeleaveapplication.EmployeeLeaveApplicationStatus;
import com.employeemanagementsystem.login.LoginData;
import com.employeemanagementsystem.person.PersonService;

public class ManagerService extends PersonService {


    public static void showEmployeesLeaveApplications(){
        int i = 1;
        for(EmployeeLeaveApplication applicant : Employee.leaveApplicationsForDepartment.get(LoginData.getDepartment())){
            System.out.println(i+". "+applicant.getEmployeeName()+" "+applicant.getEmployeeRole()+" "+applicant.getLeaveDays()+" "+applicant.getEmployeeLeaveApplicationStatus());
            i++;
        }
    }

    public static void employeeLeaveApplicationStatusUpdate(){
            if(Manager.getLeaveApplicantName().equals("e")){
                System.out.println("Exited");

            }else{
                for(EmployeeLeaveApplication s : Employee.leaveApplicationsForDepartment.get(LoginData.getDepartment())){
                    String name = s.getEmployeeName();

                    if(Manager.getLeaveApplicantName().equals(name)){
                        if(Manager.getManagerToManageEmployeeLeaveApplicationsActionChoice()==1){
                            s.setEmployeeLeaveApplicationStatus(EmployeeLeaveApplicationStatus.APPROVED);
                        }else if(Manager.getManagerToManageEmployeeLeaveApplicationsActionChoice()==2){
                            s.setEmployeeLeaveApplicationStatus(EmployeeLeaveApplicationStatus.REJECTED);
                        }else{
                            System.out.println("Something went wrong");
                        }
                        System.out.println("Updated");
                    }else{
                        System.out.println("Name Not Found");
                    }
                }
            }
    }

    public static void viewEmployees(){
        for(Employee e : Employee.employees){
            if(e.getPersonDepartment()==LoginData.getDepartment()){
                System.out.println(e.getPersonName()+" "+e.getPersonGender()+" "+e.getPersonRole());
            }
        }
    }

}
