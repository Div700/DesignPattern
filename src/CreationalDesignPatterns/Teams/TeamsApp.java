package CreationalDesignPatterns.Teams;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class TeamsApp 
{

    public static void main(String[] args) throws CloneNotSupportedException, IOException
    {
        //Map to store all microsoft teams with their ID as the key
        Map<String,Team> allTeams = new HashMap<>();
        //reader for taking input from console
        InputStreamReader read=new InputStreamReader(System.in);
        BufferedReader br=new BufferedReader(read);
        //Team object t
    Team t;
    int choice =1;
    //loop until user decided to exit application
    while(choice !=3)
    {System.out.println("Enter 1 to create a general division team\n Enter 2 to create a common subject team\n Enter 3 quit the application"); 
    choice=Integer.parseInt(br.readLine());
    switch(choice)
    {
        case 1:
            //creating a new general division team
            t = new Team();
            System.out.println("Enter the name of general division team class");
            String name = br.readLine();
            System.out.println("Enter the id of general division team class");
            String id = br.readLine();
            t.setTeamName(name);
            t.setTeamId(id);
            //Adding members to the created general team
            System.out.println("Enter the number of members for this team: ");
            int numberOfMembers = Integer.parseInt(br.readLine());
            //adding members in the team
            for (int i = 1; i <= numberOfMembers; i++) 
            {
            System.out.println("Enter student "+i+" name:");
            String studentName = br.readLine();
            System.out.println("Enter student "+i+" roll number:");
            String rollNumber = br.readLine();
            System.out.println("Enter student "+i+" email:");
            String email = br.readLine();
            t.addMember(studentName, email, rollNumber);
            }
            System.out.println("Team created successfully");
            allTeams.put(id, t);
            System.out.println("Team details: "+t.toString());
        break;
        
        case 2:
            //creating a common subject team by cloning an existing team
            System.out.println("Enter the team id whose common teams is to be created: ");
            id = br.readLine();
            Team commonTeam;
            t = allTeams.get(id);
            if(t == null)
            {
                //if no such team exists then show error and continue
                System.out.println("No such team exists");
                continue;
            }
            
            //cloning the main team object instead of creating a new one
            commonTeam = (Team)(t.clone());
            
            System.out.println("Enter the name of common team class");
            name = br.readLine();
            System.out.println("Enter the id of common team class");
            id = br.readLine();
            commonTeam.setTeamName(name);
            commonTeam.setTeamId(id);
            System.out.println("Do you want to remove any members from this team: Enter true or false");
            boolean isRemove = Boolean.parseBoolean(br.readLine());
            if(isRemove)
            {
                //option to remove members from the cloned team
                System.out.println("Enter the number of members to be removed: ");
                int toBeRemoved = Integer.parseInt(br.readLine());
                for(int i=1;i<=toBeRemoved;i++)
                {
                    System.out.println("Enter the id to be removed: ");
                    commonTeam.removeMember(br.readLine());
                }
            }
            System.out.println("Team created successfully");
            //storing the newly created team in map of all teams
            allTeams.put(id, commonTeam);
            System.out.println("Team details: "+t.toString());
            
        break;
        
        case 3:
            System.out.println("Thankyou for using teams!!");
        
        default:
            System.out.println("WRONG CHOICE");
    }
    }
    //closing input streams
    read.close();
    br.close();
    //displaying all teams before quitting the application
        System.out.println("-----All team details-----");
        for(Team teams:allTeams.values())
        {
            teams.display();
        }
        
    }
}
