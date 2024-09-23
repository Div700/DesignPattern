/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package StructureDesignPattern.ChromeApp;

/**
 *
 * @author Divyansh
 */
public class GoogleChrome extends Browser
{
    public GoogleChrome()
    {
        System.out.println("Starting google chrome");
        super.displaySearchEngine();
    }
    @Override
    public void renderChrome() 
    {
        System.out.print("Currently viewing Google Chrome");
        
    }
}
