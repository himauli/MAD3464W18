/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classactivity;

import java.util.Scanner;


/**
 *
 * @author macstudent
 */


public class ClassActivity {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
//        Person p1 = new Person();
//        p1.readData();
//        p1.displayData();
//        
//        Employee e1 = new Employee();
//        e1.readValues();
//        e1.displayValues();

           Faculty f1 = new Faculty();
           f1.readData();
           f1.readValues();
           f1.setData();
           f1.displayData();
           f1.displayValues();
           f1.getData();
    }
    
}

interface Person 
{
    public void readData();
    public void displayData();
    
    
}

interface Employee
{
    public void readValues();
    public void displayValues();
            
}

class Faculty implements Person,Employee
{
    String name;
    int age ;
    String type;
    double salary;
    String course;
 
    
    @Override 
    public void readData()
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Name : ");
        this.name = input.nextLine();
        
        System.out.print("Enter Age : ");
        this.age = input.nextInt();
    }
    
    @Override
    public void displayData()
    {
        System.out.println("Name : "+this.name+"\nAge : "+this.age);
    }
    
    @Override
    public void readValues()
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Job Type : ");
        this.type = input.nextLine();
        
        System.out.print("Enter Salary : ");
        this.salary = input.nextInt();
    }
    
    @Override
    public void displayValues()
    {
        System.out.println("Job type is : "+this.type+"\nSalary : "+this.salary);
    }
    
    public void setData()
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Course : ");
        this.course = input.nextLine();
        
    }
    
    public void getData()
    {
         System.out.println("Course is : "+this.course);
    }
    
}
