package Strings;

import java.util.Scanner;

public class replace {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string: ");
        String name = sc.nextLine();

        System.out.println("Enter the character in the string need to be replaced: ");
        String old_char = sc.nextLine();

        System.out.println("Enter the replacement of old character");
        String new_char = sc.nextLine();

        String reString = name.replace(old_char , new_char);
        System.out.println("The replaced character is " + reString);
        sc.close();

    }
}
