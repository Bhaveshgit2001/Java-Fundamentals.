package Strings;

import java.util.Scanner;

public class char_at {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string: ");
        String name = sc.nextLine();
        
        System.out.println("Enter the index of the character we want to access: ");
        int index = sc.nextInt();

        char character = name.charAt(index);
        System.out.println("The of the given character in the string is: " + character);
        sc.close();

    }
}
/*
 charat():- This method allows you to access the character of the string.
            By mentioning the index
 */