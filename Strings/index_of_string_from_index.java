package Strings;

import java.util.Scanner;

public class index_of_string_from_index {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string");
        String name = sc.nextLine();

        System.out.println("Enter the Substring: ");
        String subString = sc.nextLine();

        System.out.println("Enter the index from where we want to start the search of the substring: ");
        int from_index = sc.nextInt();

        int index_of = name.indexOf(subString , from_index);
        System.out.println("The index of the string from where we want to start search of the substring is : " + index_of);
        sc.close();   
    }
}

/*
 indexof(substring, fromindex):_ This will help you to start the search of the
                                 substring from the index of your choice. 
 */
