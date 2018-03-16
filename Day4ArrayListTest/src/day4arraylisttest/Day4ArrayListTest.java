/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package day4arraylisttest;

import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author macstudent
 */
public class Day4ArrayListTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Books book1 = new Books(1, "The Sky", 8);
        Books book2 = new Books(2, "Necklace", 3);
        Books book3 = new Books(3, "Milk", 2);
        Books book4 = new Books(4, "Journey", 3);
        Books book5 = new Books(5, "Wonderer", 4);
        
        ArrayList<Books> library = new ArrayList<Books>();
        library.add(book1);
        library.add(book2);
        library.add(book3);
        library.add(book4);
        library.add(book5);
        
        System.out.println("No. of Books : "+library.size());
        
        for (Books bk: library)
        {
            //bk.displayInfo();
        }
        
        library.add(2, new Books(10, "Pecific", 9));
        
        library.forEach(bk -> {
            bk.displayInfo();
        });
        
        Students s1 = new Students(1,"Himauli",93.20);
        Students s2 = new Students(2,"Foram",95.00);
        Students s3 = new Students(3,"Harsh",97.75);
        
        ArrayList<Students> marks = new ArrayList<Students>();
        marks.add(s1);
        marks.add(s2);
        marks.add(s3);
        
        System.out.println("No. of Students : "+marks.size());
        
        for (Students s: marks)
        {
            s.displayInfo();
        }
        
        
        
        Collections.sort(library, new bookIdComparator());
        System.out.println("---Order by Book Id---");
        for(Books bk : library)
        {
            bk.displayInfo();
        }
        
        Collections.sort(library, new bookTitleComparator());
        System.out.println("---Order by Book Title---");
        for(Books bk : library)
        {
            bk.displayInfo();
        }
        
        Collections.sort(library, new bookRatingComparator());
        System.out.println("---Order by Book Ratings---");
        for(Books bk : library)
        {
            bk.displayInfo();
        }
        
        
        Collections.sort(marks, new StudentNameComparator());
        System.out.println("---Order by Student Name---");
        for(Students s : marks)
        {
            s.displayInfo();
        }
        
        Collections.sort(marks, new studentPercentageComparator());
        System.out.println("---Order by Student Percentage---");
        for(Students s : marks)
        {
            s.displayInfo();
        }
       
    }
    
}
