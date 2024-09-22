/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package StructureDesignPattern.Cricket07;

/**
 *
 * @author Divyansh
 */
public class Commentator implements Resource
{
    private String name;
    private String language;
    private String accent;

    public Commentator() 
    {
        this.name = "Ravi Shastri";
        this.language = "English";
        this.accent = "Indian";
    }
    
    @Override
    public void useResource() 
    {
        System.out.println("Commentator "+name+" speaking in "+language+" with accent "+accent);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getAccent() {
        return accent;
    }

    public void setAccent(String accent) {
        this.accent = accent;
    }
    
}
