/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package StructureDesignPattern.Cricket07;

/**
 *
 * @author Divyansh
 */
public class Player implements Resource
{
    private String name;
    private String bowlingType;
    private String battingType;

    public Player(String name, String bowlingType, String battingType) 
    {
        this.name = name;
        this.bowlingType = bowlingType;
        this.battingType = battingType;
    }
     
    @Override
    public void useResource() 
    {
        System.out.println("Plyaer "+name+" is moving");
    }

    @Override
    public String toString() 
    {
        return "Player{" + "name=" + name + ", bowlingType=" + bowlingType + ", battingType=" + battingType + '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBowlingType() {
        return bowlingType;
    }

    public void setBowlingType(String bowlingType) {
        this.bowlingType = bowlingType;
    }

    public String getBattingType() {
        return battingType;
    }

    public void setBattingType(String battingType) {
        this.battingType = battingType;
    }
    
    
}
