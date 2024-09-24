/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CreationalDesignPatterns.Instagram;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author Divyansh
 */
public class Insta_App 
{
    public static void main(String args[]) throws IOException
    {
        //HashMap to store the users objects
        Map<String, User> users = new HashMap<>();
        //input stream objects
        InputStreamReader read = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(read);
        
        System.out.println("Create different users: ");
        int choice = 1;
        int photos = 0;
        String name;
        //looping till user does not exit
        while(choice != 0)
        {
            try
            {
                System.out.println("Enter 1 to create a new user\n Enter 2 to create post for a user\n Enter 3 to follow a new user\n Enter 4 to view profile\n Enter 0 to exit program");
                choice = Integer.parseInt(br.readLine()); // Catching NumberFormatException
                
                switch(choice)
                {
                    case 1:
                        //creating a new user
                        System.out.println("Enter new user id: ");
                        name = br.readLine();
                        while(users.containsKey(name))
                        {
                            System.out.println("Username already exists, please provide another username: ");
                            name = br.readLine();
                        }
                        User clientUser = new User(name);
                        //adding user in the map
                        users.put(name, clientUser);
                        break;
                        
                    case 2:
                        System.out.println("Enter your userid to create post for: ");
                        name = br.readLine();
                        //checking if the user exists
                        User u = users.get(name);
                        if (u == null) {
                            throw new NullPointerException("User not found.");
                        }
                        //creating a new post for the user
                        System.out.println("Enter the number of photos in the post: ");
                        photos = Integer.parseInt(br.readLine()); // Catching NumberFormatException
                        u.post(photos);
                        break;
                    
                    case 3:
                        System.out.println("Enter your username: ");
                        name = br.readLine();
                        User currentUser = users.get(name);
                        //checking if the user exists
                        if (currentUser == null) {
                            throw new NullPointerException("User not found.");
                        }
                        //following a new user
                        System.out.println("Enter the username to follow");
                        name = br.readLine();
                        u = users.get(name);
                        //checking if the user to be followed exists
                        if (u == null) {
                            throw new NullPointerException("User to follow not found.");
                        }
                        
                        currentUser.follow(u);
                        break;
                    
                    case 4:
                        //viewing the profile for a user
                        System.out.println("Enter your username: ");
                        name = br.readLine();
                        currentUser = users.get(name);
                        if (currentUser == null) {
                            throw new NullPointerException("User not found.");
                        }
                        
                        System.out.println("Enter the username profile you want to see: ");
                        name = br.readLine();
                        u = users.get(name);
                        if (u == null) {
                            throw new NullPointerException("Profile not found.");
                        }
                        
                        List<Post> posts = currentUser.viewProfile(u);
                        if (posts != null && !posts.isEmpty())
                        {
                            System.out.println(posts);
                            //liking any post
                            System.out.println("Enter 1 if you want to like any post");
                            int do_like = Integer.parseInt(br.readLine());
                            if (do_like == 1)
                            {
                                System.out.println("Enter the post id you want to like");
                                int postid = Integer.parseInt(br.readLine());
                                posts.get(postid-1).likePost(currentUser); // Might throw IndexOutOfBoundsException
                            }
                            //commenting on a post
                            System.out.println("Enter 2 if you want to add a comment to any post");
                            int do_comment = Integer.parseInt(br.readLine());
                            if (do_comment == 2)
                            {
                                System.out.println("Enter the post id you want to add comment to");
                                int postid = Integer.parseInt(br.readLine());
                                System.out.println("Enter the comment");
                                String comment = br.readLine();
                                posts.get(postid-1).addComment(currentUser, comment); // Might throw IndexOutOfBoundsException
                            }
                            System.out.println("Updated posts");
                            System.out.println(posts);
                        }
                        else
                        {
                            System.out.println("No posts available");
                        }
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
