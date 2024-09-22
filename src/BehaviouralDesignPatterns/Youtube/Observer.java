/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package BehaviouralDesignPatterns.Youtube;

/**
 *
 * @author Divyansh
 */
public interface Observer 
{
    void update(String notification);
    void createChannel(String name);
    void subscribe(Subject channel);
    void addVideo();
    Youtube_Channel getChannel();
}
