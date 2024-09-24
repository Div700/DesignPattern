/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package astronaut_schedule;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Divyansh
 */

//class having a singleton object for interacting with the database and storing tasks
public class ScheduleManager implements Subject
{
    
    LocalDateTime date;
    private static ScheduleManager manager; //lazy initialization of the singleton object
    private Database daoObject; //object to interact with the database
    List<Observer> observers; //list of astronauts in the spaceship
    
    private ScheduleManager()
    {
        date = LocalDateTime.now();
        System.out.println("Current timestamp: "+date);
        daoObject = new DaoClass();
        observers = new ArrayList<>();
    }
    
    //function to return the schedule manager singleton object
    public static ScheduleManager getSingleManager()
    {
        if(manager==null)
        {
            //synchronization as multiple astronauts would be using the app
            synchronized(ScheduleManager.class)
            {
                //double checking for safety
                if(manager == null)
                {
                    manager = new ScheduleManager();
                }
            }
        }
        return manager;
    }
    
    //function to add a task
    public void addTask(Task t)
    {
        if(t.getPriority()==1)
        {
            daoObject.insert(t);
            notifyObservers("Emergency Task Added!! Please complete it: "+t);
            return;
        }
        Task returnedTask = daoObject.insert(t);
        if(returnedTask == null)
        {
            System.out.println("Task added successfully. No conflicts");          
            t.saveTasks();
        }
        else
        {
            System.out.println("Error: Task conflicts with exsting task "+returnedTask);
        }
        viewSchedule();
        notifyObservers("New Task Added: "+t);
    }
    
    //function to remove a task
    public void removeTask(String id) throws IOException
    {
          daoObject.delete(id);
          notifyObservers("Task deleted please check schedule");
    }
    
    //function to update an existing task
    public void update(String id) throws IOException
    {
        try
        {
        DateTimeFormatter timeFormatter = DateTimeFormatter.ofPattern("HH:mm");
            InputStreamReader read = new InputStreamReader(System.in);
            BufferedReader br = new BufferedReader(read);
       
        System.out.println("Give the updated details again: ");
        System.out.println("Enter updated end time of task (only enter the time in hh:mm format)");
        String end = br.readLine();
            LocalTime endTime = LocalTime.parse(end, timeFormatter);

                    
            System.out.println("Enter the priority level of the task");
            int priority = Integer.parseInt(br.readLine());
            //only emergency tasks have the highest priority
            if(priority==1)
            {
                throw new IllegalArgumentException();
            }
            System.out.println("Enter the description for the task");
            String description = br.readLine();
            
        daoObject.update(id,endTime,description,priority);
        }
        catch (DateTimeParseException e) 
        {
        System.out.println("Error: Invalid time format: " + e.getMessage());   
       }  
        catch(IllegalArgumentException i)
        {
            System.out.println("Can not give emergency priority to normal tasks! Dont misuse the system");
        }
    }
    
    public void viewSchedule()
    {
        daoObject.read();
    }

    public void viewforPriority(int priority)
    {
        daoObject.viewPriority(priority);
    }
    
    @Override
    public void addObserver(Observer oberver) 
    {
        observers.add(oberver);
    }

    @Override
    public void removeObserver(Observer observer) 
    {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers(String message) 
    {
        for(Observer observer:observers)
        {
            observer.update(message);
        }
    }
    
}
