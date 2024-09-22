/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Instagram;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author Divyansh
 */
public class PostManager 
{
    String daoObject;
    Map <User,List<Post>> users;
    private static PostManager manager;
    private PostManager(String dao)
    {
        daoObject = dao+" access object";
        users = new HashMap<>();
        //other variables are initialzed here
    }
    
    public static PostManager getPostManager()
    {
        if(manager==null)
        {
            synchronized (PostManager.class)
            {
                if(manager == null)
                {
                    manager = new PostManager("MongoDB");
                }
            }
        }
        return manager;
    }

    public void create_new_post(User u, Post newPost)
    {
        System.out.println("Updating to the cloud storage");
            List userPosts = users.get(u);
            userPosts.add(newPost);
        //this updation to the database is done by a singleton object 
        System.out.println("Post uploaded successfully!!");
    }
    
    public List<Post> getPosts(User u) 
    {
        return users.get(u);
    }

    public void addUsers(User u) 
    {
        List<Post> userPosts = new ArrayList<>();
        users.put(u, userPosts);
    }
    
    
}
