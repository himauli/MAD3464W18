/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package day4abstract;

/**
 *
 * @author macstudent
 */
public class Shape {
    
    public static void main(String args[])
    {
        Circle c1 = new Circle();
        c1.draw();
        c1.display("It's a circle!!!");
        
    }
}

abstract class MyShape
{
    
    int x;
    int y;
    
    abstract void draw();
    
    void display(String msg)
    {
        System.out.println(msg);
    }
    
}
class Circle extends MyShape
{

    @Override
    void draw() {
        System.out.println("Drawing circle");
        super.x = 20;
        super.y = 30;
        System.out.println("x = "+super.x+" y = "+super.y);
    }
}

abstract class Rectangle extends MyShape
{
    int h;
    
    abstract void draw();
}