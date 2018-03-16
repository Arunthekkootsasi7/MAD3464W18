/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reservation;

import java.util.Scanner;

/**
 *
 * @author sree
 */
public class Reservation {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    
    {   int capacity,seat_no;
        char choice = 'Y';
        // TODO code application logic here
        
//      ReservatnSystem RS = new ReservatnSystem();
//      Scanner input = new Scanner(System.in);
//      
//      System.out.println("Enter the seating capacity:");
//      capacity = input.nextInt();
//      RS.assign_capacity(capacity);
//      
//     while (choice == 'Y')
//      {
//      System.out.println("Enter the seat no# for booking:");
//      seat_no = input.nextInt();
//      RS.assign_seat(seat_no);
//      
//      System.out.println("Continue ? (Y/N)");
//      choice = input.next().charAt(0);
//      
//      }
     
     AirlineReservationSystem ARS = new AirlineReservationSystem();
     ARS.make_reservation();
      
    }
    
}
