package Conditional_Statement;

import java.util.Scanner;

public class Area_and_perimeter_rectangle {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of the rectangle");
        int length = sc.nextInt();

        System.out.println("Enter the breadth of the rectangle");
        int breadth = sc.nextInt();

        int area = length*breadth;
        System.out.println("The area of rectangle is: "+ area);

        int perimeter = 2*(length+breadth);
        System.out.println("The perimeter of rectangle is: "+ perimeter);
        if(perimeter > area){
            System.out.println("The perimeter is greater than area");
        }
        else{
            System.out.println("The area is greater than perimeter");
        }
        sc.close();
    }
}
