/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package StructureDesignPattern.Cricket07;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Divyansh
 */
public class Sound implements Resource
{
    String volume;
    List<Resource> childSounds;
    
    public Sound()
    {
        volume = "low";
        childSounds = new ArrayList<>();
    }
    public void addComponent(Resource resource)
    {
        childSounds.add(resource);
    }
    
    public void removeComponent(Resource resource)
    {
        childSounds.remove(resource);
    }
    public String getVolume() {
        return volume;
    }

    public void setVolume(String volume) {
        this.volume = volume;
    }

    @Override
    public void useResource() 
    {
        for(Resource r:childSounds)
        {
            r.useResource();
        }
    }
    
}
