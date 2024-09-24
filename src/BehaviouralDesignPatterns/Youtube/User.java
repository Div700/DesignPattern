/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BehaviouralDesignPatterns.Youtube;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Divyansh
 */
//user class which serves as the implementation of observer interface
public class User implements Observer
{
    private String name;
    private String email;
    Youtube_Channel channel; //channel owned by the user

    public User(String name, String email) {
        this.name = name;
        this.email = email;
    }
     
    //updating the user if a new video is added on the subsribed channel
    @Override
    public void update(String notification)
    {
        System.out.println("Recieved notification on +"+name+" mobile: "+notification);
    }
    
    //creating a new channel
    @Override
    public void createChannel(String name) 
    {
        //one user can only create a single channel
        if(channel == null)
        {
            channel = new Youtube_Channel(name);
        }
        else
        {
            System.out.println("Sorry! You already have created the channel : "+channel.channel_Name);
        }
    }

    //subsribing to a new channel
    @Override
    public void subscribe(Subject SubscribeTochannel)
    {
      SubscribeTochannel.addObserver(this);
    }

    //adding video to the channel
    @Override
    public void addVideo() 
    {
        InputStreamReader read = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(read);
        
        try {
                System.out.println("Enter the length of the video: (in minutes)");
                int duration = Integer.parseInt(br.readLine()); // Catching NumberFormatException
                System.out.println("Enter the title of video");
                String title = br.readLine();
                System.out.println("Enter the description");
                String description = br.readLine();
                
                channel.addNewVideo(new Youtube_Video(title,description,duration));
            } 
        catch (IOException ex) {
                Logger.getLogger(User.class.getName()).log(Level.SEVERE, null, ex);
            }
        catch(NullPointerException n)
        {
            System.out.println("Create your channel first");
        }
    }

    @Override
    public String toString() {
        return "User{" + "name=" + name + ", email=" + email + ", channel=" + channel + '}';
    }

    @Override
    public Youtube_Channel getChannel() 
    {
        return channel;
    }
    
}
