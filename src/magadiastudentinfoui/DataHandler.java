/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package magadiastudentinfoui;

import java.time.LocalTime;
import java.util.Date;
import java.util.LinkedList;

/**
 *
 * @author main
 */
public class DataHandler {

    public static class Administrator{
        public static Admin sampleAdmin;
        
        public static void createAdmin() {
            sampleAdmin = new Admin("Magadia", "Johannah Mae", "Fernandez", "admin", "pw123");
        }
    }
    
    public static class Students {
        
        public static Student sampleLogin = new Student("johannah.magadia@ciit.edu.ph", "password123");
        
        public static Student sampleStudent;
        public static LinkedList<Subject> availableSubjects = new LinkedList<Subject>();
        public static LinkedList<Student> enrolledStudents = new LinkedList<Student>();
        
        public static void CreateSamples() {
            sampleStudent = new Student("Magadia", "Johannah Mae", "Fernandez");
            sampleStudent.setAddress("Pasong Tamo, Quezon City");
            sampleStudent.setBirthDate(new Date(2006, 5, 20));
            sampleStudent.setContactNumber("09123456789");
            sampleStudent.setEmailAddress("johannah.magadia@ciit.edu.ph");
            sampleStudent.setGradeLevel(11);
            sampleStudent.setSection("Python");
            
            Student tempStudent = new Student ("Magadia", "Johannah Mae", "Fernandez", 11, "Python", new Date(2006, 5, 20), "Pasong Tamo, Quezon City", "09123456789", "johannah.magadia@ciit.edu.ph");
            sampleStudent.AddStudent(tempStudent);
            
            Subject tempSubject = new Subject("CS315", "Game Production and Project Management", "Denick Espares", 
                                               LocalTime.of(9, 0), LocalTime.of(10,30), "Monday");
            sampleStudent.AddSubject(tempSubject);
            
            Subject tempSubject2 = new Subject("EMC103", "Introduction to Game Design and Development", "Bille Janssen Lagarde", 
                                               LocalTime.of(13, 0), LocalTime.of(16,0), "Wednesday");
            sampleStudent.AddSubject(tempSubject2);
            
            availableSubjects.add(tempSubject);
            availableSubjects.add(tempSubject2);
        }

        public static void CreateSubjects() {
            Subject tempSubject = new Subject("SHS-SSP-04", "Computer Programming 2", "Bille Janssen Lagarde",
                                              LocalTime.of(8,0), LocalTime.of(11,0), "Wednesday");
            Subject tempSubject2 = new Subject("SHS-SSP-02", "Computer Programming 1", "Romello Gordon Martin",
                                              LocalTime.of(13,0), LocalTime.of(16,0), "Monday");
            
            //tempSubject.DisplayInfo();
            availableSubjects.add(tempSubject);
            availableSubjects.add(tempSubject2);
        }
    }
}
