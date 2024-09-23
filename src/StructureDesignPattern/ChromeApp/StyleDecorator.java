/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package StructureDesignPattern.ChromeApp;

/**
 *
 * @author Divyansh
 */
class StyleDecorator extends BrowserDecorator {
    Browser browser;

    StyleDecorator(Browser browser) {
        this.browser = browser;  // Decorates the base browser
    }

    public void renderChrome()
    {
        browser.renderChrome();
        System.out.print(" + new style");
    }
}


