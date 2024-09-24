/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BehaviouralDesignPatterns.Youtube;

/**
 *
 * @author Divyansh
 */
//class for youtube video
public class Youtube_Video
{
    private String title; //title of the video
    private String description; //description of the video
    private int duration; //duration of the video

    public Youtube_Video(String title, String description, int duration) {
        this.title = title;
        this.description = description;
        this.duration = duration;
    }

    //getters and setters
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    @Override
    public String toString() {
        return "Youtube_Video{" + "title=" + title + ", description=" + description + ", duration=" + duration + '}';
    }
    
}
