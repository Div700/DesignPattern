/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package StructureDesignPattern.ChromeApp;

/**
 *
 * @author Divyansh
 */
class ExtensionsDecorator extends BrowserDecorator
{
    Browser browser;

    ExtensionsDecorator(Browser browser)
    {
        this.browser = browser;
    }

    public void renderChrome() 
    {
        browser.renderChrome();
        System.out.print(" + extension");
    }
}
