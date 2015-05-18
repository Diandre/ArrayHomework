/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arrayhw;

import java.util.Scanner;

/**
 *
 * @author programming
 */
public class ArrayHw {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int Total = 0;
        double Average = 0;
        double standardDeviation = 0;
       
        //Ask for number of students.
    System.out.println("What is the number of students? ");
    int Students = keyboard.nextInt();
    //Ask for grades for each student.
    for (int i=0; i<Students ;i++)
    {
    System.out.println("What grades did each student get? ");
    int Grades = keyboard.nextInt();
    Total = Total + Grades;
    standardDeviation= standardDeviation + Math.sqrt( Math.pow(Grades-Average,2.0));
    }//Calculate student's average grades
    Average = (Total / Students);
    System.out.println("The average of the student's grades are: " + Average);
    // Calculate Standard Deviation
    System.out.println("The standard deviation is: " + standardDeviation);
    }
    
}
