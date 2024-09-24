/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package BehaviouralDesignPatterns.Youtube;

/**
 *
 * @author Divyansh
 */
//observer interface
public interface Observer 
{
    //to get updates from the subsribed channel
    void update(String notification);
    //for creating a new channel
    void createChannel(String name);
    //for subsribing to a channel
    void subscribe(Subject channel);
    //adding a video to channel
    void addVideo();
    Youtube_Channel getChannel();
}
