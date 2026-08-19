package com.employeemanagementsystem.person;

import com.employeemanagementsystem.login.LoginData;

public class Profile {
    public static void showProfile(){
        System.out.println("Name: "+ LoginData.getFullName());
        System.out.println("Email: "+ LoginData.getEmail());
        System.out.println("Gender: "+ LoginData.getGender());
        System.out.println("Age: "+ LoginData.getAge());
        System.out.println("Company Position: "+ LoginData.getCompanyPosition());
            System.out.println("Department: "+ LoginData.getDepartment());
            System.out.println("Role: "+ LoginData.getRole());


    }
}
