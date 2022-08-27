package pojo;

import enums.EmploymentStatus;
import enums.Gender;

public class Seamfixer {

    private String firstName;
    private String surname;
    private int age;
    private int yearsSpentInSeamfix;
    private Gender gender;
    private String role;
    private EmploymentStatus employmentStatus;

    public Seamfixer() {
    }

    public Seamfixer(String firstName, String surname, int age, int yearsSpentInSeamfix, Gender gender, String role, EmploymentStatus employmentStatus) {
        this.firstName = firstName;
        this.surname = surname;
        this.age = age;
        this.yearsSpentInSeamfix = yearsSpentInSeamfix;
        this.gender = gender;
        this.role = role;
        this.employmentStatus = employmentStatus;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getYearsSpentInSeamfix() {
        return yearsSpentInSeamfix;
    }

    public void setYearsSpentInSeamfix(int yearsSpentInSeamfix) {
        this.yearsSpentInSeamfix = yearsSpentInSeamfix;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public EmploymentStatus getEmploymentStatus() {
        return employmentStatus;
    }

    public void setEmploymentStatus(EmploymentStatus employmentStatus) {
        this.employmentStatus = employmentStatus;
    }
}
