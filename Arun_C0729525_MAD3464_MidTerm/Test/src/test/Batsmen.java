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
public class Batsmen extends Player {
    
     int noBowlsPlayed, strikeRate, totalRuns, batingPoints,l,m,n;
    int runsTaken[] = new int[6];
    
    @Override
    void readData(){
        super.readData();
        Scanner input = new Scanner(System.in);
       System.out.println("Enter the No of Bowls Played :");
       this.noBowlsPlayed = input.nextInt(); 
       System.out.println("Enter the No Runs Taken :");
       for(int i = 0; i < runsTaken.length; i++){
           
           this.runsTaken[i] = input.nextInt();
           
           if(i == 0){
            l = this.runsTaken[0];  //stores ones  4s
           }
           else if(i==3){
             //this.runsTaken[3] = input.nextInt();  
             m = this.runsTaken[3];  //stores 
           }
           else if(i==5)
               n = this.runsTaken[5];
       }
        
    }
    @Override
    void displayData(){
        System.out.println("***** Type : Batsman *****");
        super.displayData();
        System.out.println("No of Bowls Played : "+this.noBowlsPlayed+"\n1s "+l+"\n4s "+m+"\n6s "+n);
        
        calAvg();
        calPoints();
    }
    void calAvg(){
        int sum = 0;
        for(int i = 0; i < runsTaken.length; i++){
         sum += runsTaken[i];     
        }
        totalRuns = sum;
        System.out.println("Total Runs: "+totalRuns);
        strikeRate = totalRuns/noBowlsPlayed;
        System.out.println("Strike Rate: "+strikeRate);
        
    }
    void calPoints(){
        
        batingPoints = 0;
        int the_batingPoints = (batingPoints + (5 * this.n)) + (batingPoints = batingPoints + (3 * this.m));
        System.out.println("Total Bating Points of the player : "+the_batingPoints);
        
        
        
        
    }
}