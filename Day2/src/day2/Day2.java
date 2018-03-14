/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package day2;

import java.util.Scanner;

/**
 *
 * @author macstudent
 */
public class Day2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //Create a new object of Bank class
        
        Bank myBank = new Bank();
        System.out.println("Bank ID : "+myBank.bankID);
        System.out.println("Bank Name : "+myBank.bankName);
        
        Bank yourBank = new Bank();
        myBank.bankID = 1231;
        myBank.bankName = "RBC";
        System.out.println("Bank ID : "+myBank.bankID);
        System.out.println("Bank Name : "+myBank.bankName);
        
        
        yourBank.getBankName();
        
        yourBank.setBankName("Scotia");
        yourBank.getBankName();
        
        Scanner myInput = new Scanner(System.in);
        String name;
        
        System.out.println("Enter Bank Name : ");
        name = myInput.nextLine();
        
        yourBank.setBankName(name);
        yourBank.getBankName();
        
        
        //create object Arithmetic class
        Arithmetic operation1 = new Arithmetic();
        operation1.addition(10, 20);
        
        System.out.println("Output of integer addition is : " +operation1.addition(10, 20));
        System.out.println("Output of float addition is : " +operation1.addition(10.23f, 20.23f));
        System.out.println("Output of integer addition is : " +operation1.addition(10, 20, 30));
        System.out.println("Output of multiplication is : " +operation1.multiplication(10, 20, 30));
        
        Arithmetic.multiplication(10, 20);
        
        
        Arithmetic.n1 = 20; 
        //Arithmetic.n2 = 20;
        System.out.println(Arithmetic.n1 + " " + Arithmetic.n2);
    }
    
}
