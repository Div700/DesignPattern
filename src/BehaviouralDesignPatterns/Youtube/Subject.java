/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package BehaviouralDesignPatterns.Youtube;

/**
 *
 * @author Divyansh
 */
//subject interface 
public interface Subject
{
    //adding new observers or subsribers
    void addObserver(Observer oberver);
    //removing the observers if a user unsubsribes
    void removeObserver(Observer observer);
    //notifying the users on a new video 
    void notifyObservers(String message,Youtube_Video newVideo);
}
