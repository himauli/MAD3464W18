/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inheritence;

import java.util.Scanner;

/**
 *
 * @author macstudent
 */
public class Person {
    
    String firstName;
    String lastName;
    int age;
    
    //Default Constructor
    Person(){
        this.firstName =  "Unknown";
        this.lastName = "Unknown";
        this.age = 1;
    }
    
    //Parameterized Constructor
    Person(String fNm, String lNm, int age){
        this.firstName = fNm;
        this.lastName = lNm;
        this.age = age;
    }
    
    //Copy Constructor
    Person(Person object){
        
        this.firstName = object.firstName;
        this.lastName = object.lastName;
        this.age = object.age;
    }
    
    void read(){
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter First Name : ");
        this.firstName = input.nextLine();
        
        System.out.println("Enter Last Name : ");
        this.lastName = input.nextLine();
        
        System.out.println("Enter Age: ");
        this.age = input.nextInt();
    }
    
    void display(){
        
        System.out.println("First Name : " + this.firstName);
        System.out.println("Last Name : " + this.lastName);
        System.out.println("Age : " + this.age);
    }
    
}
