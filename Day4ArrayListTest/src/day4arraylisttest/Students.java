/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package day4arraylisttest;

import java.util.Comparator;

/**
 *
 * @author macstudent
 */
public class Students {
    
    int id;
    String name;
    double percentage;
    
    Students()
    {
        this.id = 0;
        this.name = "Unknown";
        this.percentage = 0;
    }
    
    Students(int Id, String Name, double per)
    {
        this.id = Id;
        this.name = Name;  
        this.percentage = per;
    }
    
    void setID(int ID)
    {
        this.id = ID;
    }
    
    int getID()
    {
        return this.id;
    }
    
    void setTitle(String nm)
    {
        this.name = nm;
    }
    
    String getTitle()
    {
        return this.name;
    }
    
    void setReting(int pr)
    {
        this.percentage = pr;
    }
    
    double getRating()
    {
        return this.percentage;
    }
    
    void displayInfo()
    {
        System.out.println("Student Id : "+this.id+"\n Name : "+this.name+"\n Percentage : "+this.percentage);
    }
    
    
}

class StudentNameComparator implements Comparator<Students>
{

        @Override
        public int compare(Students o1, Students o2) {
            return o1.name.compareToIgnoreCase(o2.name);
        }
        
}

class studentPercentageComparator implements Comparator<Students>
{

    @Override
    public int compare(Students o1, Students o2) {
        if (o1.id == o2.id)
            return 0;
        else if (o1.id > o2.id)
            return 1;
        else
            return -1;
    }
    
}
