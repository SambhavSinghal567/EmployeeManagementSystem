package com.employeemanagementsystem.person;

import com.employeemanagementsystem.person.enums.DepartmentType;
import com.employeemanagementsystem.person.enums.Gender;
import com.employeemanagementsystem.person.enums.PersonType;
import com.employeemanagementsystem.person.enums.Role;

public abstract class Person {
    private final String personName;
    private final String personEmail;
    private final String personEmailPassword;
    private final int personAge;
    private final Gender personGender;
    private PersonType personType;
    private DepartmentType personDepartment;
    private Role personRole;




    public Person(String personName,String personEmail, String personEmailPassword, int personAge,Gender personGender,PersonType personType ,DepartmentType departmentType,Role personRole) {
        this.personName = personName;
        this.personEmail = personEmail;
        this.personEmailPassword = personEmailPassword;
        this.personAge = personAge;
        this.personGender = personGender;
        this.personType = personType;
        this.personDepartment=departmentType;
        this.personRole=personRole;

    }

    //Setters and Getters
    public String getPersonName() {
        return personName;
    }

    public int getPersonAge() {
        return personAge;
    }

    public PersonType getPersonType() {
        return personType;
    }

    public void setPersonType(PersonType personType) {
        this.personType = personType;
    }

    public Gender getPersonGender() {
        return personGender;
    }

    public DepartmentType getPersonDepartment() {
        return personDepartment;
    }

    public void setPersonDepartment(DepartmentType personDepartment) {
        this.personDepartment = personDepartment;
    }

    public Role getPersonRole() {
        return personRole;
    }

    public void setPersonRole(Role personRole) {
        this.personRole = personRole;
    }

    public String getPersonEmail() {
        return personEmail;
    }

    public String getPersonEmailPassword() {
        return personEmailPassword;
    }

}
