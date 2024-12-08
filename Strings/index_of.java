package Strings;

import java.util.Scanner;

public class index_of {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string: ");
        String name = sc.nextLine();

        System.out.println("Enter the substring of the string to know its first occurence in the index:");
        String substring_index = sc.nextLine();

        int indString = name.indexOf(substring_index);
        System.out.println("The index of the substring is occuring at: " + indString);
        sc.close();

    }
}
/*
 indexof(substring):- This method tells you on which index your
             substring is occuring first.
 */