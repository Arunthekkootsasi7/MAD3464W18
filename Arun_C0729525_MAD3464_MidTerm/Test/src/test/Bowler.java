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
public class Bowler extends Player {
    
    int noOverThrown;
    int noRunsGiven;
    int noWicketsTaken;
    int runsPerOver;
    int runsPerWicket;
    int bowlingPoints;
    
    @Override
    void readData(){
        
        super.readData();
         Scanner obj = new Scanner(System.in);
        System.out.println("No.of overs thrown" );
       
        this.noOverThrown = obj.nextInt();
        System.out.println("No. of runs given ");
       
        this.noRunsGiven = obj.nextInt();
        System.out.println("No. of wickets taken ");
        this.noWicketsTaken = obj.nextInt();
    }
    
    @Override
    void displayData(){
        System.out.println("The player type: Bowler  ");
        
        super.displayData();   
       
        System.out.println("Bowler details :");
       
        System.out.println("noOversThrown :" + this.noOverThrown);
        System.out.println("noRunsGiven :" + this.noRunsGiven);
        System.out.println("noWicketsTaken :" + this.noWicketsTaken);
        System.out.println("runsPerOver :" + this.runsPerOver);
        System.out.println("runsPerWicket :" + this.runsPerWicket);
        System.out.println("bowlingPoints :" + this.bowlingPoints);
    }
    
    void calAvg(){
        if(this.noOverThrown == 0){
            System.out.println("No. of overs thrown is nil");
            
        }
        else{ 
            this.runsPerOver = (noRunsGiven/noOverThrown);
        }
        
        if(this.noWicketsTaken ==0){
            System.out.println("No of wickets taken is zero. Player has not taken any wickets");
            
           }
        
        else{this.runsPerWicket= (noRunsGiven/noWicketsTaken);
        }
    }
void calPoints(){
    
    int points = 0;
    points = points+ ( 5 * this.noWicketsTaken);
    
     if (this.runsPerOver > 3)
        { 
            points = points + 5;
                    
        }
        
       if (this.runsPerOver == 3 || this.runsPerOver == 2 || this.runsPerOver == 1 )
        
       {
           points = points + 10;
       }
       
       
        System.out.println("The points for bowler :" + super.PlayerName + "is" + points);
    }
    }
