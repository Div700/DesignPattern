/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package astronaut_schedule;

import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;
import java.time.LocalTime;

/**
 *
 * @author Divyansh
 */
//abstract class for task
abstract public class Task 
{
    static final String spaceship = "Apollo11";
    
        public String getDescription() 
        {
        return "These are the compulsory tasks";
        }

    abstract public LocalTime getStartTime(); //knowing start time of a task
    abstract public LocalTime getEndTime(); //knowing end time for a task
    abstract public int getPriority(); //getting priority level for a task
    abstract public String getTaskID(); //getting task id of the task
    abstract void setpriority(int priority); //setting the priority level of a task
    abstract void seDescription(String description); //setting the description of the task
    abstract void setEndTime(LocalTime newEndTime); //setting end time for the task
    abstract void saveTasks(); //to save tasks in the database
}
