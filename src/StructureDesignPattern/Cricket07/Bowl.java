/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package StructureDesignPattern.Cricket07;

/**
 *
 * @author Divyansh
 */
public class Bowl implements Resource
{
    String colour;
    private int ball;
    private int over;
    public Bowl(String colour) {
        this.colour = colour;
        this.ball = 0;
        this.over = 0;
    }

    @Override
    public void useResource() 
    {
        System.out.println(colour+" ball moving : Over "+over+"."+ball);
        ball ++;
        if(ball%6==0)
            over++;
    }

    @Override
    public String toString() {
        return "Bowl{" + "colour=" + colour + ", oversOld=" + ball + '}';
    }
    
}
