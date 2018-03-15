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
class testException extends Exception
{
    public testException(String message){
        super(message);
    }
}
public class CustomizeException {
    
    public static void main(String args[]) throws Exception
    {
        int n1 = 10;
        
        try{
            if(n1 == 10)
            {
                throw new testException("Test unsucessful");
            }
        }
        catch(testException e)
        {
            System.out.println("Customized Exception");
            System.out.println(e.getMessage());
            System.out.println(e.getStackTrace());
        }
                    
               
    }
    
}
