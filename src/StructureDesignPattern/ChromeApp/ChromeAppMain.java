/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package StructureDesignPattern.ChromeApp;

/**
 *
 * @author Divyansh
 */
public class ChromeAppMain 
{
    public static void main(String args[]) 
    {
        Browser browser = new GoogleChrome();
        browser.renderChrome();  // Render the browser

        System.out.println("\nNow adding new functionalities without inheritance");
        
        System.out.println("Adding a new style to the browser");
        BrowserDecorator styledBrowser = new StyleDecorator(browser);
        styledBrowser.renderChrome();  // Render browser with added style
        
        System.out.println("\nAdding a new extension to the browser");
        System.out.println("Adding extensions: ");
        // Chain multiple decorators (e.g., adding both style and extensions)
        BrowserDecorator extendedStyledBrowser = new ExtensionsDecorator(styledBrowser);
        extendedStyledBrowser.renderChrome();  // Render light browser with style and extensions
    }
}
