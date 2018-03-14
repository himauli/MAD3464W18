/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inheritence;

/**
 *
 * @author macstudent
 */
public class Inheritence {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Person one = new Person();
        
        one.display();
        
        Person sreejith  = new Person("Sreejith", "Thrivikraman", 10);
        sreejith.display();
        
        Person sreejith2 = new Person(sreejith);
        sreejith2.display();
        
//        Employee e1 = new Employee(1425.00);
//        e1.display();
        
        Employee e2 = new Employee();
        e2.display();
        
        e2.firstName = "Himauli";
        e2.lastName = "Patel";
        e2.age = 22;
        e2.salary = 1000;
        //e2.displayData();
        e2.display();
        
        //System.out.println("Last Name : "+e2.lastName);
        
        //Method Overriding
        Employee e3 = new Employee();
        e3.read();
        e3.display();
        
        
    }
    
}
