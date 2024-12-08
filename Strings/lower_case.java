package Strings;

import java.util.Scanner;

public class lower_case {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String");
        String name = sc.nextLine();
        String lString = name.toLowerCase();
        System.out.println("Conversion of Uppercase characters to Lowercase characters is: " + lString);
        sc.close();
    }
}
