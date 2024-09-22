/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BehaviouralDesignPattern.StudentPortal;

import java.time.LocalDate;

/**
 *
 * @author Divyansh
 */
public final class Sheet_Memento 
{
    int solved_questions;
    LocalDate date;
    
    public Sheet_Memento(int solved_questions,LocalDate date)
    {
        this.solved_questions = solved_questions;
        this.date = date;
    }

    public void setSolved_questions(int solved_questions) {
        this.solved_questions = solved_questions;
    }

    @Override
    public String toString() {
        return "Sheet_Memento{" + "solved_questions=" + solved_questions + ", date=" + date + '}';
    }
    
}
