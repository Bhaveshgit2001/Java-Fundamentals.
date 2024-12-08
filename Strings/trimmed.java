package Strings;

import java.util.Scanner;

public class trimmed {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string: ");
        String non_trimmed_String = sc.nextLine();
        String trimString = non_trimmed_String.trim();
        System.out.println("The trimmed string is" + trimString);
        sc.close();
    }
}

/*
 Trim string: Returns new string after removing all the leading and trailing spaces 
              from the original string.
 */
