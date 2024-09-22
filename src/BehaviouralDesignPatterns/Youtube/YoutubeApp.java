/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BehaviouralDesignPatterns.Youtube;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Divyansh
 */
public class YoutubeApp 
{
    public static void main(String args[]) throws IOException
    {
        InputStreamReader read = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(read);
        Map<String,Observer> users = new HashMap<>();
        String name,email,channelName;
        int choice = 1;
        int duration;
        while(choice != 0)
        {   
            try
            {
                System.out.println("Enter 1 to create a new user\n Enter 2 to create your channel\n Enter 3 to create video for the channel\nEnter 4 to subscribe for a channel\n0 to exit program");
                choice = Integer.parseInt(br.readLine()); // Catching NumberFormatException
                
                switch(choice)
                {
                    case 1:
                        System.out.println("Enter your name: ");
                        name = br.readLine();
                        System.out.println("Enter your email id");
                        email = br.readLine();
                        while(users.containsKey(email))
                        {
                            System.out.println("Username already exists, please provide another username: ");
                            email = br.readLine();
                        }
                        Observer newUser = new User(name,email);
                        System.out.println("Welcome to Youtube!");
                        users.put(email,newUser);
                        break;
                        
                    case 2:
                        System.out.println("Enter your email to create channel for: ");
                        email = br.readLine();
                        Observer currentUser = users.get(email);
                        if (currentUser == null) 
                        {
                            throw new NullPointerException("User not found.");
                        }
                        System.out.println("Enter name for your channel: ");
                        channelName = br.readLine();
                        currentUser.createChannel(channelName);
                        break;
                    
                    case 3:
                        System.out.println("Enter your username: ");
                        email = br.readLine();
                        
                        currentUser = users.get(email);
                        if (currentUser == null) {
                            throw new NullPointerException("User not found.");
                        }
                        currentUser.addVideo();
                        break;
                    
                    case 4:
                        System.out.println("Enter your username: ");
                        email = br.readLine();
                        currentUser = users.get(email);
                        if (currentUser == null) 
                        {
                            throw new NullPointerException("User not found.");
                        }
                        
                        System.out.println("Enter the username you want to subscribe to: ");
                        email = br.readLine();
                        Observer toSubscribe = users.get(email);
                        if (toSubscribe == null) {
                            throw new NullPointerException("No such user exists.");
                        }
                        currentUser.subscribe(toSubscribe.getChannel());
                        System.out.println("Subscribed successfully!");
                    break;    
                    case 0:
                        System.out.println("Exiting program...");
                        break;
                    
                    default:
                        System.out.println("Please pick a correct choice");
                }
            }
            
            catch(NumberFormatException e)
            {
                System.out.println("Invalid input. Please enter a valid number.");
            }
            catch(NullPointerException e)
            {
                System.out.println("Error: " + e.getMessage());
            }
            catch(IndexOutOfBoundsException e)
            {
                System.out.println("Invalid post ID entered.");
            }
            catch(Exception e)
            {
                System.out.println("An unexpected error occurred: " + e.getMessage());
            }
        }
    }
}
