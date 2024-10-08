/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BehaviouralDesignPatterns.StudentPortal;

import java.time.LocalDate;

/**
 *
 * @author Divyansh
 */
//client class
public class StudentPracticeApp 
{
    public static void main(String args[])
    {
        //creating one instance for the student 
        Student s1 = new Student("Divyansh","ZSE07","Zydus School Vejalpur");
        //creating instance for originator class homeworksheet
        HomeWorkSheet mathsSheets1 = new HomeWorkSheet("Maths-1",25);
        
        //suppose s1 did 10 questions on day1
        Sheet_Memento day1Progress = mathsSheets1.saveProgress(10,LocalDate.of(2024, 9, 22));
        s1.getProgresskeeper().addMemento(day1Progress, "Maths-1");
        //s1 did no questions on day2
        Sheet_Memento day2Progress = mathsSheets1.saveProgress(0, LocalDate.of(2024, 9, 23));
        s1.getProgresskeeper().addMemento(day2Progress, "Maths-1");
        //s1 did 15 questions on day3
        Sheet_Memento day3Progress = mathsSheets1.saveProgress(15, LocalDate.of(2024, 9, 24));
        s1.getProgresskeeper().addMemento(day3Progress, "Maths-1");
        
        System.out.println("Progress of "+s1.getName()+" : ");
        s1.getProgresskeeper().printReport("Maths-1");
    }
}
