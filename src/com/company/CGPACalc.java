package com.company;

import java.util.Scanner;

public class CGPACalc {

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        int gradePoint;
        int totalUnit = 0;
        double totalGradePoint = 0.0;
        double gradePointAvg;
        int count = 1;

        System.out.print("How many courses did you take: ");
        int numOfCourses = input.nextInt();

        while (count <= numOfCourses){
            System.out.printf("Enter the %d%s course: ", count, (count == 1) ? "st" : (count == 2) ? "nd" : (count == 3) ? "rd" : "th");
            input.next();

            System.out.print("Enter the no of units: ");
            int unit = input.nextInt();
            totalUnit += unit;

            System.out.print("Enter the grade: ");
            int grade = convert(input.next().charAt(0));

            gradePoint = unit * grade;
            //System.out.println("Value of grade point is "+ gradePoint);
            totalGradePoint += gradePoint;

            count++;
        }
        gradePointAvg = totalGradePoint / totalUnit;

        System.out.println("\nTotal unit is " + totalUnit);
        System.out.println("Total Grade Point is " + totalGradePoint);
        System.out.printf("Your Grade Point Average is %.2f", gradePointAvg);

    }

    //This method converts a particular grade to its corresponding grade value(number)
    public static int convert(char grade){
        switch (grade){
        //A = 5; B = 4; C = 3; D = 2; E = 1; F = 0;
            case 'A': return 5;
            case 'B': return 4;
            case 'C': return 3;
            case 'D': return 2;
            case 'E': return 1;
            case 'F': return 0;
        }
        return grade;
    }
}
