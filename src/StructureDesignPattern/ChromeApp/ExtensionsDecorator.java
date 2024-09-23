/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package StructureDesignPattern.ChromeApp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Divyansh
 */
class ExtensionsDecorator extends BrowserDecorator
{
    Browser browser;
    private List<Extension> extensionsList;
    ExtensionsDecorator(Browser browser)
    {
        extensionsList = new ArrayList<>();
        this.browser = browser;
    }
    
    @Override
    public void addComponents()
    {   try {
        Extension newExtension = new Extension();
        InputStreamReader read = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(read);
        System.out.println("Enter the name of extension: ");
        String extensionName = br.readLine();
        System.out.println("Enter true if you aloow extension to access browser functionalities: ");
        boolean access = Boolean.parseBoolean(br.readLine());
        newExtension.setName(extensionName);
        newExtension.setHasAccess(access);
        extensionsList.add(newExtension);
        System.out.println("Chrome extension "+newExtension.getName()+" added successfully");
        } catch (IOException ex) {
            Logger.getLogger(ExtensionsDecorator.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    @Override
    public void renderChrome() 
    {
        browser.renderChrome();
        System.out.println("Extensions running in background: ");
        for(Extension e: extensionsList)
        {
            e.runBackground();
        }
        System.out.println("-------------------------------------------");
    }
}
