package Conditional_Statement.if_else_statement;

import java.util.Scanner;

public class Greatest_of_three_numbers {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the 1st number: ");
        int num1 = sc.nextInt();

        System.out.println("Enter the 2nd number: ");
        int num2 = sc.nextInt();

        System.out.println("Enter the 3rd number: ");
        int num3 = sc.nextInt();

        if(num1 > num2 && num1 > num3){
            System.out.println("Num 1 is greatest");
        }
        else if(num2 > num3){
            System.out.println("Num 2 is greatest");
        }
        else{
            System.out.println("Num 3 is greatest");
        }
        sc.close();
    }
}
