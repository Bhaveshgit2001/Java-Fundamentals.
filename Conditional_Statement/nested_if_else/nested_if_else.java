package Conditional_Statement.nested_if_else;

import java.util.Scanner;

public class nested_if_else {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the age: ");
        int age = sc.nextInt();

        System.out.println("Enter the weight: ");
        float weight = sc.nextFloat();

        if(age >=18){
            if(weight >= 60){
                System.out.println("You are eligible to donate weight");
            }
            else{
                System.out.println("You are not eligible to donate the blood");
            }
        }
        else{
            System.out.println("You are under age ");
        }
        sc.close();
    }    
}
