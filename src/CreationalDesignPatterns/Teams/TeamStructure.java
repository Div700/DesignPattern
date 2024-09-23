/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package CreationalDesignPatterns.Teams;

/**
 *
 * @author Divyansh
 */
public interface TeamStructure
{
    void addMember(String name, String email, String rollNumber);
    void removeMember(String rollNumber);
}
