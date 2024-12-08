package Strings;

import java.util.Scanner;

public class beginning_substring {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string");
        String name = sc.nextLine();

        System.out.println("Enter the beginning index of the string");
        int beginning_index = sc.nextInt();

        String sustring = name.substring(beginning_index);
        System.out.println("The beginning of the substring is  " + sustring);
        sc.close();

    }
}

/*
substring():- Returns the substring from start to end.
*/