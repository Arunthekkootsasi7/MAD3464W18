/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

/**
 *
 * @author macstudent
 */
import java.util.Scanner;
public class Test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
         Player[] player_objects = new Player[4];
        
        
        for (int i =0 ; i < 4; i ++)
        {
            System.out.println("Enter the type of the player : 1. Batsman \n 2. Bowler");
            Scanner obj = new Scanner(System.in);
            int choice = obj.nextInt();
            
            
            switch (choice)
            {
                case 1 :                          
                    player_objects[i] = new Player();
                    player_objects[i].player_type("Batsman");
                   
                
                 case 2:                          
                     player_objects[i] = new Player();
                     player_objects[i].player_type("Bowler");
                
                default:
                    System.out.println("Invalid entry !!!!");
                
                
            }
    }}}
    