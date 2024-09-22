/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package StructureDesignPattern.Cricket07;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Divyansh
 */
public class GameApp 
{
    public static void main(String args[]) throws IOException
    {
        InputStreamReader read = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(read);
        
        int choice = 1;
        String name,bowling,batting;
        Match match = new Match();
        EntityMotion compositeMotion = new EntityMotion();
        Sound compositeSound = new Sound();
        BackgroundSound bg = new BackgroundSound();
        compositeSound.addComponent(bg);
        Commentator commentator = new Commentator();
        compositeSound.addComponent(commentator);
        while(choice != 0)
        {
                System.out.println("Enter 1 to create a new player\n Enter 2 to configure the commentator\n Enter 3 to start match\n Enter 0 to exit program");
                choice = Integer.parseInt(br.readLine()); // Catching NumberFormatException
                
                switch(choice)
                {
                    case 1:
                        System.out.println("Enter player name: ");
                        name = br.readLine();
                        System.out.println("Enter bowling type");
                        bowling = br.readLine();
                        System.out.println("Enter the batting type");
                        batting = br.readLine();
                        Player p =new Player(name,bowling,batting);
                        compositeMotion.addComponent(p);
                    break;
                        
                    case 2:
                        System.out.println("Enter the name of commentator: ");
                        name = br.readLine();
                        System.out.println("Enter the language of commentator: ");
                        String language = br.readLine();
                        System.out.println("Enter the accent of commentator: ");
                        String accent = br.readLine();
                        commentator.setLanguage(language);
                        commentator.setName(name);
                        commentator.setAccent(accent);
                        break;
                    
                    case 3:
                        System.out.println("team 1 name ");
                        String team1 = br.readLine();
                        System.out.println("team 2 name ");
                        String team2 = br.readLine();
                        match.setTeam1(team1);
                        match.setTeam2(team2);
                        System.out.println("Enter colour for the ball (Pink or red for test and white for limited overs)");
                        String colour = br.readLine();
                        Bowl bowl = new Bowl(colour);
                        compositeMotion.addComponent(bowl);
                       
                        //adding the required components in the match object
                        match.addComponent(compositeSound);
                        match.addComponent(compositeMotion);
                        
                            System.out.println("The match has now started!!");
                        while(choice!=0)
                        {
                            System.out.println("Enter 1 to bowl or bat\n 2 to stop sound sound\n Enter 3 to change the commentator\nEnter 4 to stop background noise\nEnter 0 to close game");
                            choice = Integer.parseInt(br.readLine());
                            switch(choice)
                            {
                                case 1 :
                                    match.useResource();
                                break;
                                case 2:
                                   match.removeComponent(compositeSound);
                                break;
                                case 3:
                                    System.out.println("Enter the name of commentator: ");
                                    name = br.readLine();
                                    System.out.println("Enter the language of commentator: ");
                                    language = br.readLine();
                                    System.out.println("Enter the accent of commentator: ");
                                    accent = br.readLine();
                                    commentator.setLanguage(language);
                                    commentator.setName(name);
                                    commentator.setAccent(accent);
                                break;
                                case 4:
                                    compositeSound.removeComponent(bg);
                                break;
                                
                                case 0:
                                    System.out.println("Thankyou for playing!");
                                break;
                                default:
                                    System.out.println("Please enter correct choice");
                            }
                        }
                        break;
                    
                    case 0:
                        System.out.println("Exiting program...");
                        break;
                    
                    default:
                        System.out.println("Please pick a correct choice");
                }
            }
    }
}
