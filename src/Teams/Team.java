package Teams;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Team implements Cloneable,TeamStructure 
{
    private String teamId;
    private String teamName; // name of the team
    private Map<String,Member> members;
    // Getter and Setter for teamName
    public Team()
    {
        members = new HashMap<>();
    }
    
    public String getTeamName() {
        return teamName;
    }

    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }

    // Getter and Setter for members
    public Map<String,Member> getMembers() {
        return members;
    }

    public void setMembers(Map<String,Member> members) {
        this.members = members;
    }

    public String getTeamId() {
        return teamId;
    }

    public void setTeamId(String teamId) {
        this.teamId = teamId;
    }

    // Method to add member data
    @Override
    public void addMember(String name, String email, String rollNumber) {
        Member member = new Member();
        member.setName(name);
        member.setEmail(email);
        member.setRollNumber(rollNumber);
        members.put(rollNumber, member);
    }

    @Override
    public void removeMember(String rollNumber) 
    {
        members.remove(rollNumber); //removing the student from the team
    }
    
    // Method to display team details
    public void display() {
        System.out.println("Team: " + this.teamName);
        System.out.println("Member Details: ");
        for(Member member:members.values())
        {
             System.out.println("Name: " + member.getName() + ", Email: " + member.getEmail() + ", Roll Number: " + member.getRollNumber());
        }
    }

    // Overriding clone() method for deep cloning (Prototype Pattern)
    @Override
    protected Team clone() throws CloneNotSupportedException 
    {
        System.out.println("Cloning of the team object");
        Team clonedTeam = (Team)(super.clone());
        clonedTeam.setTeamName(this.teamName);
        clonedTeam.setMembers(new HashMap<>(this.members)); //deep cloning the hashmap list
        return clonedTeam;
    }

    @Override
    public String toString() {
        return "Team{" + "teamName=" + teamName + ", members=" + members + '}';
    }
    
}
