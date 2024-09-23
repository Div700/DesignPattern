/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BehaviouralDesignPatterns.StudentPortal;

/**
 *
 * @author Divyansh
 */
public class Student 
{
    private String name;
    private String studentID;
    private String school;
    private ProgressKeeper progresskeeper;

    public Student(String name, String studentID, String school) 
    {
        this.name = name;
        this.studentID = studentID;
        this.school = school;
        this.progresskeeper = new ProgressKeeper(studentID);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStudentID() {
        return studentID;
    }

    public void setStudentID(String studentID) {
        this.studentID = studentID;
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    public ProgressKeeper getProgresskeeper() {
        return progresskeeper;
    }
    
}
