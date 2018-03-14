/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reservationsystem;

import java.util.Scanner;

/**
 *
 * @author macstudent
 */
public class AirlineReservationSystem {

    boolean[] seat = new boolean[11];
    Scanner input = new Scanner(System.in);
    
    
    public void start()
    {       
        while ( true )
        {
            makeReservation();
        }   
    }
    
    public void makeReservation()
    {
        System.out.println("Please type 1 for Smoking or 2 for Non Smoking: ");
        int section = input.nextInt();
        if ( section == 1 )
        {
            smoking();
        }
        else if (section == 2)
        {
            nonSmoking();
        }
        else
        {
            System.out.println("No Selection Available");
        }
    }
    
    public void smoking() 
    {
        for ( int count = 1; count <= 5; count++ )
        {
            if ( seat[count] == false ) 
            {
                seat[count] = true; 
                System.out.printf("Smoking. Seat# %d\n", count);
                break;
            }
            else if ( seat[5] == true )
            {
                if ( seat[10] == true) 
                {
                    System.out.println("Sorry, flight fully booked. Next flight is in 3 hours.");
                }
                else 
                {
                    System.out.println("Non Smoking is fully booked. Would you like Non Smoking? 1 for Yes 2 for No");
                    int choice = input.nextInt();
                    if ( choice == 1 )
                    {
                        nonSmoking();
                        start();
                    }
                    else
                    {
                        System.out.println("Next flight is in 3 hours.");
                        System.exit(0);
                    }
                }
            }
        }
    }   
     
    public void nonSmoking() 
    {
        for ( int count = 6; count <= 10; count++ )
        {
            if ( seat[count] == false ) 
            {
                seat[count] = true; 
                System.out.printf("Non Smoking. Seat# %d\n", count);
                break;
            }
            else if ( seat[10] == true ) 
            {
                if ( seat[5] == true) 
                {
                    System.out.println("Sorry, flight fully booked. Next flight is in 3 hours.");
                    System.exit(0);
                }
                else 
                {
                    System.out.println("Non Smoking is fully booked. Would you like Smoking? 1 for Yes 2 for No");
                    int choice = input.nextInt();
                    if ( choice == 1 )
                    {
                        smoking();
                        start();
                    }
                    else
                    {
                        System.out.println("Next flight is in 3 hours");
                        System.exit(0);
                    }
                }
            }
        }
    }

}
