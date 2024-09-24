/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package astronaut_schedule;

/**
 *
 * @author Divyansh
 */
//subject interface
public interface Subject
{
    void addObserver(Observer oberver); //adding observers or subsribers
    void removeObserver(Observer observer); //removing observers
    void notifyObservers(String message); //notifying astronauts about tasks
}
