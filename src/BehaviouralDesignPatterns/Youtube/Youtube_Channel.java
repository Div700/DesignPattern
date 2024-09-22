/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BehaviouralDesignPatterns.Youtube;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Divyansh
 */
public class Youtube_Channel implements Subject
{
    String channel_Name;
    private List<Youtube_Video> videos;
    private List<Observer> subscribers;
    public Youtube_Channel(String channelName) 
    {
        this.channel_Name = channelName;
        videos = new ArrayList<>();
        subscribers = new ArrayList<>();
    }
    
    void addNewVideo(Youtube_Video newVideo)
    {
        System.out.println("Video added successfully");
        Scanner sc = new Scanner(System.in);
        videos.add(newVideo);
        System.out.println("Enter the notification you want to give to the subsribers");
        String notification = sc.nextLine();
        notifyObservers(notification,newVideo);
    }
    
    @Override
    public void addObserver(Observer oberver) 
    {
        subscribers.add(oberver);
    }

    @Override
    public void removeObserver(Observer observer) 
    {
        subscribers.remove(observer);
    }

    @Override
    public void notifyObservers(String message,Youtube_Video newVideo) 
    {
        for(Observer o: subscribers)
        {
            o.update("New video added: "+newVideo);
        }
    }

    public List<Youtube_Video> getVideos() {
        return videos;
    }

    
    
    @Override
    public String toString() {
        return "Youtube_Channel{" + "channel_Name=" + channel_Name + ", videos=" + videos.size() + '}';
    }
    
}
