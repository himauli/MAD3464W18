/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package day3exceptions;

/**
 *
 * @author macstudent
 */
public class Day3Exceptions {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int n1 = 10, n2 = 2;
        int ar1[] = {10, 20, 30};
        
        try
        {
            if(n2 == 0)
            {
                throw new ArithmeticException();
            }
            else
            {
                n1 = n1 / n2;
            }
            n2 = ar1[0];
            System.out.println("Value of n2 is : "+n2);
        }
        
        catch(ArithmeticException e)
        {
            System.out.println("Unable to divide by zero");
        }
        
        catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println("Array element unavilable");
        }
       
        catch(Exception e)
        {
            System.out.println("Something is wrong");
        }
        
        finally
        {
            System.out.println("Value of n : " + n1);
        }
       

    }
    
}
