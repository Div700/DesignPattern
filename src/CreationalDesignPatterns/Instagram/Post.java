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
public class Post 
{
    int postId;
    User instaId;
    int no_likes;
    int photos;// parameter for number of photos in the post
    Map<User,String> comments;//parameter for adding comments in the post
    List<User> LikedUsers;
    
    public Post(int photos, User userId,int postid)
    {
        this.postId = postid;
        this.instaId = userId;
        this.photos = photos;
        comments = new HashMap<>();
        LikedUsers = new ArrayList<>();
        this.no_likes = 0;
    }
    void addComment(User user, String comment)
    {
        comments.put(user, comment);
    }
    void likePost(User user)
    {
        LikedUsers.add(user);
        no_likes++;
    }
    
    public User getInstaId() {
        return instaId;
    }

    public void setInstaId(User instaId) {
        this.instaId = instaId;
    }

    public int getPhotos() {
        return photos;
    }

    public void setPhotos(int photos) {
        this.photos = photos;
    }

    public int getNo_likes() {
        return no_likes;
    }

    public void setNo_likes(int no_likes) {
        this.no_likes = no_likes;
    }

    public Map<User, String> getComments() {
        return comments;
    }

    public void setComments(Map<User, String> comments) {
        this.comments = comments;
    }

    public List<User> getLikedUsers() {
        return LikedUsers;
    }

    public void setLikedUsers(List<User> LikedUsers) {
        this.LikedUsers = LikedUsers;
    }

    public int getPostId() {
        return postId;
    }

    @Override
public String toString() 
{
    // Keep it simple: avoid printing the entire User object
    return "Post{" +
            "postId=" + postId +
            ", photoCount=" + photos +
            ", likes=" + no_likes +
            ", comments=" +comments +// Avoid recursion by only printing username
            '}';
} 
    
}
