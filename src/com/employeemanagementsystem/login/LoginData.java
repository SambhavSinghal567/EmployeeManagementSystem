package com.employeemanagementsystem.login;

import com.employeemanagementsystem.employee.Employee;
import com.employeemanagementsystem.manager.Manager;
import com.employeemanagementsystem.person.enums.DepartmentType;
import com.employeemanagementsystem.person.enums.Gender;
import com.employeemanagementsystem.person.Person;
import com.employeemanagementsystem.person.enums.PersonType;
import com.employeemanagementsystem.person.enums.Role;
import java.util.ArrayList;
import java.util.List;

//Immutable class -> all private fields with no setters
public class LoginData {
   public static List<Person> person = new ArrayList<>();

   private static UserStatus userStatus;

    private static int formTypeChoice;

   private static String fullName;
   private  static String email;
   private static String password;
   private static int age;
   private static Gender gender;
   private static int genderChoice;
   private static PersonType companyPosition;
   private static int companyPositionChoice;
   private static DepartmentType department;
   private static int departmentChoice;
    private static Role role;
    private static int roleChoice;

  public static void setLoginData(Person person) {
       LoginData.setFullName(person.getPersonName());
       LoginData.setEmail(person.getPersonEmail());
       LoginData.setPassword(person.getPersonEmailPassword());
       LoginData.setAge(person.getPersonAge());
       LoginData.setGender(person.getPersonGender());
       LoginData.setCompanyPosition(person.getPersonType());
       LoginData.setDepartment(person.getPersonDepartment());
       LoginData.setRole(person.getPersonRole());
   }


   //Getters
   public static String getFullName() {
      return fullName;
   }

   public static String getEmail() {
      return email;
   }
   public static String getPassword() {
      return password;
   }
   public static int getAge() {
      return age;
   }

   public static Gender getGender() {
      return gender;
   }

   public static int getCompanyPositionChoice() {
      return companyPositionChoice;
   }

   public static DepartmentType getDepartment() {
      return department;
   }

   public static Role getRole() {
      return role;
   }


    public static void setFullName(String fullName) {
        LoginData.fullName = fullName;
    }

    public static void setEmail(String email) {
        LoginData.email = email;
    }

    public static void setPassword(String password) {
        LoginData.password = password;
    }

    public static void setAge(int age) {
        LoginData.age = age;
    }

    public static void setGenderChoice(int genderChoice) {
        LoginData.genderChoice = genderChoice;
    }

    public static void setCompanyPositionChoice(int companyPositionChoice) {
        LoginData.companyPositionChoice = companyPositionChoice;
    }

    public static void setDepartmentChoice(int departmentChoice) {
        LoginData.departmentChoice = departmentChoice;
    }

    public static void setRoleChoice(int roleChoice) {
        LoginData.roleChoice = roleChoice;
    }

    public static int getGenderChoice() {
        return genderChoice;
    }

    public static  int getDepartmentChoice() {
       return departmentChoice;
    }

    public static  int getRoleChoice() {
       return roleChoice;
    }

    public static int getFormTypeChoice() {
        return formTypeChoice;
    }

    public static void setFormTypeChoice(int formTypeChoice) {
        LoginData.formTypeChoice = formTypeChoice;
    }

    public static void setGender(Gender gender) {
        LoginData.gender = gender;
    }

    public static PersonType getCompanyPosition() {
        return companyPosition;
    }

    public static void setCompanyPosition(PersonType companyPosition) {
        LoginData.companyPosition = companyPosition;
    }

    public static void setDepartment(DepartmentType department) {
        LoginData.department = department;
    }

    public static void setRole(Role role) {
        LoginData.role = role;
    }

    public static UserStatus getUserStatus() {
        return userStatus;
    }

    public static void setUserStatus(UserStatus userStatus) {
        LoginData.userStatus = userStatus;
    }
}
