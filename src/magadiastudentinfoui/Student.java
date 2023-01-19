/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package magadiastudentinfoui;

import java.util.Date;
import java.util.LinkedList;

/**
 *
 * @author main
 */
public class Student {
    private String firstName;
    private String middleName;
    private String lastName;
    
    private Date birthDate;
    /*private int birthMonth;
    private int birthDay;
    private int birthYear;*/
    
    private String address;
    private String contactNumber;
    private String emailAddress;
    private String userPw;
    
    private int gradeLevel;
    private String section;
    private LinkedList<Subject> subjectsEnrolled = new LinkedList<Subject>();
    private LinkedList<Student> studentsEnrolled = new LinkedList<Student>();
    
    public Student() {
        //sample constructor (all default)
        this.lastName = "Batumbakal";
        this.firstName = "Annie";
        this.middleName = "Esmeralda";
        this.birthDate = new Date(1, 1, 1998);
        this.address = "124 Emerald Road, Pasig City";
        this.contactNumber = "09222222222";
        this.emailAddress = "sample@domain.com";
        this.userPw = "password";
    }
    
    public Student(String lastName, String firstName, String middleName) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.middleName = middleName;
        this.birthDate = new Date(1, 1, 1988);
        this.address = "124 Emerald Road, Pasig City";
        this.contactNumber = "09222222222";
        this.emailAddress = "sample@domain.com";
        this.userPw = "password";
    }
    
    public Student(String emailAddress, String password) {
        this.lastName = "Batumbakal";
        this.firstName = "Annie";
        this.middleName = "Esmeralda";
        this.birthDate = new Date(1, 1, 1998);
        this.address = "124 Emerald Road, Pasig City";
        this.contactNumber = "09222222222";
        this.emailAddress = emailAddress;
        this.userPw = password;
    }
    
    public Student (String lastName, String firstName, String middleName, int grade, String section, Date birthDate, String address, String contact, String email) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.middleName = middleName;
        this.gradeLevel = grade;
        this.section = section;
        this.birthDate = birthDate;
        this.address = address;
        this.contactNumber = contact;
        this.emailAddress = email;
    }
    
    //alt + insert to automatically put
    //getters
    public String getFirstName() {
        return firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public String getLastName() {
        return lastName;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public String getAddress() {
        return address;
    }

    public String getContactNumber() {
        return contactNumber;
    }

    public String getEmailAddress() {
        return emailAddress;
    }
    
    public String getUserPw() {
        return userPw;
    }
    
    public int getGradeLevel() {
        return gradeLevel;
    }
    
    public String getSection() {
        return section;
    }
    
    public LinkedList<Subject> getSubjectsEnrolled() {
        return subjectsEnrolled;
    }
    
    public LinkedList<Student> getStudentsEnrolled() {
        return studentsEnrolled;
    }
    
    //setters

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setContactNumber(String contactNumber) {
        this.contactNumber = contactNumber;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }
    
    public void setUserPw(String userPw) {
        this.userPw = userPw;
    }

    public void setGradeLevel(int gradeLevel) {
        this.gradeLevel = gradeLevel;
    }

    public void setSection(String section) {
        this.section = section;
    }

    public void setSubjectsEnrolled(LinkedList<Subject> subjectsEnrolled) {
        this.subjectsEnrolled = subjectsEnrolled;
    }
    
    public void setStudentsEnrolled(LinkedList<Student> studentsEnrolled) {
        this.studentsEnrolled = studentsEnrolled;
    }
    
    public void AddSubject (Subject subject) {
        this.subjectsEnrolled.add(subject);
    }
    
    public void AddStudent (Student student) {
        this.studentsEnrolled.add(student);
    }
    
    public void DebugInfo() {
        System.out.println("Full Name: " + this.lastName + ", " + this.firstName + " " + this.middleName);
        System.out.println("Grade and Section: " + this.gradeLevel + " - " + this.section);
        System.out.println("Birthday: " + this.birthDate);
        System.out.println("Address: " + this.address);
        System.out.println("Contact Number: " + this.contactNumber);
        System.out.println("Email: " + this.emailAddress);
    }
    
}
