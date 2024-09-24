/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package CreationalDesignPatterns.Teams;

/**
 *
 * @author Divyansh
 */
//interface for all the teams to follow
public interface TeamStructure
{
    //function to add a member in the team
    void addMember(String name, String email, String rollNumber);
    //function to remove a member from the team
    void removeMember(String rollNumber);
}
