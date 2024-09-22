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
public class Match implements Resource
{
    private String team1,team2;
    List<Resource> childEntities;
    
    public Match()
    {
        childEntities = new ArrayList<>();
        
        System.out.println("Match is being played between "+team1+ "and "+team2);
    }
    
    public void addComponent(Resource resource)
    {
        childEntities.add(resource);
    }
    
    public void removeComponent(Resource resource)
    {
        childEntities.remove(resource);
    }
            
    @Override
    public void useResource()
    {
        for(Resource r:childEntities)
        {
            r.useResource();
        }
    }

    public String getTeam1() {
        return team1;
    }

    public void setTeam1(String team1) {
        this.team1 = team1;
    }

    public String getTeam2() {
        return team2;
    }

    public void setTeam2(String team2) {
        this.team2 = team2;
    }
    
}
