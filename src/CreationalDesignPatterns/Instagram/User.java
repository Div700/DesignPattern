/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CreationalDesignPatterns.Instagram;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Divyansh
 */
public class User 
{
    private String userName; //name of user
    private List<User> followers; //list of followers
    private List<User> following; //list of following
    private int no_followers; //number of followers
    private int no_posts; //number of posts
    private int no_following; //number of following
    
    public User(String name)
    {
        this.userName = name;
        followers = new ArrayList<>();
        following = new ArrayList<>();
        no_followers = 0;
        no_posts = 0;
        no_following = 0;
        PostManager.getPostManager().addUsers(this);
    }
    
    //function to follow a new user
    public void follow(User new_following)
    {
        following.add(new_following);
        no_following++;
        new_following.addFollower(this);
    }
    //function to add the user requesting to follow
    public void addFollower(User new_follower)
    {
        no_followers++;
        followers.add(new_follower);
    }
    
    //function to make a new post
    public void post(int photos)
    {
        Post newPost = new Post(photos,this,no_posts+1);
        no_posts = no_posts+1;
        PostManager manager = PostManager.getPostManager();
        manager.create_new_post(this,newPost);
    }
    //function to get the posts for the user
    private List<Post> getUserPosts(User u)
    {
        //using singleton post manager to retrieve data
        PostManager manager = PostManager.getPostManager();
        return manager.getPosts(u);
    }

    //function to view profile of the user
    public List<Post> viewProfile(User u)
    {
        if(u.getFollowers().contains(this))
        {
            return getUserPosts(u);
        }
        System.out.println("Not allowed to see posts without following");
        return null;
    }
    
    //getters and setters
    public String getUserName() {
        return userName;
    }

    public List<User> getFollowers() {
        return followers;
    }

    public List<User> getFollowing() {
        return following;
    }

    public int getNo_followers() {
        return no_followers;
    }

    public int getNo_posts() {
        return no_posts;
    }

    public int getNo_following() {
        return no_following;
    }

    @Override
    public String toString() {
        return "User{" + "userName=" +userName+ ", no_followers=" + no_followers + ", no_posts=" + no_posts + ", no_following=" + no_following + '}';
    }
    
}
