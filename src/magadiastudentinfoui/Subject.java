/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package magadiastudentinfoui;

import java.time.LocalTime;

/**
 *
 * @author main
 */
public class Subject {
    private String code;
    private String name;
    private String instructor;
    private LocalTime start, end;
    private String day;

    public Subject() {
        this.code = "ABC123";
        this.name = "Default Subject";
        this.instructor = "Default Instructor";
        this.start = LocalTime.of(9, 0);
        this.end = LocalTime.of(10, 0);;  
        this.day = "Monday";
    }
    
    public Subject(String code, String name, String instructor) {
        this.code = code;
        this.name = name;
        this.instructor = instructor;
        this.start = LocalTime.of(9, 0);
        this.end = LocalTime.of(10, 0);;
        this.day = "Monday";
    }
    
    public Subject(String code, String name, String instructor, LocalTime start, LocalTime end, String weekDay) {
        this.code = code;
        this.name = name;
        this.instructor = instructor;
        this.start = start;
        this.end = end;
        this.day = weekDay;
    }
    
    public void DisplayInformation() {
        System.out.println("Subject Code: " + this.code);
        System.out.println("Subject Name: " + this.name);
        System.out.println("Subject Teacher: " + this.instructor);
        System.out.println("Subject Starts at: " + this.start);
        System.out.println("Subject Ends at: " + this.end);
        System.out.println("Subject Is on: " + this.day);
    }
    
    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getInstructor() {
        return instructor;
    }

    public void setInstructor(String instructor) {
        this.instructor = instructor;
    }

    public LocalTime getStart() {
        return start;
    }

    public void setStart(LocalTime start) {
        this.start = start;
    }

    public LocalTime getEnd() {
        return end;
    }

    public void setEnd(LocalTime end) {
        this.end = end;
    }

    public String getDay() {
        return day;
    }

    public void setDay(String day) {
        this.day = day;
    }
}
