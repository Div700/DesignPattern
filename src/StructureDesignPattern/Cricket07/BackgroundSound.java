/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package StructureDesignPattern.Cricket07;

/**
 *
 * @author Divyansh
 */
public class BackgroundSound implements Resource
{    

    @Override
    public void useResource()
    {
        System.out.println("Background sound containing crowd and field noise");
    }
}
