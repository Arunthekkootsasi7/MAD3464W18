/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import java.util.Scanner;
/**
 *
 * @author macstudent
 */
public class Player {
    
 String PlayerID;
    String PlayerName;
    
   
    
   void readData()
   {
       Scanner myinput = new Scanner(System.in);
       System.out.println("Enter the player Id");
       this.PlayerID= myinput.nextLine();
      System.out.println("Enter the player name");
     this.PlayerName = myinput.nextLine();
      
      
    }
        
    void displayData(){
    System.out.println("The player Id is " + this.PlayerID);
    System.out.println("The player name is" + this.PlayerName);
    
    }

    void player_type(String n1) {
    
    if (n1 == "Batsman")
        {
            Batsmen obj1 = new Batsmen();
            obj1.readData();
            obj1.calAvg();
            obj1.calPoints();
            obj1.displayData();
                    
        }
        
        if (n1 == "Bowler")
        {
            Bowler bowlerobj = new Bowler();
            bowlerobj.readData();
            bowlerobj.calAvg();
            bowlerobj.calPoints();
            bowlerobj.displayData();
            
        }

    }
    }
    

 