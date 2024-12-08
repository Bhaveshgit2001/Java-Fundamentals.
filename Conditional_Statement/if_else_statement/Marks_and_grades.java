package Conditional_Statement.if_else_statement;

import java.util.Scanner;

public class Marks_and_grades {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the marks");
        int marks = sc.nextInt();

        if(marks > 100){
            System.out.println("Invalid! Enter the Marks again");
        }
        else if(marks >= 80 && marks < 100){
            System.out.println("A grade");
        }
        else if(marks >= 60 && marks < 80){
            System.out.println("B grade");
        }
        else if(marks >= 40 && marks  < 60){
            System.out.println("C grade");
        }
        else{
            System.out.println("Fail");
        }
        sc.close();
    }
}
