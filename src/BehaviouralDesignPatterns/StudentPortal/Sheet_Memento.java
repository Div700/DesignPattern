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
//memento class which captures the state of the originator (Sheet) class
public final class Sheet_Memento 
{
    int solved_questions; //solved questions for the day
    LocalDate date; //date of that day
    
    public Sheet_Memento(int solved_questions,LocalDate date)
    {
        this.solved_questions = solved_questions;
        this.date = date;
    }

    //setting the solved questions for a particular day
    public void setSolved_questions(int solved_questions) {
        this.solved_questions = solved_questions;
    }

    @Override
    public String toString() {
        return "Sheet_Memento{" + "solved_questions=" + solved_questions + ", date=" + date + '}';
    }
    
}
