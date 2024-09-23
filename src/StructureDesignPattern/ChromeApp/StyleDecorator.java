/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package StructureDesignPattern.ChromeApp;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Divyansh
 */
class StyleDecorator extends BrowserDecorator {
    Browser browser;
    private List<String> style;
    StyleDecorator(Browser browser)
    {
        style = new ArrayList<>();
        this.browser = browser;  // Decorates the base browser
    }

    @Override
    public void addComponents()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the style to add");
        String newStyle = sc.next();
        style.add(newStyle);
    }
    
    public void renderChrome()
    {
        browser.renderChrome();
        System.out.println("Styles in your chrome customized chrome profile: ");
        for(String s:style)
        {
            System.out.println(s);
        }
    }
}


