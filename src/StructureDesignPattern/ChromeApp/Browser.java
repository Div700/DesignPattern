/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package StructureDesignPattern.ChromeApp;

/**
 *
 * @author Divyansh
 */
abstract class Browser 
{

    abstract void renderChrome();  // Renders the chrome interface (the browser)

    void displaySearchEngine() 
    {
        System.out.println("Google search engine is present");
    }
}

