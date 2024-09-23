/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package StructureDesignPattern.ChromeApp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Divyansh
 */
public class ChromeAppMain 
{
    public static void main(String args[]) throws IOException 
    {
        Browser browser = new GoogleChrome();
        browser.renderChrome();  // Render the browser
        
        BrowserDecorator styledBrowser = new StyleDecorator(browser);
        styledBrowser.renderChrome();  // Render browser with added style
        
        // Chain multiple decorators (e.g., adding both style and extensions)
        BrowserDecorator extendedStyledBrowser = new ExtensionsDecorator(styledBrowser);
        extendedStyledBrowser.renderChrome();  // Render light browser with style and extensions
        
        InputStreamReader read = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(read);
        String extensionName;
        boolean access;
        int choice = 1;
        while(choice != 0)
        {
                System.out.println("Enter 1 to add mew style to chrome\n Enter 2 to download a new extension\n Enter 3 to view chrome details\nEnter 0 to exit program");
                choice = Integer.parseInt(br.readLine()); // Catching NumberFormatException
                
                switch(choice)
                {
                    case 1:
                        styledBrowser.addComponents();
                    break;
                        
                    case 2:
                        
                        extendedStyledBrowser.addComponents();
                        break;
                    
                    case 3:
                        extendedStyledBrowser.renderChrome();
                    break;
                    
                    case 0:
                        System.out.println("Exiting program...");
                        break;
                    
                    default:
                        System.out.println("Please pick a correct choice");
                }
            }
    }
}
