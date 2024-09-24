/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CreationalDesignPatterns.Instagram;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author Divyansh
 */
//SingleTon class for managing the fetching and updation of the posts
public class PostManager 
{
    //Database object to interact with the database
    String daoObject;
    //map to store all the users
    Map <User,List<Post>> users;
    //creating a single object of PostManager class using lazy initialization
    private static PostManager manager;
    
    //private constructor not allowing to intantiate PostManager outside the class
    private PostManager(String dao)
    {
        daoObject = dao+" access object";
        users = new HashMap<>();
    }
    
    //function to get the PostManager class
    public static PostManager getPostManager()
    {
        if(manager==null)
        {
            //synchronization for multithreading
            synchronized (PostManager.class)
            {
                //double checking
                if(manager == null)
                {
                    manager = new PostManager("MongoDB");
                }
            }
        }
        return manager;
    }

    //function to create a new post
    public void create_new_post(User u, Post newPost)
    {
        System.out.println("Updating to the cloud storage");
            List userPosts = users.get(u);
            userPosts.add(newPost);
        //this updation to the database is done by a singleton object 
        System.out.println("Post uploaded successfully!!");
    }
    
    //gettingpost for a specific user
    public List<Post> getPosts(User u) 
    {
        return users.get(u);
    }

    //function to add new ussers in the database
    public void addUsers(User u) 
    {
        List<Post> userPosts = new ArrayList<>();
        users.put(u, userPosts);
    }
    
    
}
