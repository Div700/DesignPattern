/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package BehaviouralDesignPatterns.Youtube;

/**
 *
 * @author Divyansh
 */
public interface Subject
{
    void addObserver(Observer oberver);
    void removeObserver(Observer observer);
    void notifyObservers(String message,Youtube_Video newVideo);
}
