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
public class EntityMotion implements Resource
{
    private List<Resource> childMotions;
    
    public EntityMotion()
    {
       childMotions = new ArrayList<>();
    }
    @Override
    public void useResource()
    {
        for(Resource r:childMotions)
        {
            r.useResource();
        }
    }
    public void addComponent(Resource resource)
    {
        childMotions.add(resource);
    }
    
    public void removeComponent(Resource resource)
    {
        childMotions.remove(resource);
    }
    
}
