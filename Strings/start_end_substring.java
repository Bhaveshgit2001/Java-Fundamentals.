package Strings;

import java.util.Scanner;

public class start_end_substring {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string: ");
        String name = sc.nextLine();
        
        System.out.println("Enter the starting index of the string: ");
        int start_index = sc.nextInt();

        System.out.println("Enter the end index of the string: ");
        int end_index = sc.nextInt();

        String subString = name.substring(start_index, end_index);
        System.out.println("The new string is: " + subString);
        sc.close();
    } 
}
