/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package StructureDesignPattern.ChromeApp;

/**
 *
 * @author Divyansh
 */
public class Extension 
{
    private String name;
    private boolean hasAccess;
    
    public void runBackground()
    {
        if(hasAccess == true)
        System.out.println("Extension "+name +" with browser access");
        else
        System.out.println("Extension "+name +" without browser access");
    }
    public String getName() 
    {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isHasAccess() {
        return hasAccess;
    }

    public void setHasAccess(boolean hasAccess) {
        this.hasAccess = hasAccess;
    }
    
}
