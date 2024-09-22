/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BehaviouralDesignPattern.StudentPortal;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author Divyansh
 */
public class ProgressKeeper
{
    String studentID;
    Map<String,List<Sheet_Memento>> sheet_memento_list;
    
    public ProgressKeeper(String studentID)
    {
        this.studentID = studentID;
        sheet_memento_list = new HashMap<>();
    }
    
    public void addMemento(Sheet_Memento sheetSnapshot,String topic)
    {
        if(!sheet_memento_list.containsKey(topic))
        {
            List<Sheet_Memento> newList = new ArrayList<>();
            sheet_memento_list.put(topic, newList);
        }
        sheet_memento_list.get(topic).add(sheetSnapshot); //adding the memento in the list for that topic
    }
    
    public List<Sheet_Memento> getMementoList(String topic)
    {
        try
        {
        return sheet_memento_list.get(topic);
        }
        catch(NullPointerException ne)
        {
            System.out.println("No such sheet exists");
            return null;
        }
    }
    public void printReport(String topic)
    {
        System.out.println(sheet_memento_list.get(topic));
    }
}
