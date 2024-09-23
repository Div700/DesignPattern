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
public class HomeWorkSheet
{
    private String topic;
    private int total_questions;
    private int solved_questions;

    public HomeWorkSheet(String topic, int total_questions) {
        this.topic = topic;
        this.total_questions = total_questions;
        this.solved_questions = 0;
    }

    public Sheet_Memento saveProgress(int completedQuestions,LocalDate date)
    {
        return new Sheet_Memento(completedQuestions,date);
    }
    
    public String getTopic() {
        return topic;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }

    public int getTotal_questions() {
        return total_questions;
    }

    public void setTotal_questions(int total_questions) {
        this.total_questions = total_questions;
    }

    public int getSolved_questions() {
        return solved_questions;
    }

    public void setSolved_questions(int solved_questions) {
        this.solved_questions = solved_questions;
    }
    
}
